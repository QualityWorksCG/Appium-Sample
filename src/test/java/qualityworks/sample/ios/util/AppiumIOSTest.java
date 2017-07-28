package qualityworks.sample.ios.util;

import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.FileDetector;
import qualityworks.sample.Helpers;
import qualityworks.sample.ios.page.IOSClickCounterPage;
import qualityworks.sample.ios.page.IOSHomePage;
import qualityworks.sample.ios.page.IOSWorkLocationPage;

import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Javon Davis on 7/24/17.
 */
public class AppiumIOSTest {

    private AppiumDriver driver;

    /**
     * Page object references.*
     */
    protected IOSHomePage home;
    protected IOSClickCounterPage clickCounter;
    protected IOSWorkLocationPage workLocation;

    /**
     * wait wraps Helpers.wait *
     */
    public static WebElement wait(By locator) {
        return Helpers.wait(locator);
    }

    /**
     * Keep the same date prefix to identify job sets. *
     */
    private static final Date date = new Date();

    /**
     * Run before each test *
     */
    @Before
    public void setUp() throws Exception {

        home = new IOSHomePage();
        workLocation = new IOSWorkLocationPage();
        clickCounter = new IOSClickCounterPage();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.6.5");
        capabilities.setCapability("platformVersion", "10.3");
        capabilities.setCapability("platformName", "ios");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("deviceName", "iPhone Simulator");

        // Set job name
        capabilities.setCapability("name", "Quality Works iOS Sample" + date);

        String appPath = System.getenv("ios_app_path");
        assert appPath != null: "Path to iOS app is not set";
        System.out.println("iOS App path: "+ appPath);
        capabilities.setCapability("app", appPath);
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Helpers.init(driver);
    }

    /**
     * Run after each test *
     */
    @After
    public void tearDown() throws Exception {
        if (driver != null) driver.quit();
    }

}