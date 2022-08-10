package com.syntax.pages;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class DashBordPage {


    public HTMLInputElement welcomeAdmin;
    public HTMLInputElement logout;

    public class DashboardPage extends CommonMethods {

        @FindBy(id = "welcome")
        public WebElement welcomeAdmin;

        @FindBy(xpath = "//a[text() = 'Logout']")
        public WebElement logout;

        public DashboardPage() {
            PageFactory.initElements(driver, this);
        }
    }
}
