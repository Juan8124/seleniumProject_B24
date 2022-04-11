package com.cybertek.pages;

import com.cybertek.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WaitUntilVisibleElemPage {

    public WaitUntilVisibleElemPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Click me to start timer']")
    public WebElement clickTimer;

    //"//*[contains(text(), 'my text')]"
    @FindBy(xpath = "//*[contains(text(),'WebDriver')]")
    public WebElement webDriverMSG;

    @FindBy(xpath = "//span[.='Go']")
public WebElement goBtn;
}
