package qualityworks.sample.ios;

import org.junit.Test;
import qualityworks.sample.ios.page.HomePage;
import qualityworks.sample.ios.util.AppiumTest;

/**
 * Created by Javon Davis on 7/24/17.
 */
public class QualityWorksLabelTest extends AppiumTest {

    @Test
    public void checkHomeLabel() throws Exception {
        HomePage.loaded();
    }

    @Test
    public void clickCounterButton() throws Exception {
        HomePage.clickCounterButton();
    }
}
