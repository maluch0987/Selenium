package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) throws InterruptedException {
        /*
        Navigate to http://syntaxprojects.com
Click on start practicing
click on simple form demo
enter any text on first text box
click on show message
quit the browser
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        Thread.sleep(2000);
        WebElement startPracticing=driver.findElement(By.xpath("//a[@class='btn btn-success btn-outline-rounded green'][1]"));
        startPracticing.click();
        Thread.sleep(2200);
        WebElement simpleForm=driver.findElement(By.xpath("//a[text() = 'Simple Form Demo'and @class='list-group-item']"));
        simpleForm.click();
        WebElement enterMessage=driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']"));
        enterMessage.sendKeys("Hello World");
        Thread.sleep(2000);
        WebElement showMessage=driver.findElement(By.xpath("//button[@onclick='showInput();']"));
        showMessage.click();
        Thread.sleep(2200);
driver.quit();






    }
}
