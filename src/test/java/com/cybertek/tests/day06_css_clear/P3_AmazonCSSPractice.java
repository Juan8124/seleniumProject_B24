package com.cybertek.tests.day06_css_clear;

import com.cybertek.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_AmazonCSSPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        String appUrl = " https://www.amazon.com/";
        driver.manage().window().maximize();
        driver.get(appUrl);
        Thread.sleep(3000);
        WebElement searchField = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        WebElement searchButton = driver.findElement(By.cssSelector("input[id='nav-search-submit-button'"));
        searchField.sendKeys("wooden spoon");
        searchButton.click();

        searchField = driver.findElement(By.cssSelector("input[name='field-keywords'])"));
        searchButton = driver.findElement(By.cssSelector("input[type='submit'"));




//driver.findElement(By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']")).click();

        searchField.clear();






/*
<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">
 */


    }
}
/*
CSS Practice
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #3: Amazon link number verification
1. Open Chrome browser
2. Go to https://www.amazon.com/
3. Enter search term (use cssSelector to locate search box)
4. Verify title contains search term
 */
/*
System.out.println(driver.getTitle());

        String title = driver.getTitle();

        String expectedTitle = "term";

        if (title.contains(expectedTitle)) {
            System.out.println("Expected title matches");
        } else {
            System.out.println("Title does not match");
        }
 */