package com.cybertek.tests.day12_windows_practice_faker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerDemo {


@Test
    public void demo(){
    Faker faker = new Faker();
    String fullName= faker.name().fullName();
    System.out.println("full name"+fullName);
    
    String city = faker.address().cityName();
    System.out.println("city = " + city);
    
    
    String chuckNorris = faker.chuckNorris().fact();
    System.out.println("chuckNorris = " + chuckNorris);
    
    
}









    
}
