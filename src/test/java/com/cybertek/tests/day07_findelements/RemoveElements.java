package com.cybertek.tests.day07_findelements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RemoveElements {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String appUrl = " http://practice.cybertekschool.com/add_remove_elements/";
        driver.get(appUrl);
// locate and click addElement buttun 50 times
        WebElement button = driver.findElement(By.xpath("//button[.='Add Element']"));

        for (int i = 0; i < 50; i++) {
            button.click();
        }
// verify 50 delete buttons are on the page
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//button[.='Delete']"));

        System.out.println("Count of deleteButtons = " + deleteButtons.size());
        if (deleteButtons.size() == 50) {
            System.out.println("Pass: 50 buttons displayed successfully");
        } else {
            System.out.println("Fail: Cannot display buttons correctly");
        }
        Thread.sleep(2000);
//click all delete buttons to remove them
        for (WebElement del : deleteButtons) {
            del.click();
        }
        // for each method with lambda epression
        //    deleteButtons.forEach(e -> e.click());

        if (deleteButtons.isEmpty()) {
            System.out.println("pass: all 50 buttons deleted successfully");
        } else {
            System.out.println("fail: could not delete all 50 buttons");
        }

    }
}
/*
TC #3: PracticeCybertek.com_AddRemoveElements WebElement verification
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/add_remove_elements
3. Click to “Add Element” button 50 times
4. Verify 50 “Delete” button is displayed after clicking.
5. Click to ALL “Delete” buttons to delete them.
6. Verify “Delete” button is NOT displayed after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
Hint: Need to use findElements method.
 */