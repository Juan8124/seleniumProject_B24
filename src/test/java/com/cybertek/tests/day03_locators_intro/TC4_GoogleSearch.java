package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://google.com";
        driver.get(url);

        // locate and type "apple" to google search
        driver.findElement(By.name("q")).sendKeys("Apple");

        // locate and click on search button

        driver.findElement(By.name("btnK")).click();

      //  driver.navigate().back();
        Thread.sleep(2000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Apple";

        if (actualTitle.startsWith(expectedTitle)) {
            System.out.println("Passed verification");
        } else {
            System.out.println("Failed verification");
        }


        driver.quit();
    }
}
