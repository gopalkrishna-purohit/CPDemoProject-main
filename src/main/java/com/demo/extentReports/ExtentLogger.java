package com.demo.extentReports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.demo.driver.DriverManager;
import com.demo.enums.PropertiesUtils;
import com.demo.utils.PropertyFile;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ExtentLogger {
    private ExtentLogger() {
    }


    public static void skip(String message) {


        ExtentReportsTest.test.skip(message, MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Image()).build());


    }

    public static void fail(String message) {


        ExtentReportsTest.test.fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Image()).build());


    }

    public static void pass(String message) {


        ExtentReportsTest.test.pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Image()).build());


    }


    public static String getBase64Image() {

        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
    }


}
