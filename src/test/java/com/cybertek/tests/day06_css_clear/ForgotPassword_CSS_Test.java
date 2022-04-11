package com.cybertek.tests.day06_css_clear;

import com.cybertek.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword_CSS_Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        String url = "http://practice.cybertekschool.com/forgot_password";

        driver.manage().window().maximize();
        driver.get(url);

        WebElement emailField = driver.findElement(By.cssSelector("input[name='email']"));
        WebElement retrievePassowrd = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));

        for (int i = 0; i < 100; i++) {
            emailField.sendKeys("jamesBond00" + i + "@gmail.com");
            Thread.sleep(1234);
            emailField.clear();
            retrievePassowrd.click();

        }


    }
}
