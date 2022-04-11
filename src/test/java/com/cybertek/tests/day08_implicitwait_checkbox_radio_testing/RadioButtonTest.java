package com.cybertek.tests.day08_implicitwait_checkbox_radio_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButtonTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        String url = "http://practice.cybertekschool.com/radio_buttons";
        //wait up to 10 seconds while finding element
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);

        WebElement colorRedButton = driver.findElement(By.id("red"));
        if (!colorRedButton.isSelected()) {
            colorRedButton.click();
        }

        WebElement footBall = driver.findElement(By.xpath("//input[@id='football']"));

        if (!footBall.isSelected()) {
            System.out.println("SELECTING <FOOTBALL> RADIO BUTTON");
            footBall.click();
        }

        // check if football option is selected

        if (footBall.isSelected()) {
            System.out.println("pass football is selected");
        } else {
            System.out.println("fail football is not selected");
        }

        if (footBall.isDisplayed()) {
            System.out.println("football is displayed");
        } else {
            System.out.println("football is not displayed");
        }
// find all radio buttons and print the count
        List<WebElement> radioButton = driver.findElements(By.xpath("//input[@type='radio']"));

        System.out.println("Count of radio buttons: " + radioButton.size());

        for (WebElement each : radioButton) {
            each.click();
            Thread.sleep(1000);
        }


    }
}
