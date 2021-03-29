package FrontEndTests;

import FrontEnd.LoginPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

  @Test
  public void testFailedLogin() {
    LoginPage loginPage = homePage.clickLoginPage();

    loginPage.setEmail("ofsomuncu@hotmail.com");
    loginPage.setPasswordField("123456");
    loginPage.clickLoginButton();
    assertTrue(
        loginPage.getAlertText().contains("Username and/or password not correct"),
        "Alert message is correct!");
  }
}
