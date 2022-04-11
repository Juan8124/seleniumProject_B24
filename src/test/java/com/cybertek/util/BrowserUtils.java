package com.cybertek.util;

import org.openqa.selenium.JavascriptExecutor;

public class BrowserUtils {

    /*
    This method is used to pause the code for given seconds
    it is stati method so we can call
    BrowserUtil.sleep(5)
     */
    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception happened in sleep method");
        }

    }
/*
This method will scroll down on any page
 */
    public static void scrollDown(int scrollNumber) {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0," + scrollNumber + ")");
    }


}
