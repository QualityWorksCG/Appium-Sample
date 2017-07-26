package qualityworks.sample.ios;

import org.junit.Test;
import qualityworks.sample.ios.util.AppiumIOSTest;

/**
 * Created by Javon Davis on 7/24/17.
 */
public class QualityWorksLabelIOSTest extends AppiumIOSTest {

    @Test
    public void checkHomeLabel() throws Exception {
        home.loaded();
    }

    @Test
    public void clickCounterButton() throws Exception {
        home.clickCounterButton();
    }
}
