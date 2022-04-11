package com.cybertek.pages;

import com.cybertek.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "inputEmail")
    public WebElement email; //email =driver.findElement(By.id("inputEmail"))s

    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInBtn;
    //        WebElement errorMsg=driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement errorMsg;

}
