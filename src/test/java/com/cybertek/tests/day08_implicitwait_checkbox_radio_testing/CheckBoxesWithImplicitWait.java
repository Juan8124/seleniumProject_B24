package com.cybertek.tests.day08_implicitwait_checkbox_radio_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBoxesWithImplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    String url = "http://practice.cybertekschool.com/checkboxes";
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get(url);
//locate first name using name
        WebElement checkbox1 = driver.findElement(By.name("checkbox1"));
        // then click
        checkbox1.click();
        // uncheck second checkbox

        WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='box2']"));
        checkbox2.click();
        if(checkbox2.isSelected()){
            System.out.println("CheckBox 2 is selected");
        }else{
            System.out.println("CheckBox 2 is not selected");
        }

        if(!checkbox1.isSelected()){
            checkbox1.click();
        }

        if(!checkbox2.isSelected()){
            checkbox2.click();
        }
        Thread.sleep(2000);

        if(checkbox2.isSelected()){
            checkbox2.click();
        }

       


    }
}
/*
<input type="checkbox" name="checkbox1" id="box1">
<span class="checktext">Checkbox 1</span>
 */