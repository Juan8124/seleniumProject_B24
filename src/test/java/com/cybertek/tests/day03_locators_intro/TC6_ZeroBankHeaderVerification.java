package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC6_ZeroBankHeaderVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "http://zero.webappsecurity.com/login.html";
        driver.get(url);

        // System.out.println("Header text:  " + driver.findElement(By.tagName("h3")).getText());
        String header = driver.findElement(By.tagName("h3")).getText();

        System.out.println("header = " + header);

        String expHeader = "Log in to ZeroBank";

        if(header.equals(expHeader)){
            System.out.println("PASS: Header is displayed correctly");
        }else{
            System.out.println("FAIL: Header Mismatch" );
        }

    }
}
/*
TC #1: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”
 */