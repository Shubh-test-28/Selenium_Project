package shubhamProject.TestComponents;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import shubhamProject.tests.pageobjects.LandingPage;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public LandingPage landingPage;
    public WebDriver initializedriver() throws IOException {
        // properties class

      ;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;

    }
    @BeforeMethod(alwaysRun = true)
    public LandingPage launchApplication() throws IOException
    {

        driver = initializedriver();
        landingPage = new LandingPage(driver);
        landingPage.goTo();
        return landingPage;

    }
    @AfterMethod(alwaysRun = true)
    public void tearDown()
    {
        driver.close();
    }
    }

