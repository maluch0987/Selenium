package com.syntax.class06AlertAndFrames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.TreeMap;

public class HW1 {

    /*
HW
Go to https://syntaxprojects.com/javascript-alert-box-demo.php
click on each button and handle the alert accordingly
     */
    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";

    //username:password
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement alertBox= driver.findElement(By.cssSelector("button[class='btn btn-default']"));
        alertBox.click();
        Alert alertB=driver.switchTo().alert();
        String alertText=alertB.getText();
        System.out.println(alertText);
        alertB.accept();
        Thread.sleep(2000);

        WebElement confirmBox= driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
        confirmBox.click();
       Alert confirm=driver.switchTo().alert();
       String confirmText=confirm.getText();
        System.out.println(confirmText);
        confirm.dismiss();
Thread.sleep(2000);

       WebElement promtBox =driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
      promtBox.click();
      Thread.sleep(1000);
     Alert promB=driver.switchTo().alert();
      promB.sendKeys("Oslan");
        Thread.sleep(2000);
        promB.accept();
        driver.quit();


    }
}
