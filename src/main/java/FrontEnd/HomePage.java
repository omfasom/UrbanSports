package FrontEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
  private WebDriver driver;

  public HomePage(WebDriver driver) {
    this.driver = driver;
  }

  public LoginPage clickLoginPage() {
    clickXpath("//a[contains(@class,'login')]");
    return new LoginPage(driver);
  }

  public SportsOfferPage clickSportsOfferPage() {
    clickXpath("//li[@class='smm-header__menu-item']/child::a[contains(text(),'Sports Offer')]");
    return new SportsOfferPage(driver);
  }

  private void clickXpath(String xpathText) {
    driver.findElement(By.xpath(xpathText)).click();
  }
}
