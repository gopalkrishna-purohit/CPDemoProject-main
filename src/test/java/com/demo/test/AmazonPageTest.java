package com.demo.test;
import com.demo.driver.DriverManager;
import com.demo.enums.PropertiesUtils;
import com.demo.pages.AmazonPage;
import com.demo.utils.PropertyFile;
import helper.Helper;
import org.testng.annotations.Test;

public  class AmazonPageTest extends BaseTest {
    private AmazonPageTest() {
    }

    @Test
    public void SearchGoogleText()  {
        DriverManager.getDriver().get(PropertyFile.getValue(PropertiesUtils.URL));
        AmazonPage page = new AmazonPage();
        page.clickOnHamburgerMenu();
        Helper.textVerification(page.shopByDepartmentConfirmationMethod(), "TV, Appliances, Electronics");
        page.clickOnShopByDepartment();
        Helper.textVerification(page.confirmTelevisionsText(), "Televisions");
        page.clickOnTelevisions().selectBrand().clickOnDropDown().selectOption().clickOnSecondHighestTVItem();
        Helper.textVerification(page.aboutThisItemTextVal(), "About this item");
    }
}
