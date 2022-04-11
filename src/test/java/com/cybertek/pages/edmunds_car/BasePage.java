package com.cybertek.pages.edmunds_car;
/*
this class is parent class for all page object classes
 */

import com.cybertek.util.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    // webdriver variable just in case of childern need
    protected WebDriver driver;

    @FindBy(xpath = "//img[@alt='Home']")
    public WebElement edmundsLogo;

    @FindBy(linkText = "New Car Pricing")
    public WebElement newCarPricingLink;


    public BasePage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void gotToNewCarPricingPage() {
        newCarPricingLink.click();
    }
/*
abstract method to be implemented by child Object classes
This is to verify that we are at the correct page
using title of the page or anything other
 */
    public abstract void isCurrentPage();


}
