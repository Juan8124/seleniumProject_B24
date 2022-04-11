package com.cybertek.tests.day04_locators_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://www.google.com";

        driver.get(url);

        // Locate the search field and assign to WebElement variable
        WebElement searchField = driver.findElement(By.name("q"));
        System.out.println("searchField = " + searchField.getAttribute("class"));

        System.out.println("max length = " + searchField.getAttribute("maxlength"));

        searchField.sendKeys("java book");

        // read the value that is in the search field
        System.out.println("current value = " + searchField.getAttribute("value"));

        //print name value of webElement
        System.out.println("name = " + searchField.getAttribute("name"));




    }
}
