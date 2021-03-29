package FrontEndTests;

import static org.testng.Assert.assertTrue;

import FrontEnd.SportsOfferPage;
import org.testng.annotations.Test;

public class SportsOfferTests extends BaseTests {

  @Test
  public void testChosenCity() {
    SportsOfferPage sportsOfferPage = homePage.clickSportsOfferPage();
    assertTrue(sportsOfferPage.getChosenCity().contains("Berlin"), "chosen city is correct!");
  }
}
