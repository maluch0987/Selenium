package com.syntax.class10Calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/*
Go to aa.com/homePage.do
select depart date
select return date
select destination
click on search
quit the browser
 */
public class HW {
    public static String url = "http://aa.com/homePage.do";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       WebElement Destination= driver.findElement(By.xpath("//input[@ id='reservationFlightSearchForm.destinationAirport']"));
Destination.sendKeys("Ukraine");
       WebElement Depart= driver.findElement(By.xpath("//input[@ id='aa-leavingOn']"));
       Depart.sendKeys("10/15/2022");
       WebElement Return= driver.findElement(By.xpath("//input[@ id='aa-returningFrom']"));
       Return.sendKeys("11/01/2022");
       WebElement searchButton= driver.findElement(By.xpath("//input[@ id='flightSearchForm.button.reSubmit']"));
       Thread.sleep(1000);
       searchButton.click();
       driver.quit();
    }
}