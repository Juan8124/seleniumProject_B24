package com.cybertek.tests.day14_webtables_properties;

import com.cybertek.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTableDemoTest {
    WebDriver driver;
    String url = "http://practice.cybertekschool.com/tables";


    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
    }


    @Test
    public void readFromTableTest() {
        // print table data  as a single string not so common but useful sometimes
        WebElement table1 = driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println("Table 1 test = " + table1.getText());
        // verify tconway@earthlink.net	is anywhere in the table
        Assert.assertTrue(table1.getText().contains("tconway@earthlink.net"));
        System.out.println();
        //print all column names
        WebElement columnNames = driver.findElement(By.xpath("//table[@id='table1']/thead/tr"));
        System.out.println("All column Names: " + columnNames.getText());

        // print each column name in seprate lines using a loop and findElements method
        System.out.println();

        List<WebElement> list = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
        System.out.println("Count of column: " + list.size());
        for (WebElement h : list) {
            System.out.println(h.getText());
        }
        // print first col + first cell data
        String xpath = "//table[@id='table1']/tbody/tr[1]/td[1]";
        WebElement firstRowCell = driver.findElement(By.xpath(xpath));
        System.out.println("First for cell: " + firstRowCell.getText());
        System.out.println("Col 1, row 4: " + getCellData(1, 4));
        System.out.println("Col 3, row 3: " + getCellData(3, 3));

    }

    @Test
    public void getAllColumnData() {
        // print all names
        // print all eMails
        List<WebElement> names = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[2]"));
        List<WebElement> emails = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[3]"));
        System.out.println("---All First Names---");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + 1 + " - " + names.get(i).getText());
        }
        System.out.println("---All Emails---");
        for (int i = 0; i < emails.size(); i++) {
            System.out.println(i + 1 + " - " + emails.get(i).getText());
        }

    }

    @Test
    public void printAllTableData() {
// get rows count and assign to rowsCount variable and print it
        int rowsCount = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
        System.out.println("rowsCount = " + rowsCount);

        for (int r = 1; r <= rowsCount; r++) {
            for (int c = 1; c <= 6; c++) {
                //    String value = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+r+"]/td["+c+"]")).getText();
                String value = getCellData(r, c);
                System.out.println("value = " + value);
            }
        }
        /*
        Read table data --> 2d array
        table data --> list of maps
        table data
         */
    }
    @Test
    public void readNextCell(){
        
    }

    public String getCellData(int row, int col) {
        String xpath = "//table[@id='table1']/tbody/tr[" + row + "]/td[" + col + "]";
        return driver.findElement(By.xpath(xpath)).getText();

    }


}
