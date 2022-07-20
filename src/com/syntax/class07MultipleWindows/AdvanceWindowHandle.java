package com.syntax.class07MultipleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvanceWindowHandle {
    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
       String mainPageHandle= driver.getWindowHandle();
        WebElement idButton=driver.findElement(By.linkText("Follow On Instagram"));
        idButton.click();

        WebElement FbButton= driver.findElement(By.linkText("Like us On Facebook"));
        FbButton.click();

        WebElement igAndFbButton=driver.findElement(By.linkText("Follow Instagram & Facebook"));
        igAndFbButton.click();

        Set<String> allWindowHandle=driver.getWindowHandles();
        System.out.println(allWindowHandle.size());
        Iterator<String>it=allWindowHandle.iterator();
        while (it.hasNext()) {//start iterating throughh the handles (tabs)
            String handle = it.next();//get one  handle
            if(!mainPageHandle.equals(handle)) {//set a condition where  main  page is not equal to yhe handle
                driver.switchTo().window(handle);//switch to that specific handle
                driver.manage().window().maximize();
                String title = driver.getTitle();//get title
                System.out.println(title);
                driver.close();//close the tab
            }
            }
        driver.switchTo().window(mainPageHandle);
        idButton.click();

        }
    }
