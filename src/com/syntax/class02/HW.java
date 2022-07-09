package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) {
      /*
      navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
       */

System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
         driver.findElement(By.id("customer.firstName")).sendKeys("Lubomyr");
         driver.findElement((By.id("customer.lastName"))).sendKeys("leskiv");
         driver.findElement(By.name("customer.address.street")).sendKeys("2344 Kenh av");
driver.findElement(By.name("customer.address.city")).sendKeys("Brooklyn");
driver.findElement(By.name("customer.address.state")).sendKeys("NY");
driver.findElement(By.id("customer.address.zipCode")).sendKeys("11256");
driver.findElement(By.name("customer.phoneNumber")).sendKeys("3456782309");
driver.findElement(By.id("customer.ssn")).sendKeys("356563647");
driver.findElement(By.name("customer.username")).sendKeys("gfjgfy");
driver.findElement(By.id("customer.password")).sendKeys("djahgs");
driver.findElement(By.id("repeatedPassword")).sendKeys("djahgs");
driver.findElement(By.className("button")).click();
driver.quit();
    }
}
