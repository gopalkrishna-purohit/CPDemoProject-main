package com.demo.test;
import com.demo.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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
