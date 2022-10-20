package com.demo.pages;

import com.demo.extentReports.ExtentLogger;
import org.openqa.selenium.By;

import static helper.Helper.*;
/**@author Gaurav
 * Class file is related to maintain the POM for Amazon Page
 */
public class AmazonPage extends BasePage {
    public final By findAllMenu = By.xpath("//a[@aria-label='Open Menu']");
    public final By shopByDepartment = By.xpath("//div[normalize-space()='TV, Appliances, Electronics']");
    public final By shopByDepartmentConfirmation = By.xpath("//div[normalize-space()='shop by category']//following::div[text()='TV, Appliances, Electronics']");
    public final By BrandSamsung = By.xpath("//*[text()='Brands']//following::span[text()='Samsung']");
    public final By televisions = By.xpath("//a[normalize-space()='Televisions']");
    public final By dropDown = By.xpath("//span[@id='a-autoid-0-announce']/span[2]");

    public final By secondHighestTV = By.xpath("(//*[@class='a-size-base-plus a-color-base a-text-normal'])[2]");
    public final By tvSelection = By.xpath("//div[@id='a-popover-2']/div/div/ul/li[*]/a");
    public final By aboutThisItemTextValidation = By.xpath("//h1[normalize-space()='About this item']");

    public AmazonPage clickOnHamburgerMenu() {

        click(findAllMenu);
        ExtentLogger.pass("Clicked on the Hamburger Menu");

        return this;
    }


    public String shopByDepartmentConfirmationMethod() {
        return getText(shopByDepartmentConfirmation);
    }

    public AmazonPage clickOnShopByDepartment() {
        click(shopByDepartmentConfirmation);
        ExtentLogger.pass("Clicked on the Shop By Department");
        return this;
    }

    public String confirmTelevisionsText() {
        ExtentLogger.pass("Extract the text ofTelevisions Section");
        return getText(televisions);

    }

    public AmazonPage clickOnTelevisions() {
        ExtentLogger.pass("Clicked on ofTelevisions Section");
        click(televisions);
        return this;
    }

    public AmazonPage selectBrand() {
        ExtentLogger.pass("Selected the Brand");
        click(BrandSamsung);
        return this;
    }

    public AmazonPage clickOnDropDown() {
        ExtentLogger.pass("Clicked on Price High to Low Dropdown Menu");
        click(dropDown);

        return this;
    }

    public AmazonPage selectOption() {
        fetchMultipleItemsAndClick("Price: High to Low", tvSelection);
        ExtentLogger.pass("Clicked on Price High to Low Dropdown Menu" + "Extracted Menu Price Item");

        return this;
    }

    public AmazonPage clickOnSecondHighestTVItem() {
        ExtentLogger.pass("Clicked on the second Highest TV");
        click(secondHighestTV);
        return this;
    }

    public String aboutThisItemTextVal() {
        switchToWindowByTitle();
        ExtentLogger.pass("Switched the tab and Print the value for clicked TV :- " + getText(aboutThisItemTextValidation));
        return getText(aboutThisItemTextValidation);

    }

}
