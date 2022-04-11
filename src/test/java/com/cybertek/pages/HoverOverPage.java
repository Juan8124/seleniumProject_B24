package com.cybertek.pages;

import com.cybertek.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoverOverPage {

    public HoverOverPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//img[@alt='User Avatar'])[1]")
    public WebElement img1;

    @FindBy(xpath = "(//img[@alt='User Avatar'])[2]")
    public WebElement img2;

    @FindBy(xpath = "(//img[@alt='User Avatar'])[3]")
    public WebElement img3;

    @FindBy(xpath = "//h5[contains(text(),'name: user1')]")
    public WebElement img1Text;

    @FindBy(xpath = "//h5[contains(text(),'name: user2')]")
    public WebElement img2Text;

    @FindBy(xpath = "//h5[contains(text(),'name: user3')]")
    public WebElement img3Text;

}
/*
TC #15: Hover Test
1. Go to http://practice.cybertekschool.com/hovers
2. Hover over to first image
3. Assert:
a. “name: user1” is displayed
4. Hover over to second image
5. Assert:
a. “name: user2” is displayed
6. Hover over to third image
7. Confirm:
a. “name: user3” is displayed

 */