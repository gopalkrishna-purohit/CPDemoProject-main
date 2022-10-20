package com.demo.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

/** Driver class is opening and closing the browsers. Also setting the driver instance.
 * 30-Sep-2022
 * @author Gaurav Singh
 * @version 1.0
 * @see DriverManager
 *
 *
 */
public final class Driver {
    /**
     * Using private constructor to avoid external instantiation
     */

    private Driver() {


    }


@Test
    public static void initDriver() throws MalformedURLException {
        if (Objects.isNull(DriverManager.getDriver())) {
            WebDriverManager.chromedriver().setup();
            DriverManager.setDriver(new ChromeDriver());
            DriverManager.getDriver().manage().window().maximize();

//            DesiredCapabilities des = new DesiredCapabilities();
//            des.setBrowserName(BrowserType.FIREFOX);
//
//            WebDriver driver = new RemoteWebDriver(new URL("http://172.17.0.6:4444"),des);
//
//            driver.get("https://www.google.com");
//        System.out.println("print the title"+ driver.getTitle());
//driver.quit();



        }
    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }

    }
}
