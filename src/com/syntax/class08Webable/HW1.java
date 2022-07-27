package com.syntax.class08Webable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/*
go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled
 */
public class HW1 {
    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement clickBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        clickBox.click();
        WebElement removeClick= driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        removeClick.click();
        WebElement verifyText= driver.findElement(By.xpath("//p[@id='message']"));
        boolean isDisplay= verifyText.isDisplayed();
        System.out.println("It's gone: "+isDisplay);
        WebElement enableButton= driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
            enableButton.click();
            WebDriverWait wait=new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@style='width: 30%;']")));
            WebElement enterText= driver.findElement(By.xpath("//input[@style='width: 30%;']"));
            enterText.click();
            enterText.sendKeys("Hello world");
            WebElement disableButton= driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
            disableButton.click();
            WebElement textBox1=driver.findElement(By.xpath("//input[@style='width: 30%;']"));
            boolean sd=textBox1.isDisplayed();
        System.out.println("text is verify: "+sd);
      driver.quit();

    }
}