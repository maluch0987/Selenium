package com.syntax.class07MultipleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*
navigate to http://www.uitestpractice.com/Students/Contact
click on the link
get text
print out in the console
 */
public class HW1 {
    public static String url = "http://www.uitestpractice.com/Students/Contact";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();
        WebElement link= driver.findElement(By.xpath("//a[contains(text(),'This is a Ajax link')]"));
        link.click();
        WebElement getText= driver.findElement(By.xpath("//div[@class='ContactUs']"));
        getText.getText();
        String link1=getText.getText();
        System.out.println(link1);
    }
}