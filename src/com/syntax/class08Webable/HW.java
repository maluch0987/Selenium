package com.syntax.class08Webable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
create a package and name it as utils
create a class and name as CommonMethods
create functions (methods) to open and quit the browsers
open method has to accept a url as a parameter
 */
class  CommonMethods {

    WebDriver driver = new ChromeDriver();

    void openBrowser(String URL) {
        driver.get(URL);
    }

    void quitBrowser() {
        driver.quit();
    }


    public static class HW extends CommonMethods {
        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
CommonMethods commonMethods=new CommonMethods();
commonMethods.openBrowser("https://www.facebook.com/");
Thread.sleep(2000);
commonMethods.quitBrowser();
        }
    }
}