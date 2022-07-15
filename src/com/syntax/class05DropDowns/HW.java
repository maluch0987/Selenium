package com.syntax.class05DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW {
    /*
 Go to facebook sign up page
Fill out the whole form
Click signup
     */
    public static String url="https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Artur");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Modric");
        driver.findElement(By.name("reg_email__")).sendKeys("234-234-8765");
        driver.findElement(By.cssSelector("input[autocomplete='new-password']")).sendKeys("123345");
        WebElement Month =driver.findElement(By.cssSelector("select[name='birthday_month']"));
        Select select=new Select(Month);
        select.selectByVisibleText("Jan");
WebElement day=driver.findElement(By.cssSelector("select[id='day']"));
Select select1=new Select(day);
select1.selectByValue("10");
WebElement year =driver.findElement(By.id("year"));
Select select2=new Select(year);
select2.selectByValue("1992");
driver.findElement(By.cssSelector("input[class='_8esa']")).click();
driver.findElement(By.xpath("//button[@name='websubmit']")).click();
Thread.sleep(2000);


    }
}
