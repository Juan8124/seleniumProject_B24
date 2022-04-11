package com.cybertek.pages;

import com.cybertek.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllOrdersPage extends SmartBearDashBoardPage {

    // DO i have to put constructor ? no

    // constructor is not inherited however child class has to call Parents class constructor

    @FindBy(id = "ctl00_MainContent_btnDelete")
    public WebElement deletedSelected;


    public void selectCheckBox(String name){
        Driver.getDriver().findElement(By.xpath("//td[.='"+ name +"']/..//input[@type='checkbox']")).click();
    }


}

