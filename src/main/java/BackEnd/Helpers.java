package BackEnd;

import static BackEnd.Requests.fetchComments;
import static CommonFiles.Logger.logInfo;
import static org.testng.Assert.assertTrue;

import io.restassured.response.Response;
import java.util.List;
import org.testng.Assert;

public class Helpers {

  public static void verifyStatusCode(Response response, int expectedStatusCode) {
    int statusCode = response.getStatusCode();
    Assert.assertEquals(statusCode, expectedStatusCode, "User fetch successfully!");
  }
  /**
   * This method fetch username from response and validate if user name is correct
   *
   * @param response
   */
  public static void verifyUsername(Response response) {
    assertTrue(response.jsonPath().getString("username[0]").equalsIgnoreCase("Delphine"));
    logInfo("Username is correct!");
  }

  public static int fetchId(Response response) {
    return response.jsonPath().get("id[0]");
  }

  public static void emailValidation(Response response) {
    List<Integer> commentList = response.jsonPath().getList("id");
    for (int i = 0; i < commentList.size(); i++) {
      int commentId = commentList.get(i);
      response = fetchComments(commentId);
      String emailId = response.jsonPath().getString("email[0]");
      isValidEmailAddress(emailId);
      logInfo("EmailId format is correct!");
    }
  }

  public static boolean isValidEmailAddress(String email) {
    String ePattern =
        "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
    java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
    java.util.regex.Matcher m = p.matcher(email);
    return m.matches();
  }
}
