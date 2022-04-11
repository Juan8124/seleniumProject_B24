package com.cybertek.tests.day10_dropdown_alerts_iframes_windows;

import com.cybertek.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleDropDown {

    String url = "http://practice.cybertekschool.com/dropdown";
    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.get(url);

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void verifyDropDown() {

        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        WebElement actualDropdown = driver.findElement(By.xpath("//option[.='Please select an option']"));
        Assert.assertEquals(actualDropdown.getText(), "Please select an option");

        Select dropDown2 = new Select(driver.findElement(By.id("state")));
        WebElement stateSelection = driver.findElement(By.xpath("//option[.='Select a State']"));
        Assert.assertEquals(stateSelection.getText(), "Select a State");
    }

    @Test
    public void selectingStateDropDown() {

        Select dropDown2 = new Select(driver.findElement(By.id("state")));
        driver.findElement(By.xpath("//option[.='Select a State']")).click();
        dropDown2.selectByValue("IL");
        dropDown2.selectByValue("VA");
        dropDown2.selectByValue("CA");

        WebElement cali = driver.findElement(By.xpath("//select[@id='state']/option[.='California']"));
        Assert.assertEquals(cali.getText(), "California");
        System.out.println("Result for states: " + cali.getText());

        for (WebElement h : dropDown2.getOptions()) {
            System.out.println(h.getText());
        }

    }

    @Test
    public void selectDateOfBirth() {

        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("1922");

        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByValue("11");

        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByIndex(0);
    }

    @Test
    public void multipleSelectDropDown() {

        Select languages = new Select(driver.findElement(By.xpath("//select[@name ='Languages']")));
        // languages.selectByVisibleText("Java");
        // languages.selectByVisibleText("JavaScript");
        // languages.isMultiple();


        for (WebElement each : languages.getOptions()) {
            each.click();
            System.out.println(each.getText());
        }
        languages.deselectAll();
    }

    @Test
    public void SelectWebsite() {

        WebElement click = driver.findElement(By.id("dropdownMenuLink"));
        click.click();

        WebElement faceBook = driver.findElement(By.linkText("Facebook"));
        faceBook.click();

        Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
    }


}
/*
TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values 1. Open Chrome browser   //option[.='Please select an option']
2. Go to http://practice.cybertekschool.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State”
TC #2: Selecting state from State dropdown and verifying result 1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index)
TC #3: Selecting date on dropdown and verifying
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown 3. Select “December 1st, 1922” and verify it is selected.
   Select year using Select month using Select day using
: visible text
: value attribute : index number
TC #4: Selecting value from multiple select dropdown
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown 3. Select all the options from multiple select dropdown. 4. Print out all selected values.
5. Deselect all values.
TC #5: Selecting value from non-select dropdown
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown 3. Click to non-select dropdown
4. Select Facebook from dropdown
5. Verify title is “Facebook - Log In or Sign Up”

 */