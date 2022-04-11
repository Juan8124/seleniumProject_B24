package com.cybertek.pages.edmunds_car;

import com.cybertek.util.ConfigurationReader;
import org.testng.Assert;

public class EdmundsHomePage extends BasePage {


    @Override
    public void isCurrentPage() {
        driver.get(ConfigurationReader.getProperty("edmunds.url"));
        Assert.assertEquals(driver.getTitle(),"New Cars, Used Cars, Car Reviews and Pricing | Edmunds");
    }
}
