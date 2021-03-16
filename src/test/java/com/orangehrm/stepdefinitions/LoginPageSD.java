package com.orangehrm.stepdefinitions;

import com.orangehrm.base.ConfigReader;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.utils.Constants;
import com.orangehrm.utils.ElementUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.Element;

public class LoginPageSD {


   @Given("I am on the login page")
    public void verifyLoginTitle(){
       Assert.assertEquals(Constants.LOGIN_PAGE_TITLE, LoginPage.getTitle());
   }


   @When("I enter correct username in the username field")
    public void enterValidUserName(){
LoginPage.enterUserName(ConfigReader.getProperty("username"));
   }

   @And("I enter correct password in the password field")
    public void enterValidPassword(){
       LoginPage.enterPassword(ConfigReader.getProperty("password"));

   }
   @And("I click on login button")
    public void clickLoginBtn(){
       LoginPage.clickLoginButton();
   }


    @Then("I see the home page")
    public void verifyHomePageTitle() {
       Assert.assertEquals(Constants.HOME_PAGE_TITLE, HomePage.getHomePageTitle());
    }


    @When("I enter incorrect username in the username field")
    public void EnterIncorrectUsername() {
        LoginPage.enterUserName(ConfigReader.getProperty("invalidusername"));
    }

    @And("I enter incorrect password in the password field")
    public void EnterIncorrectPassword() {
        LoginPage.enterPassword(ConfigReader.getProperty("invalidpassword"));
    }

    @Then("I see the error message on the login page")
    public void getErrorMessage() {
        Assert.assertEquals(Constants.LOGIN_PAGE_INVALID_MESSAGE,LoginPage.getErrorMessage());
    }
}
