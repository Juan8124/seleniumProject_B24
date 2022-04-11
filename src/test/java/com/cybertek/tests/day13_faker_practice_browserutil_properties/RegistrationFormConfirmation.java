package com.cybertek.tests.day13_faker_practice_browserutil_properties;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class RegistrationFormConfirmation extends RegistrationFormTestBase {

    Faker faker = new Faker();

    @Test
    public void formTest() {
        WebElement firstName = driver.findElement(By.name("firstname"));
        WebElement lastName = driver.findElement(By.name("lastname"));
        WebElement userName = driver.findElement(By.name("username"));
        WebElement email = driver.findElement(By.name("email"));
        WebElement passWord = driver.findElement(By.name("password"));
        WebElement phoneNumber = driver.findElement(By.name("phone"));
        WebElement gender = driver.findElement(By.xpath("//*[@value='male']"));
        WebElement dateOfBirth = driver.findElement(By.name("birthday"));
        Select department = new Select(driver.findElement(By.name("department")));
        department.selectByIndex(faker.number().numberBetween(2, 9));
        Select jobTitle = new Select(driver.findElement(By.name("job_title")));
        jobTitle.selectByIndex(faker.number().numberBetween(1, 8));


        firstName.sendKeys(faker.name().firstName());
        lastName.sendKeys(faker.name().lastName());
        userName.sendKeys(faker.name().username().replace(".", ""));
        email.sendKeys(faker.internet().emailAddress());
        passWord.sendKeys(faker.internet().password());
        phoneNumber.sendKeys(faker.phoneNumber().cellPhone().replace("(", "").replace(")", "").replace(".", "-"));
        gender.click();
        dateOfBirth.sendKeys("11/23/1999");

        List<WebElement> languages = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement eachLan : languages) {
            eachLan.click();
        }

        WebElement singUp = driver.findElement(By.id("wooden_spoon"));
        singUp.click();

        // verify "well done" message is displayed
        WebElement heading = driver.findElement(By.className("alert-heading"));
        Assert.assertEquals(heading.getText(),"Well done!");

    }


}
/*
TC#6: Cybertek registration form confirmation
Note: Use JavaFaker when possible.
1. Open browser
2. Go to website: http://practice.cybertekschool.com/registration_form
3. Enter first name
4. Enter last name
5. Enter username
6. Enter email address
7. Enter password
8. Enter phone number
9. Select a gender from radio buttons
10.Enter date of birth
11.Select Department/Office
12.Select Job Title
13.Select programming language from checkboxes
14.Click to sign up button
15.Verify success message “You’ve successfully completed registration.” is
displayed
 */