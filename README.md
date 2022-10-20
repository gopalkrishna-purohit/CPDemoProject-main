# CPDemoProject-main
# Amazon UI Automation Framework
## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [About Test Framework](#about-test-framework)
* [Running Tests](#running-tests)
* [Reporting](#reporting)

## General info
 Outline a brief description of this project.
-Selenium 4 Framework with TestNG, Maven, Extent Reporting.
-  WebSite: https://www.amazon.in
-  Clone the project - git clone https://github.com/gopalkrishna-purohit/CPDemoProject-main.git

## Technologies
Project is created with:
* JAVA Version - jdk1.8.0_291
* Selenum 4
* Maven
* TestNG 
	
## About Test Framework

**Test Package**

`workingDir/src/test/java`

**Main Package**

`workingDir/src/main/java`

**TestNG XML Path:-**

`workingDir/testng.xml`

## Running Tests

**Steps to Configure the project/framework**.

- Clone the project to any location:- `git clone https://github.com/gopalkrishna-purohit/CPDemoProject-main.git`
- Import the project in Intellij/Eclipse.
- Navigate to `workingDir/testng.xml`
- Run the xml as Testng confiuration.

* **You can  below commands from CMD**
* **Same Commands can be configured in CICD tools like Jenkins, TeamCity**

**MAVEN COMMANDS:-**

* mvn clean
* mvn compile
* mvn test


## Reporting

With the Extent, we can create interactive and detailed reports for our UI test results. We can add events, tags, devices, authors or any other relevant information we decide is essential to create an informative and productive report. Test Reports can be found under below paths

* Extent HTML Reporting Path- `src/test/resources/config/extent-test-output

 * 1-Reporting of all the test cases.
 * 2-Can check the error logs.
 * 3-Check the screenshot where the test case is failing.
  
** Extent Reporter Spark for HTML**
 * 1-See the percentage of pass/fail test cases
 * 2-Date/OS/etc. details





  
```
