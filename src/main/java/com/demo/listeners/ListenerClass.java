package com.demo.listeners;

import com.demo.driver.Driver;
import com.demo.extentReports.ExtentLogger;
import com.demo.extentReports.ExtentReportsTest;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class ListenerClass implements ITestListener, ISuiteListener {




    @Override
    public void onTestStart(ITestResult result) {
//        Driver.initDriver();
        ExtentReportsTest.createTest(result.getMethod().getMethodName());

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getMethod().getMethodName()+" is passed");

    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentLogger.fail(result.getMethod().getMethodName()+" is failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentLogger.skip(result.getMethod().getMethodName()+" is skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ExtentReportsTest.initReports();
    }

    @Override
    public void onFinish(ITestContext context) {
        try {
            ExtentReportsTest.flushReports();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
