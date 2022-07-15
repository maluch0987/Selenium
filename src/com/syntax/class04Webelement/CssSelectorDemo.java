package com.syntax.class04Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://syntaxprojects.com/index.php");
        WebElement startPracticing=driver.findElement(By.xpath("//a[@class='btn btn-success btn-outline-rounded green'][1]"));
        startPracticing.click();
        Thread.sleep(2222);
        WebElement simpleFormDemo=driver.findElement(By.xpath("//a[text()='Check Box Demo']/preceding-sibling::a"));
        simpleFormDemo.click();
        Thread.sleep(2000);
       WebElement textBox= driver.findElement(By.cssSelector("input[placeholder^='Please']"));
       textBox.sendKeys("Hello World");
       Thread.sleep(2000);
       WebElement showMassegButton=driver.findElement(By.cssSelector("button[onclick*='show']"));
       showMassegButton.click();
       Thread.sleep(2000);
       driver.quit();

    }
}
