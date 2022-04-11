package com.cybertek.tests.day19_page_object_model;

import com.cybertek.pages.BookManagementPage;
import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.util.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryLoginPOMTest extends TestBase {

    @Test
    public void invalidCredentialsTest() {

        driver.get(ConfigurationReader.getProperty("libraryLogin.url"));
// create objext of LibraryLoginPage page object class
        LibraryLoginPage loginPage = new LibraryLoginPage();
        // access email WebElement and type the email
        loginPage.email.sendKeys("invlid_email@gmail.com");
        loginPage.password.sendKeys("randomPss");
        loginPage.signInBtn.click();
       // WebElement errorMsg=driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        //not needed no more
        Assert.assertEquals(loginPage.errorMsg.getText(),"Sorry, Wrong Email or Password");
        System.out.println(loginPage.errorMsg.getText());
    }
    @Test
    public void positiveLoginPage(){
        driver.get(ConfigurationReader.getProperty("libraryLogin.url"));
        LibraryLoginPage loginPage = new LibraryLoginPage();
        loginPage.email.sendKeys(ConfigurationReader.getProperty("library3.student.email"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("library3.student.password"));
        loginPage.signInBtn.click();

        BookManagementPage bookManagementPage = new BookManagementPage();
        Assert.assertTrue(bookManagementPage.bookMangHeader.isDisplayed());
        bookManagementPage.isCurrentPage();
    }


}
/*
library.url=https://library3.cybertekschool.com/login.html

add new method:
@Test
public void invalidCredentialsTest() {
    driver.get(ConfigurationReader.getProperty("library.url"));

 */