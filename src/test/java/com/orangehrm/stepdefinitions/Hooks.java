package com.orangehrm.stepdefinitions;

import com.orangehrm.base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup() {
        BasePage.initializeDriver();
    }
    @After
    public void tearDown(){
        BasePage.tearDown();
    }
}

