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

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonDepartmentsNamesListTest {

    String url = "https://amazon.com";
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);

    }
    @AfterMethod
    public void cleanUp() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void amazonDepartmentTest() throws InterruptedException {
        String expTitle="Amazon.com. Spend less. Smile more.";
        Assert.assertEquals(driver.getTitle(),expTitle);

        Select departments = new Select(driver.findElement(By.id("searchDropdownBox")));
        String selectedOption = departments.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOption,"All Departments");

        List<WebElement> allDep = departments.getOptions();
        System.out.println("All Options: "+allDep.size());
        for(WebElement options: allDep){
            System.out.println(options.getText());
        }
        // select each item by order and wait 400ms inbetween
        for(WebElement dept: allDep){
            departments.selectByVisibleText(dept.getText());
            Thread.sleep(100);

        }

    }
    @Test
    public void runMethod(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");
        }

    }


}
/*
add new class AmazonDepartmentNamesListTest

add setUp method with @BeforeMethod annotation:
    launch selenium, maximize, set timeout, navigate to amazon

add @Test amazonDepartmentTest

assert Amazon home page is displayed
assert that "All" option is selected by default/automatically

get All available options and print out
 */