package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {




    public static void main(String[] a) throws InterruptedException {



        /*
        navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
         */


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.fb.com");
        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Lybomur");
        driver.findElement(By.name("lastname")).sendKeys("Modric");
        driver.findElement(By.name("reg_email__")).sendKeys("1234556789");
        driver.findElement(By.id("password_step_input")).sendKeys("3gdruj47");
        driver.findElement(By.name("birthday_month")).sendKeys("Jul");
        driver.findElement(By.name("birthday_day")).sendKeys("21");
        driver.findElement(By.name("birthday_year")).sendKeys("1998");
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("img[src='https://static.xx.fbcdn.net/rsrc.php/v3/y2/r/__geKiQnSG-.png']")).click();
        Thread.sleep(2000);
        driver.quit();
    }

}
