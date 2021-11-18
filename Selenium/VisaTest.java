// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class VisaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void visa() {
    driver.get("https://phptravels.com/");
    driver.manage().window().setSize(new Dimension(1440, 819));
    driver.findElement(By.linkText("Demo")).click();
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector(".wow:nth-child(2) small:nth-child(1)")).click();
    vars.put("win2586", waitForWindow(2000));
    driver.switchTo().window(vars.get("win2586").toString());
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
    driver.findElement(By.name("password")).sendKeys("demoadmin");
    driver.findElement(By.cssSelector(".btn-lg")).click();
    driver.findElement(By.cssSelector("nav li:nth-child(6) > .waves-effect")).click();
    {
      WebElement element = driver.findElement(By.xpath("//form[@id=\'visa-submit\']/div/div/div/div/div/div/span/span/span/span[2]/b"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("select2-from_country-container"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".select2-search__field")).click();
    driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("India");
    driver.findElement(By.cssSelector(".select2-search__field")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector("#select2-to_country-container")).click();
    driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("Bermuda");
    driver.findElement(By.cssSelector(".select2-search__field")).sendKeys(Keys.ENTER);
    {
      WebElement element = driver.findElement(By.id("submit"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.name("first_name")).click();
    driver.findElement(By.name("first_name")).sendKeys("Prasann");
    driver.findElement(By.name("last_name")).click();
    driver.findElement(By.name("last_name")).sendKeys("Shimpi");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("agent@phptravels.com");
    driver.findElement(By.cssSelector(".col-lg-6:nth-child(6) > .input-box")).click();
    driver.findElement(By.name("phone")).click();
    driver.findElement(By.name("phone")).sendKeys("9075029921");
    {
      WebElement element = driver.findElement(By.id("submit"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.cssSelector(".header-right-action:nth-child(3) #currency")).click();
    driver.findElement(By.linkText("Logout")).click();
  }
}
