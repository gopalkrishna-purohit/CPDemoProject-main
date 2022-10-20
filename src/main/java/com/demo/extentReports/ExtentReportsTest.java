package com.demo.extentReports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.demo.constants.FrameworkConstants;


import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public final class ExtentReportsTest {
    private ExtentReportsTest() {
    }


    private static ExtentReports extent;

    public static ExtentTest test;

    public static void initReports() {
        if (Objects.isNull(extent)) {
            extent = new com.aventstack.extentreports.ExtentReports();
            ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getExtentReportPath());
            extent.attachReporter(spark);
            spark.config().setTheme(Theme.DARK);
            spark.config().setDocumentTitle("Automation Report");
            spark.config().setReportName("Demo Project");

        }
    }

    public static void flushReports() throws IOException {
        if (Objects.nonNull(extent)) {
            extent.flush();
        }
//        Desktop.getDesktop().browse(new File("index.html").toURI());
    }

    public static void createTest(String testName) {
        test = extent.createTest(testName);


    }

}
