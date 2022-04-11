package com.cybertek.pages.edmunds_car;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EdmundsNewCarPage extends BasePage {
    @FindBy(name = "select-make")
    public WebElement make;

    @FindBy(name = "select-model")
    public WebElement selectModel;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement goBtn;

    @FindBy(xpath = "//input[@data-tracking-id='new_cars_index_mmy_make_model_tab_zip_code_entry']")
    public WebElement zipCode;


    public void clickGoBtn() {
        goBtn.click();
    }

    public void selectModel(String model) {
        Select dropDown = new Select(selectModel);
        dropDown.selectByVisibleText(model);
    }

    public void selectMake(String carMake) {
        Select makeDropDown = new Select(make);
        makeDropDown.selectByVisibleText(carMake);
    }


    @Override
    public void isCurrentPage() {
        Assert.assertEquals(driver.getTitle(), "New Cars for Sale - Pricing and Deals | Edmunds");

    }
}
