package com.demo.pages;
import com.demo.ExplicitWaitFactory.ExplicitWaitFactory;
import com.demo.driver.DriverManager;
import org.openqa.selenium.By;

public class BasePage {
    protected void click(By by) {
        ExplicitWaitFactory.explicitWaitForElementToBePresent(by);
        DriverManager.getDriver().findElement(by).click();
    }

    protected void sendKeys(By by, String value) {
        ExplicitWaitFactory.explicitWaitForElementToBeClickable(by);
        DriverManager.getDriver().findElement(by).sendKeys(value);
    }

    protected  String getText(By by){
        ExplicitWaitFactory.explicitWaitForElementToBeClickable(by);
      String value =  DriverManager.getDriver().findElement(by).getText();
       return value;
    }
}
