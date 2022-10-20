package com.demo.listeners;

import org.testng.annotations.*;

public class Runner {

    @BeforeSuite
    public void setUpSuite() {

        System.out.println("setUpSuite");


    }

    @BeforeMethod
    public void setup() {

        System.out.println("setup");
    }


    @Test
    public void test1() {
        System.out.println("test1");

    }


    @AfterSuite
    public void tearDownSuite() {
        System.out.println("tearDownSuite");

    }


    @AfterMethod
    public void tearDown() {

        System.out.println("tearDown");
    }


}
