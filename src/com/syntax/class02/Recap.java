package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Recap {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.Facebook.com");
        driver.manage().window().maximize();
        String title=driver.getTitle();
        String expectedTitle="Facebook-log in or sign up";
        if(title.equals(expectedTitle)){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is Not correct");
        }
        driver.quit();
    }
}
