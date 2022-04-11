package com.cybertek.tests.day08_implicitwait_checkbox_radio_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EtsyHomePage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        String url ="https://www.etsy.com/";
        driver.get(url);

        WebElement search = driver.findElement(By.xpath("//input[@name='search_query']"));
        search.sendKeys("Wooden spoon" + Keys.ENTER);

        WebElement filters = driver.findElement(By.xpath("//span[.='All Filters']"));
        WebElement freeShipping = driver.findElement(By.xpath("//label[@for='special-offers-free-shipping']"));
        WebElement onSale = driver.findElement(By.xpath("//label[@for='special-offers-on-sale']"));
        WebElement under25 = driver.findElement(By.xpath("//label[@for='price-input-1']"));
        WebElement apply = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--primary wt-width-full wt-mt-xs-3 wt-mb-xs-3 wt-mr-xs-3']"));

        filters.click();
        freeShipping.click();
        onSale.click();
        under25.click();
        apply.click();

        Thread.sleep(1000);

        WebElement reuslts = driver.findElement(By.xpath("//span[@class='wt-display-inline-flex-sm']"));
        System.out.println("Result of search: " + reuslts.getText());

    }
}
/*
Launch Browser and goto etsy homepage
search for wooden spoon
click on filters
Select free shipping, on sale
select under $25
Click on apply filters
Print count of results
 */