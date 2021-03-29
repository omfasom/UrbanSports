package FrontEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
  private WebDriver driver;
  private By emailField =
      By.xpath("//div[contains(@class,'modal-dialog')]/descendant::input[@id='email']");
  private By passwordField = By.id("password");
  private By loginButton = By.xpath("//div[@id='login-group']/child::input");
  private By statusAlert = By.xpath("//div[contains(@class,'alert-danger')]");

  public LoginPage(WebDriver driver) {
    this.driver = driver;
  }

  public void setEmail(String email) {
    driver.findElement(emailField).sendKeys(email);
  }

  public void setPasswordField(String password) {
    driver.findElement(passwordField).sendKeys(password);
  }

  public void clickLoginButton() {
    driver.findElement(loginButton).click();
  }

  public String getAlertText() {
    return driver.findElement(statusAlert).getText();
  }
}
