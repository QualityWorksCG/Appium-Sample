package qualityworks.sample.ios.page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import qualityworks.sample.Helpers;

import java.util.Objects;

import static qualityworks.sample.Helpers.back;
import static qualityworks.sample.Helpers.element;
import static qualityworks.sample.Helpers.fileDetector;

/**
 * Page Object for the Work Location Page
 * Created by Javon Davis on 7/27/17.
 */
public class IOSWorkLocationPage {

    private String heyThereAccessibilityIdentifier = "Hey There";
    private String questionLabelAccessibilityIdentifier = "Where do you work";
    private String workplaceAccessibilityIdentifier = "Workplace";
    private String submitAccessibilityIdentifier = "Submit";
    private String feedbackAccessibilityIdentifier = "Feedback";

    public void enterWorkLocation(String location) {
        MobileElement workplaceTextField = element(MobileBy.AccessibilityId(workplaceAccessibilityIdentifier));
        workplaceTextField.click();
        workplaceTextField.setFileDetector(fileDetector()); // Needed to send data to the remote
        workplaceTextField.sendKeys(location);
    }

    public void clickSubmit() {
        MobileElement submitButton = element(MobileBy.AccessibilityId(submitAccessibilityIdentifier));
        submitButton.click();
    }


    public void loaded() {
        MobileElement heyThereLabel = element(MobileBy.AccessibilityId(heyThereAccessibilityIdentifier));
        MobileElement questionLabel = element(MobileBy.AccessibilityId(questionLabelAccessibilityIdentifier));
    }
}
