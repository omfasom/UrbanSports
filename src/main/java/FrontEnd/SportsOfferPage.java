package FrontEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SportsOfferPage {
  private WebDriver driver;
  private By chosenCity = By.id("map_city_select_chosen");

  public SportsOfferPage(WebDriver driver) {
    this.driver = driver;
  }

  public String getChosenCity() {
    return driver.findElement(chosenCity).getText();
  }
}
