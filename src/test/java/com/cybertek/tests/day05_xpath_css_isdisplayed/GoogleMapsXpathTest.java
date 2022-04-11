package com.cybertek.tests.day05_xpath_css_isdisplayed;

import com.cybertek.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMapsXpathTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        String url = "https://www.google.com/maps";
        driver.get(url);
        WebElement addressFeild = driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[3]/div[1]/div[1]/div[1]/div[2]/form/div/div[3]/div/input[1]"));
        addressFeild.sendKeys("Cybertek school" + Keys.ENTER);
        Thread.sleep(8000);
        // click on directions
        WebElement directions = driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[8]/div/div[1]/div/div/div[4]/div[1]/button/span/img"));
        directions.click();
        Thread.sleep(2000);
        WebElement startingAddressField = driver.findElement(By.xpath("//input[@placeholder = 'Choose starting point, or click on the map...']"));
        startingAddressField.sendKeys("red wood california" + Keys.ENTER);

        driver.quit();

    }
}
/*
/html/body/div[3]/div[9]/div[3]/div[1]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div[1]/div/input
Choose starting point, or click on the map...

xpath for above element:
    //input[@placeholder='Choose starting point, or click on the map...']

 */