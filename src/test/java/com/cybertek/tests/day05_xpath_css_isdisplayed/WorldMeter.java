package com.cybertek.tests.day05_xpath_css_isdisplayed;

import com.cybertek.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WorldMeter {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        String url = "https://www.worldometers.info/world-population/";
        driver.get(url);
        Thread.sleep(4000);
        //<divclass="maincounter-number
        WebElement population = driver.findElement(By.xpath("//div[@class='maincounter-number']"));
        System.out.println("Starting popuation: "+ population.getText());
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" Every second: " +population.getText());
            Thread.sleep(1000);
        }


    }
}
/*
Goto https://www.worldometers.info/world-population/
wait 4 seconds
Locate current world population number using relative xpath
loop from 1 to 10
    print the text of the element
    wait 1 second

 */