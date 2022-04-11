package com.cybertek.tests.day05_xpath_css_isdisplayed;

import com.cybertek.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_ForgotPassword_xpath_css {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        String appUrl = "http://practice.cybertekschool.com/forgot_password";

        driver.manage().window().maximize();
        driver.get(appUrl);
        Thread.sleep(5000);

       // <a class="nav-link" href="/">Home</a>
        WebElement homelink=driver.findElement(By.xpath("//a[.=Home]"));
        WebElement forgotPasswordheader=driver.findElement(By.xpath("//h2[.=Forgot Password]"));
        WebElement emailLabel = driver.findElement(By.xpath("//label[.=E-mail]"));
        WebElement emailField=driver.findElement(By.xpath("//name[@name='email']"));
        WebElement retrievePasswordBtn = driver.findElement(By.xpath("//i[.=Retrieve password]"));
        WebElement powerByLabel= driver.findElement(By.xpath("//a[.=Cybertek School]"));
Thread.sleep(5000);
        System.out.println("home link is displayed "+homelink.isDisplayed());
        System.out.println("forgot password header "+forgotPasswordheader.isDisplayed());
        System.out.println("email feild is displayed "+emailField.isDisplayed());
        System.out.println("email label is dispalyed "+emailLabel.isDisplayed());
        System.out.println("Retrieve password "+retrievePasswordBtn.isDisplayed());
        System.out.println("power label is powered by "+powerByLabel.isDisplayed());



    }
}
/*
TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cybertek School” text
4. Verify all WebElements are displayed.
 */