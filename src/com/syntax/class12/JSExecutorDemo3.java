package com.syntax.class12;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorDemo3 {

    public static String url = "http://www.google.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //to open a new tab.if we left the () empty it will open a blank tab.
        //if we put a website at () then it will open that specific website.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('http://www.amazon.com')");
    }
}