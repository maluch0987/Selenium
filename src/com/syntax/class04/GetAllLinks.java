package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
           driver.get("http://Ebay.com");
           List<WebElement>allLinks=driver.findElements(By.tagName("a"));
        System.out.println("Number of links "+allLinks.size());

        for(WebElement link:allLinks ){
            String linkText=link.getText();
            String fulllink=link.getAttribute("href");
            if(!linkText.isEmpty())
            System.out.println(linkText+"   "+fulllink);
        }



    }
}
