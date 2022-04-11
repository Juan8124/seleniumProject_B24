package com.cybertek.pages;

import com.cybertek.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage {

    public DragAndDropPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "draggable")
    public WebElement smallCircle;

    @FindBy(id = "droptarget")
    public WebElement bigCircle;

    @FindBy(xpath = "//div[.='You did great!']")
    public WebElement text;


}
/*
TC #16: Hover Test
1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
2. Drag and drop the small circle to bigger circle.
3. Assert:
-Text in big circle changed to: “You did great!”



 */