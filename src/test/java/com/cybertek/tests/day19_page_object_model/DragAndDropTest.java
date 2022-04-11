package com.cybertek.tests.day19_page_object_model;

import com.cybertek.tests.TestBase;
import com.cybertek.util.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DragAndDropTest extends TestBase {

    @Test
    public void guru99DragAndDropTest() {
        driver.get(ConfigurationReader.getProperty("draganddrop.url"));
        WebElement bank = driver.findElement(By.linkText("BANK"));
        WebElement accountType = driver.findElement(By.id("bank"));
        actions.dragAndDrop(bank, accountType).perform();

        WebElement fiveK = driver.findElement(By.linkText("5000"));


        WebElement bankAmount = driver.findElement(By.id("amt7"));
        actions.dragAndDrop(fiveK, bankAmount).perform();
    }

    @Test
    public void cargurusPriceSliderTest() {
        driver.get(ConfigurationReader.getProperty("cargurus.url") + "/Cars/inventorylisting/viewDetailsFilterViewInventoryListing.action?sourceContext=carGurusHomePageModel&entitySelectingHelper.selectedEntity=d177&zip=22102");
        WebElement priceSlider = driver.findElement(By.xpath("(//button[@aria-valuemin='3000'])[1]"));

        for (int i = 0; i <30 ; i++) {
            actions.clickAndHold(priceSlider).sendKeys(Keys.ARROW_RIGHT).release().perform();
        }
       // actions.clickAndHold(priceSlider).sendKeys(Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT,
              //  Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT ).release().build().perform();





       /*
        int x = priceSlider.getLocation().getX();
        int y = priceSlider.getLocation().getY();

        System.out.println("x: " + x);
        System.out.println("y" + y);
        actions.dragAndDropBy(priceSlider, x +33, y).perform();

*/
    }


}
