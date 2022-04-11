package com.cybertek.tests;

import com.cybertek.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CheckingForImage {

    String url = "https://burst.shopify.com/";
    WebDriver driver;


    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    /*
    WebElement ImageFile = driver.findElement(By.xpath("//img[contains(@id,'Test Image')]"));

        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
        if (!ImagePresent)
        {
             System.out.println("Image not displayed.");
        }
        else
        {
            System.out.println("Image displayed.");
     */
//*[@id="image_1423157155"]/div/img



    @Test
    public void imageCheck() {

         WebElement img = driver.findElement(By.xpath("//img[@alt='woman dressed in white leans against a wall']"));
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != undefined && arguments[0].naturalWidth > 0", img);

        if (!ImagePresent) {
            System.out.println("Image is not displayed");
        } else {
            System.out.println("Image is displayed");

        }
        //  Assert.assertTrue(img.isDisplayed());
        Map<String,String> imgs = new HashMap<>();
        imgs.put("alt","woman dressed in white leans against a wall");


    }
}
