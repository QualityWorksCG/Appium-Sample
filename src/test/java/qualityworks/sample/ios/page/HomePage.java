package qualityworks.sample.ios.page;

/**
 * Created by Javon Davis on 7/24/17.
 */

import io.appium.java_client.MobileBy;

import static qualityworks.sample.ios.util.Helpers.element;

/** Page object for the home page **/
public abstract class HomePage {

    /** Verify the home page has loaded **/
    public static void loaded() {
        element(MobileBy.AccessibilityId("Quality Works Label"));
    }
}
