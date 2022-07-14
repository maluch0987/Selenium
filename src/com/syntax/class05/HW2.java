package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW2 {
    /*
    Go to ebay.com
get all the categories and print them in the console
select Computers/Tables & Networking
click on search
verify the header
     */
    public static String url="https://www.ebay.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement allCategorias=driver.findElement(By.cssSelector("select[aria-label='Select a category for search']"));
        Select select=new Select(allCategorias);
        List<WebElement>option =select.getOptions();
        for(WebElement options:option){
String optionsText= options.getText();
            System.out.println(optionsText);
            Thread.sleep(2000);
            select.selectByVisibleText("Computers/Tablets & Networking");
            WebElement search=driver.findElement(By.cssSelector("input[id='gh-btn']"));
            search.click();
            Thread.sleep(1000);
            WebElement header=driver.findElement(By.cssSelector("span[class='b-pageheader__text']"));
            String headerText= header.getText();
            if(header.isDisplayed()) {
                System.out.println("Header is displayed");
                driver.quit();
            }
        }
    }
}
