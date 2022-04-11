package com.cybertek.tests.day07_findelements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorAddTestV2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        int num1 = 7, num2 = 4;
        int expectedResult = num1 + num2;

        driver.manage().window().maximize();
        String url = "https://www.calculator.net";
        driver.get(url);

        WebElement num1Elem = driver.findElement(By.xpath("//span[.='" + num1 + "']"));
        WebElement plusSign = driver.findElement(By.xpath("//span[.='+']"));
        WebElement num2Elem = driver.findElement(By.xpath("//span[.='" + num2 + "']"));
        WebElement equalsSign = driver.findElement(By.xpath("//span[.='=']"));

        num1Elem.click();
        plusSign.click();
        num2Elem.click();
        equalsSign.click();

        WebElement result = driver.findElement(By.cssSelector("div[id='sciOutPut']"));

   

    }
}
