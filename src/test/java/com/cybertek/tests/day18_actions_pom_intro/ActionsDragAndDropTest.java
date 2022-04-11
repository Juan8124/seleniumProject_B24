package com.cybertek.tests.day18_actions_pom_intro;

import com.cybertek.tests.TestBase;
import com.cybertek.util.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ActionsDragAndDropTest extends TestBase {
    @Test
    public void dragAndDropTest(){
        driver.get(ConfigurationReader.getProperty("draganddrop.url"));
        WebElement target5000 = driver.findElement(By.linkText("5000"));
        WebElement dropTo = driver.findElement(By.id("amt7"));
        actions.dragAndDrop(target5000,dropTo).perform();


    }
}
