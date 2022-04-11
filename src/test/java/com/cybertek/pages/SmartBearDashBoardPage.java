package com.cybertek.pages;

import com.cybertek.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class SmartBearDashBoardPage {

    public SmartBearDashBoardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    public void getLink(String link){
        Driver.getDriver().findElements(By.linkText(link)).clear();
    }





}
