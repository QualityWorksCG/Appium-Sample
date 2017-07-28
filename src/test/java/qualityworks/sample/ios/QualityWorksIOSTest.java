package qualityworks.sample.ios;

import io.appium.java_client.MobileBy;
import org.junit.Test;
import qualityworks.sample.ios.util.AppiumIOSTest;

/**
 * Created by Javon Davis on 7/24/17.
 */
public class QualityWorksIOSTest extends AppiumIOSTest {

    @Test
    public void checkHomeLabel() throws Exception {
        home.loaded();
    }

    @Test
    public void clickCounterButton() throws Exception {
        home.clickCounterButton();
    }

    @Test
    public void workLocationsTest() throws Exception {
        home.loaded();
        home.clickWorkLocationButton();
        workLocation.loaded();
        workLocation.enterWorkLocation("Quality Works");
        workLocation.clickSubmit();
        wait(MobileBy.AccessibilityId("Feedback"));
    }

    @Test
    public void clickCounterTest() throws Exception {
        home.loaded();
        home.clickCounterButton();
        clickCounter.loaded();
        for(int i = 0; i < 5; i ++)
            clickCounter.clickIncreaseButton();

        for(int i = 0; i < 3; i ++)
            clickCounter.clickDecreaseButton();

    }
}
