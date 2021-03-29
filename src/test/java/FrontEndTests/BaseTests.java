package FrontEndTests;

import FrontEnd.HomePage;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTests {

  private WebDriver driver;
  protected HomePage homePage;

  @BeforeClass
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    goHome();
  }

  @BeforeMethod
  public void goHome() {
    driver.get("https://urbansportsclub.com/en");
    homePage = new HomePage(driver);
  }

  @AfterClass
  public void tearDown() {
    driver.quit();
  }
}
