package com.orangehrm.utils;

import org.openqa.selenium.WebElement;
import static com.orangehrm.base.BasePage.driver;


public class ElementUtils {

    public static String doGetPageTitle(){
        try {
            return driver.getTitle();
        }catch(Exception e){
            System.out.println("Some exception occurred while getting the page title");
            return null;
        }
    }


    public static void doSendText(WebElement element, String value){
        try{
            element.sendKeys(value);
        }catch(Exception e){
            System.out.println("Some exception occurred while sending text at" + element);
        }
    }


    public static void doClick(WebElement element){
        try{
            element.click();
        }catch(Exception e){
            System.out.println("Some exception occurred while clicking at" + element);
        }
    }

    public static String doGetText(WebElement element){
        try{
            return element.getText();
        }catch (Exception e){
            System.out.println("Some exception occurred while getting text from" + element);
            return null;
        }
    }
}
