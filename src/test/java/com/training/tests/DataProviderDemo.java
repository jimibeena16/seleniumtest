package com.training.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {

       return new Object[][] {

           {"standard_user", "secret_sauce"},
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(
            String username,
            String password) {

        System.out.println(username + " |  "+ password);
    }
}