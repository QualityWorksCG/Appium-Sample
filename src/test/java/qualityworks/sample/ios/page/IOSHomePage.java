package qualityworks.sample.ios.page;

/**
 * Created by Javon Davis on 7/24/17.
 */

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.junit.Assert;

import java.util.Objects;

import static qualityworks.sample.Helpers.back;
import static qualityworks.sample.Helpers.element;

/** Page object for the home page **/
public class IOSHomePage {

    public void clickCounterButton() {
        loaded();
        element(MobileBy.AccessibilityId("Click Counter")).click();
        back();
    }

    /** Verify the home page has loaded **/
    public void loaded() {

        MobileElement headingLabel = element(MobileBy.AccessibilityId("Quality Works Label"));
        Assert.assertTrue(Objects.equals(headingLabel.getAttribute("value"), "Quality Works Appium iOS Sample"));
    }
}
