package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_ClickGmailVerifyTitle {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = ("https://google.com");
        driver.get(url);
        Thread.sleep(3000);

        driver.findElement(By.linkText("Gmail")).click();
      //  driver.findElement(By.partialLinkText("")).click();
// verify title contains /starts with gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Pass: gmail title verification successful");
        } else {
            System.out.println("Fail gmail title verification unsuccessful");
        }

        Thread.sleep(1000);
        driver.navigate().back();
        String expectedTitle2 = "Google";
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.equals(expectedTitle2)) {
            System.out.println("Pass: Google title verification successful");
        } else {
            System.out.println("Fail Google title verification unsuccessful");
        }


        Thread.sleep(2000);
        driver.quit();

    }
}
