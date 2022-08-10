package com.syntax.pages;
import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPageWithPageFactory extends CommonMethods {

    @FindBy(id = "txtUsername")
    public WebElement username;

    @FindBy(xpath = "//input[@name = 'txtPassword']")
    public WebElement password;

    @FindBy(css = "input#btnLogin")
    public WebElement loginButton;

//    @FindBy(css = "input#btnLogin")
//    public List<WebElement> multipleElements;



    /**
     * this method will login
     */
    // you can put login actions and reuse the common methods
    public void loginActions() {
        sendText(username, "Admin");
        sendText(password, "Hum@nhrm123");
        loginButton.click();

    }

    public LoginPageWithPageFactory() {
        PageFactory.initElements(driver, this);
    }

}