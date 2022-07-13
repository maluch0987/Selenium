package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandLinkDropDown {
    public static String url="https://syntaxprojects.com/basic-select-dropdown-demo.php";
    public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
           driver.get(url);
        WebElement daysDD =driver.findElement(By.id("select-demo"));
        Select select=new Select(daysDD);
        select.selectByIndex(3);

        Thread.sleep(2000);

        select.selectByVisibleText("Thursday");
        Thread.sleep(2000);
        select.selectByValue("Friday");


        List<WebElement> allOption=select.getOptions();
        int size= allOption.size();
        System.out.println(size);
        for(int i=1;i<size;i++){
           String option= allOption.get(i).getText();
            System.out.println(option);
            select.selectByIndex(i);
            Thread.sleep(1000);
        }
    }
}
