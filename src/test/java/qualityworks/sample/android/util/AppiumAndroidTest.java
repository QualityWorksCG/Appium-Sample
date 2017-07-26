package qualityworks.sample.android.util;

import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import qualityworks.sample.android.page.AndroidHomePage;
import qualityworks.sample.Helpers;

import java.net.URL;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Javon Davis on 7/26/17.
 */
public class AppiumAndroidTest {

    private AppiumDriver driver;

    /**
     * Page object references.*
     */
    protected AndroidHomePage home;

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
        home = new AndroidHomePage();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.6.5");
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("deviceName", "emulator-5554");

        // Set job name
        capabilities.setCapability("name", "Quality Works Android Sample" + date);
        String appPath = System.getenv("android_app_path");
        assert appPath != null: "Path to Android app is not set";
        System.out.println("Android App path: "+ appPath);
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