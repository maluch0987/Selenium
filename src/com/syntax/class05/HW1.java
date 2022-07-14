package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 {
    /*
    : Facebook dropdown verification
Open chrome browser
Go to "https://www.facebook.com"
click on create new account
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth
Quit browser
     */
    public static String url="https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement signUp=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        signUp.click();
        Thread.sleep(1000);
        WebElement Month =driver.findElement(By.cssSelector("select[title='Month']"));
        Select select=new Select(Month);
        List<WebElement>monthOption=select.getOptions();
        int monthSize= monthOption.size();
        System.out.println(monthSize);
        select.selectByIndex(1);
        WebElement day=driver.findElement(By.cssSelector("select[id='day']"));
        Select select1=new Select(day);
        List<WebElement>dayOption=select1.getOptions();
        int daySize= dayOption.size();
        System.out.println(daySize);
        select1.selectByValue("15");
        WebElement year =driver.findElement(By.id("year"));
        Select select2=new Select(year);
        List<WebElement>yaerOpton=select2.getOptions();
        int yearSize=yaerOpton.size();
        System.out.println(yearSize);
        select2.selectByVisibleText("1992");
        driver.quit();

    }
}
