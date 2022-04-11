package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_BasicLoginAuthentication {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx";
        String userName = "Tester";
        String password = "test";

        driver.get(url);
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();


        if (actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Fail To Pass Pest");
        }

        if (actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Fail To Pass Pest");
        }



        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(userName);
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        Thread.sleep(2000);

        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        Thread.sleep(3000);



        driver.findElement(By.id("ctl00_logout")).click();
        Thread.sleep(3000);
        driver.navigate().refresh();

        Thread.sleep(2000);
        driver.quit();


    }
}
/*
TC #5:	Basic	login	authentication
1- Open	a	chrome	browser
2- Go	to:
http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3- Verify	title	equals:
Expected:	Web	Orders	Login
4- Enter	username:	Tester
5- Enter	password:	test
6- Click	“Sign	In”	button
7- Verify	title equals:
Expected:	Web	Orders
 */