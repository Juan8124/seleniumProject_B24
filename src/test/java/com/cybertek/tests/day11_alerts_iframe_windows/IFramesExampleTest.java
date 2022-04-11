package com.cybertek.tests.day11_alerts_iframe_windows;

import com.cybertek.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IFramesExampleTest {

    String url = "http://practice.cybertekschool.com/nested_frames";
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get(url);
    }


    @Test
    public void multipleFramesTest(){
// find out count fo frames on this page
        List<WebElement> frameCount = driver.findElements(By.xpath("//frame"));
        System.out.println("Count of frames " + frameCount.size());

        driver.switchTo().frame("frame-bottom");

        WebElement bottom = driver.findElement(By.tagName("body"));
        System.out.println("Text of bottom frame " + bottom.getText());

        driver.switchTo().defaultContent();
        // switch to first  frame
        driver.switchTo().frame(0).switchTo().frame(0);

        bottom = driver.findElement(By.tagName("body"));
        System.out.println("Frame zero: " + bottom.getText());

// go back to parent frame locate thrids child frame using webElement
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        driver.switchTo().frame(0).switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_right']")));

        bottom = driver.findElement(By.tagName("body"));
        System.out.println("Frame zero: " + bottom.getText());





    }

}






/*
 @Test
    public void iFrameTest() {
        // switch to the frame

        driver.switchTo().frame("mce_0_ifr");
        // now we are focused on the frame

        WebElement commentField = driver.findElement(By.id("tinymce"));
        commentField.clear();
        commentField.sendKeys(" the world is a very nice place with java in it :)");
        System.out.println(commentField.getText());
// go out from iframe back into main content
        driver.switchTo().defaultContent();
    }

 */