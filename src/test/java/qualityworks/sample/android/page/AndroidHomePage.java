package qualityworks.sample.android.page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.junit.Assert;

import java.util.Objects;

import static qualityworks.sample.Helpers.back;
import static qualityworks.sample.Helpers.element;

/**
 * Created by Javon Davis on 7/26/17.
 */
public class AndroidHomePage {

    /** Verify the home page has loaded **/
    public void loaded() {

        MobileElement headingLabel = element(MobileBy.AccessibilityId("Heading"));
        String labelText = headingLabel.getAttribute("text");
        String labelTextCorrect = "Quality Works Appium Android Sample";
        Assert.assertTrue(labelText + " should be " + labelTextCorrect, Objects.equals(labelText, labelTextCorrect));
    }
}
