package com.cybertek.pages;

import com.cybertek.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextClickPage {

    public ContextClickPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='hot-spot']")
    public WebElement squareBox;








}
