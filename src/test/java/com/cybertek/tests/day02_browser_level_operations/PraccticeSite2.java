package com.cybertek.tests.day02_browser_level_operations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PraccticeSite2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // make browser full screen/maximize
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");

        String currentUrl = driver.getCurrentUrl();
        String title = driver.getTitle();

      if(currentUrl.contains("cybertekschool")){
          System.out.println("test pass");
      }else {
          System.out.println("test fail");
      }

      if(title.equalsIgnoreCase("Practice")){
          System.out.println("Title verification Pass");
      }else{
          System.out.println("FAIL Title Verification");
      }

      Thread.sleep(3000);
        driver.quit();

    }
}
