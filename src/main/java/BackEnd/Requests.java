package BackEnd;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import ru.yandex.qatools.allure.annotations.Step;

public class Requests {

  @Step("Get request in order to fetch specific username!")
  public static Response getUserName(String userName) {
    RestAssured.defaultParser = Parser.JSON;
    final String resourcePath = Resources.resource;
    return given()
        .baseUri(resourcePath)
        .param("username", userName)
        .when()
        .get("/users")
        .then()
        .contentType(ContentType.JSON)
        .extract()
        .response();
  }

  @Step("Get request in order to fetch posts from the specific user!")
  public static Response getPosts(int userId) {
    RestAssured.defaultParser = Parser.JSON;
    final String resourcePath = Resources.resource;
    return given()
        .baseUri(resourcePath)
        .param("userId", userId)
        .when()
        .get("/posts")
        .then()
        .contentType(ContentType.JSON)
        .extract()
        .response();
  }

  @Step("Get request in order to fetch comments from the specific post!")
  public static Response fetchComments(int commentId) {
    RestAssured.defaultParser = Parser.JSON;
    final String resourcePath = Resources.resource;
    return given()
        .baseUri(resourcePath)
        .param("id", commentId)
        .when()
        .get("/comments")
        .then()
        .contentType(ContentType.JSON)
        .extract()
        .response();
  }
}
