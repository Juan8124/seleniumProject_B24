package com.cybertek.tests.day19_page_object_model;

import com.cybertek.pages.DragAndDropPage;
import com.cybertek.tests.TestBase;
import com.cybertek.util.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop extends TestBase {

    @Test
    public void dragAndDropTest() {
        driver.get(ConfigurationReader.getProperty("demos.telerik.url"));

        DragAndDropPage dragAndDropPage = new DragAndDropPage();
        actions.dragAndDrop(dragAndDropPage.smallCircle, dragAndDropPage.bigCircle).perform();

        Assert.assertEquals(dragAndDropPage.text.getText(), "You did great!");


    }


}
/*
TC #16: Hover Test
1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
2. Drag and drop the small circle to bigger circle.
3. Assert:
-Text in big circle changed to: “You did great!”
 */