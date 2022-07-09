package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElement {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver()  ;
        driver.get("http://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("sunt@hdkhvk.com");
        driver.findElement(By.id("pass")).sendKeys("1236sdgh");
        driver.findElement(By.name("login")).click();
        Thread.sleep(3000);
       // driver.findElement(By.linkText("Forgot password?")).click();
       driver.findElement(By.partialLinkText("Forgot")).click();
       driver.quit();


    }
}
