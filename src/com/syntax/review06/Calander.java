package com.syntax.review06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calander {


        public static String url = "https://www.aa.com/homePage.do?locale=en_US";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(url);

//        click on the DEPART
            WebElement depart = driver.findElement(By.xpath("//label[@for='aa-leavingOn']/following-sibling::button"));
            depart.click();


//        select the month December

            boolean found = false;
            while (!found) {
                WebElement month = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
                String month_ = month.getText();
                System.out.println(month_);
                if (month_.equals("December")) {
                    System.out.println("hey i got it the month is :" + month_);
//                selecting the date
                    List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
//                check for the desried date in the loop
                    for (WebElement date : dates) {
                        String dd = date.getText();
                        if (dd.equals("1")) {

                            date.click();
                        }

                    }
                    found = true;
                    break;

                } else {
                    WebElement nextButton = driver.findElement(By.xpath("//a[@data-handler='next']"));
                    nextButton.click();
                }

            }


        }
    }
