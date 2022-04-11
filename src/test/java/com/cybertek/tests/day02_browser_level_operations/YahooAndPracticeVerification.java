package com.cybertek.tests.day02_browser_level_operations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooAndPracticeVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        // expected tittle Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com");
       String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
       String actualTitle = driver.getTitle();

if(expectedTitle.equals(actualTitle)){
    System.out.println("pass verification");
}else{
    System.out.println("fail verification");
}
Thread.sleep(2000);
driver.quit();


    }
}
/*
TC #1: Yahoo Title Verification
1. Open Chrome browser
2. Go to https://www.yahoo.com/
3. Verify title:
Expected: Yahoo
TC #2: Cybertek practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cybertekschool.com/
3. Verify URL contains
Expected: cybertekschool
4. Verify title:
 Expected: Practice
 */