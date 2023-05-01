package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;

    @BeforeTest
    public void setup() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://candymapper.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @AfterTest
    public void close() {

        driver.close();
    }
}

