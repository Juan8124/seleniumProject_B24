package com.cybertek.pages.edmunds_car;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class EdmundsCarDetailsPage extends BasePage {

    @Override
    public void isCurrentPage() {
        Assert.assertTrue(driver.getTitle().contains("2021 Porsche 911 Prices, Reviews, and Pictures | Edmunds"));
    }

    @FindBy(xpath = "//span[@class='d-inline-block'] ")
    public WebElement msrpRange;

    public String getMrsPRange() {
        return msrpRange.getText();
    }
}
