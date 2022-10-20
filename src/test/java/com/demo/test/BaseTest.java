package com.demo.test;

import com.demo.driver.Driver;
import com.demo.extentReports.ExtentReportsTest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class BaseTest {
    protected BaseTest() {
    }



    @BeforeMethod
    protected void setup() throws MalformedURLException {
        Driver.initDriver();
    }

    @AfterMethod
    protected void tearDown() {


        Driver.quitDriver();
    }

}
