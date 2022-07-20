package com.syntax.class06AlertAndFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    /*
    {Navigate to https://syntaxprojects.com/bootstrap-iframe.php
    verify the header text Sorry, We Couldn't Find Anything For "Asksn" is displayed
    verify enroll today button is enabled
     */
    public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame("FrameOne");
        WebElement heading= driver.findElement(By.cssSelector("h1[class='heading-13']"));
        heading.isDisplayed();
        boolean Display= heading.isDisplayed();
        System.out.println("We Couldn't Find Asksn is Displayed "+Display);

        driver.switchTo().defaultContent();
        driver.switchTo().frame("FrameTwo");
        WebElement verifyButton= driver.findElement(By.xpath("//div[text()='Enroll today'][1]"));
        verifyButton.isDisplayed();
        boolean Button= verifyButton.isDisplayed();
        System.out.println("Button is enabled "+Button);
    }
}