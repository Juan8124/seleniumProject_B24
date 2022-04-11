package com.cybertek.tests.day04_locators_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PercentageCalculatorTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://www.calculator.net/";
        driver.get(url);

        driver.findElement(By.linkText("Percentage Calculator")).click();

        String expectedTitle = "Percentage Calculator";
        String actualTitle = driver.getTitle();

        System.out.println("Expected title-- " + driver.getTitle());

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Pass title verification: " + driver.getTitle());
        } else {
            System.out.println("Fail title verification");
        }

        driver.findElement(By.name("cpar1")).sendKeys("20");
        Thread.sleep(3000);
        driver.findElement(By.id("cpar2")).sendKeys("120000", Keys.ENTER);

// read the result and assign to variable
        String result = driver.findElement(By.className("h2result")).getText();
        System.out.println("Result: " + result);

        if (result.endsWith("24000")) {
            System.out.println("Pass: calculation is correct");
        } else {
            System.out.println("Fail: calculation is incorrect");
        }

        Thread.sleep(10000);
        driver.quit();


    }
}
/*
Main method:
    - launch browser, maximize
    - navigate to https://www.calculator.net/
    - Click on Percentage Calculator
    - Verify current title is "Percentage Calculator"
    - Enter 20% of and click enter (using Keys.ENTER)
    - Print the result "Result: 24000"
    - close browser
-------------------------------------

 */