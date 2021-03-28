import static BackEnd.Helpers.emailValidation;
import static BackEnd.Helpers.fetchId;
import static BackEnd.Helpers.verifyStatusCode;
import static BackEnd.Helpers.verifyUsername;

import BackEnd.Requests;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;

public class APITest {

  @Test
  @Description("Create Workflow")
  public void testCreatingWorkflow() {
    // Get Username
    Response response =
        Requests.getUserName(
            "Delphine");
    verifyStatusCode(response, 200);
    //Verify Username
    verifyUsername(response);
    //fetch id
    final int userId = fetchId(response);
    //get all posts from fetched id
    response =
        Requests.getPosts(userId);
    verifyStatusCode(response, 200);
    //email validation
    emailValidation(response);
  }
}
