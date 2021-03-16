package com.orangehrm.pages;

import com.orangehrm.utils.ElementUtils;
import org.openqa.selenium.support.PageFactory;
import static com.orangehrm.base.BasePage.driver;

public class HomePage {
    public static String getHomePageTitle(){
        return ElementUtils.doGetPageTitle();
    }
}
