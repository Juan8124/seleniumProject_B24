package com.cybertek.tests.day23_fluentwait_testng_overview;

import com.cybertek.pages.edmunds_car.EdmundsCarDetailsPage;
import com.cybertek.pages.edmunds_car.EdmundsHomePage;
import com.cybertek.pages.edmunds_car.EdmundsNewCarPage;
import com.cybertek.tests.TestBase;
import com.cybertek.util.ConfigurationReader;
import org.testng.annotations.Test;

public class EdmundsNewCarSearchTest extends
        TestBase {

    @Test
    public void searchForNewCarTest() {
        driver.get(ConfigurationReader.getProperty("edmunds.url"));
        EdmundsHomePage page1 = new EdmundsHomePage();
        page1.isCurrentPage();
        page1.gotToNewCarPricingPage();

        EdmundsNewCarPage page2 = new EdmundsNewCarPage();
        page2.selectMake("Porsche");
        page2.selectModel("911");
        page2.zipCode.sendKeys(faker.address().zipCode());
        page2.clickGoBtn();

        EdmundsCarDetailsPage page3 = new EdmundsCarDetailsPage();
        page3.isCurrentPage();
        System.out.println(page3.msrpRange.getText());
        System.out.println( page3.getMrsPRange());
    }


}
