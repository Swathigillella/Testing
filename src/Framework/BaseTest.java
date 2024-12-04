package Framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseTest {
	protected WebDriver driver;
	protected WebDriverWait wait;

    @BeforeMethod
  public void setup() {
    	initializeDriver();

    	driver.manage().window().maximize();
    	//set timeouts
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(ConfigReader.getProperty("implicitWait"))));
    	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(ConfigReader.getProperty("pageLoadTimeout"))));
    	//Set explicit wait
    	wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    	driver.get(ConfigReader.getProperty("baseUrl"));
  }

  private void initializeDriver() {
		String browser=ConfigReader.getProperty("browser");
		switch(browser) {
		case "chrome":WebDriverManager.chromedriver().setup();
		case "firefox":WebDriverManager.firefoxdriver().setup();
		case "edge":WebDriverManager.edgedriver().setup();
		default :    throw new IllegalArgumentException("Incorrect browser",null);

		}

	}

@AfterMethod
  public void tearDown() {
	driver.quit();
  }

}
