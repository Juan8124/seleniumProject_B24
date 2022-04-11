package com.cybertek.tests.day07_findelements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorAutoationTask {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        String url = "https://www.calculator.net";
        int num1 = 5, num2 = 3, expectedResult = 8;
        driver.get(url);

        // locate the elements and store into webelement

        WebElement button5 = driver.findElement(By.cssSelector("span[onclick='r(5)']"));
        WebElement plusSign = driver.findElement(By.xpath("//span[.='+']"));
        WebElement button3 = driver.findElement(By.cssSelector("span[onclick='r(3)']"));
        WebElement equalsSign = driver.findElement(By.xpath("//span[.='=']"));

        button5.click();
        // Thread.sleep(1234);
        plusSign.click();
        //Thread.sleep(1234);
        button3.click();
        //Thread.sleep(1234);
        equalsSign.click();

        WebElement result = driver.findElement(By.cssSelector("div[id='sciOutPut']"));

        System.out.println(num1 + " + " + num2 + " = " + result.getText());
        String resultValue = result.getText();
        resultValue= resultValue.trim();
        // convert to int
        int ActualResult = Integer.parseInt(resultValue);

        if(ActualResult==expectedResult){
            System.out.println("Pass: Calculation is working");
        }else{
            System.out.println("Fail: Calculation fail");
        }




    }
}
/*
Try to use CSS or Xpath for this task.
You are writing an automation test to verify if the calculator is working as expected.
1) Add a class CalculatorAddTest
2) Declare variables String appUrl = “https://www.calculator.net”
int num1 = 5, num2 = 3
int expectedResult = 8
3) Launch selenium, maximize and navigate to the url
4) Locate 4 elements “5”, “3”, “+” , “=” using css or xpath and store into WebElement
objects
5) Click the elements in right order as you would do normally,
Add Thread.sleep(1234) in between steps to slow it down a little - not needed if you
have a cheap computer like mine :)
6) Locate result area and store into webElement object
7) Read the text of the result element, remove any unneeded characters and convert
into int. int expectedResult = Integer.parseInt(result);
8) Using if statement compare actualResult and the expectedResult . print pass or fail
accordingly.
9) Quit selenium and go home
 */