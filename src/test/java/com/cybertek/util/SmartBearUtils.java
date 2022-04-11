package com.cybertek.util;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SmartBearUtils {
    /*
    Method will  log into smart bear
     */
    public static void loginToSmartUtils(WebDriver driver) {

        WebElement UserName = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement Password = driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement Login = driver.findElement(By.id("ctl00_MainContent_login_button"));

        UserName.sendKeys("Tester");
        Password.sendKeys("test");
        Login.click();

        Assert.assertEquals(driver.getTitle(), "Web Orders", "Failed to login");

    }

    public static void appProduct(WebDriver driver) {
        Faker faker = new Faker();
        // add selenium steps for adding the a new order
        WebElement clickOrder = driver.findElement(By.xpath("//a[.='Order']"));
        clickOrder.click();

        Select product = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        product.selectByIndex(1);

        WebElement quantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.sendKeys("2");

        WebElement calculate = driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculate.click();

        WebElement name = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        name.sendKeys(faker.name().fullName());

        WebElement street = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        street.sendKeys(faker.address().streetName());

        WebElement city = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        city.sendKeys(faker.address().cityName());

        WebElement state = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        state.sendKeys(faker.address().state());

        WebElement zipCode = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
        zipCode.sendKeys(faker.address().zipCode().replace("-",""));

        WebElement card = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        card.click();

        WebElement cardNumber = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        cardNumber.sendKeys(faker.finance().creditCard().replace("-",""));

        WebElement expDate = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        expDate.sendKeys("11/40");

        WebElement process = driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        process.click();

       WebElement text = driver.findElement(By.xpath("//strong[contains(text(),'New order has been successfully added.')]"));
        System.out.println("Expected text: " + text.getText());
        Assert.assertEquals(text.getText(),"New order has been successfully added.");
    }


}
/*
Click on Order *
7. Select familyAlbum from product, set quantity to 2*
8. Click to “Calculate” button*
9. Fill address Info with JavaFaker
• Generate: name, street, city, state, zip code*
10. Click on “visa” radio button
11. Generate card number using JavaFaker
12. Click on “Process”
13. Verify success message “New order has been successfully added.”

 */
/*
Mini-Task: CREATE A CLASS à SmartBearUtils
• Create a method called loginToSmartBear
• This method simply logs in to SmartBear when you call it.
• Accepts WebDriver type as parameter

 */