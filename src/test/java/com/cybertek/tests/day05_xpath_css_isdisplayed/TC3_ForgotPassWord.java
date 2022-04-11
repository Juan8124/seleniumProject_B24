package com.cybertek.tests.day05_xpath_css_isdisplayed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_ForgotPassWord {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        String url = "http://practice.cybertekschool.com/forgot_password";

        driver.get(url);
// enter email
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("viped4728@viked.com");

        // click on retrieve password
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String currentURl = driver.getCurrentUrl();

        if (currentURl.contains("email_sent")) {
            System.out.println("Pass: email_sent url verified");
        } else {
            System.out.println("Fail: email_sent url failed");
        }

        WebElement displayMessage = driver.findElement(By.name("confirmation_message"));

        String expectedMessage = "Your e-mail's been sent!";
        String actualMessage = displayMessage.getText();
        if (actualMessage.equalsIgnoreCase(expectedMessage)) {
            System.out.println("Matches display message");
        } else {
            System.out.println("Fail to match display message");
        }

        System.out.println("Name attribute " + displayMessage.getAttribute("name"));

        Thread.sleep(2000);
        driver.quit();


    }
}

/*
TC #3: PracticeCybertek/ForgotPassword URL verification
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/forgot_password
3. Enter any email into input box
4. Click on Retrieve password
5. Verify URL contains:
Expected: “email_sent”
6. Verify textbox displayed the content as expected.
Expected: “Your e-mail’s been sent!”
Hint: You need to use getText method for this practice

 */