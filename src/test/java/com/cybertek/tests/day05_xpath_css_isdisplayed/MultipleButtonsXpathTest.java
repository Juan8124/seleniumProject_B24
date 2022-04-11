package com.cybertek.tests.day05_xpath_css_isdisplayed;

import com.cybertek.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleButtonsXpathTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        String url = "http://practice.cybertekschool.com/multiple_buttons";
        driver.get(url);
//<button class="btn btn-primary" onclick="button1()">Button 1</button>
        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();
//<p id="result" style="color:green">Clicked on button one!</p>
        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
        System.out.println(result.getText());
        Thread.sleep(2000);
        //Locate button2 using xpath and check if it is currently displayed on the page
        //<button class="btn btn-primary" onclick="button2()" name="button2">Button 2</button>
        WebElement button2 = driver.findElement(By.xpath("//button[.='Button 2']"));
        if (button2.isDisplayed()) {
            System.out.println("Pass button2 is displayed");
        } else {
            System.out.println("Fail button2 is not displayed");
        }
        button2.click();


    }
}
/*
"//div[@class='maincounter-number']"
TC #6: XPATH LOCATOR practice
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/multiple_buttons
3. Click on Button 1
4. Verify text displayed is as expected:
Expected: “Clicked on button one!”
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */