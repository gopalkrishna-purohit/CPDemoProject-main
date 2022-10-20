package com.demo.ExplicitWaitFactory;
import com.demo.constants.FrameworkConstants;
import com.demo.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitFactory {
    public static void explicitWaitForElementToBeClickable(By by) {
        new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitWait())
                .until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void explicitWaitForElementToBePresent(By by) {
        new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitWait())
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
