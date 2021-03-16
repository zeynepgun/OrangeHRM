package com.orangehrm.pages;

import com.orangehrm.utils.ElementUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.orangehrm.base.BasePage.driver;

public class LoginPage {
    @FindBy(id="txtUsername")
    private static WebElement username;

    @FindBy(id="txtPassword")
    private static WebElement password;

    @FindBy(id="btnLogin")
    private static WebElement loginBtn;

    @FindBy(id="spanMessage")
    private static WebElement errorMessage;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public static String getTitle(){
        return ElementUtils.doGetPageTitle();
    }

    public static void enterUserName(String name){
        ElementUtils.doSendText(username, name);
    }

    public static void enterPassword(String pwd){
        ElementUtils.doSendText(password, pwd);
    }

    public static void clickLoginButton(){
        ElementUtils.doClick(loginBtn);
    }

    public static String getErrorMessage(){
        return ElementUtils.doGetText(errorMessage);
    }


}
