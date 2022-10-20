package helper;

import com.demo.ExplicitWaitFactory.ExplicitWaitFactory;
import com.demo.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Helper {


    public static void textVerification(String actual, String expected) {

        try {
            Assert.assertEquals(actual, expected);
        } catch (
                Exception e) {

            System.out.println("The text is not matching");
        }

    }

    public static void switchToWindowByTitle() {

        try {

            for (int i = 0; i <= 10; i++) {

                if (DriverManager.getDriver().getWindowHandles().size() != 1) {

                    break;
                } else {
                    Thread.sleep(2000);
                }
            }

            String mostRecentWindowHandle;
            for (String winHandle : DriverManager.getDriver().getWindowHandles()) {

                mostRecentWindowHandle = winHandle;
                DriverManager.getDriver().switchTo().window(mostRecentWindowHandle);
                JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
                js.executeScript("window.focus();");

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void fetchMultipleItemsAndClick(String textToClick, By by) {

        List<WebElement> verifyDropdownText = DriverManager.getDriver().findElements(by);
        for (WebElement fetchedTextList : verifyDropdownText) {
            System.out.println("the visible text" + fetchedTextList.getText());
            if (fetchedTextList.getText().equalsIgnoreCase(textToClick)) {
                fetchedTextList.click();

                break;
            }
        }


    }

    public static void click(By by) {
        ExplicitWaitFactory.explicitWaitForElementToBePresent(by);
        DriverManager.getDriver().findElement(by).click();
    }

    protected void sendKeys(By by, String value) {
        ExplicitWaitFactory.explicitWaitForElementToBeClickable(by);
        DriverManager.getDriver().findElement(by).sendKeys(value);
    }

    public static String getText(By by){
        ExplicitWaitFactory.explicitWaitForElementToBeClickable(by);
        String value =  DriverManager.getDriver().findElement(by).getText();
        return value;
    }
}
