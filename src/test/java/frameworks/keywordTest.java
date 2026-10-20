package frameworks;

import org.testng.annotations.Test;

public class keywordTest {

   @Test
    public void loginTest() {

        keywords keyword = new keywords();

        keyword.openBrowser();

        keyword.openURL("https://www.saucedemo.com/");

        keyword.enterUsername("standard_user");

        keyword.enterPassword("secret_sauce");

        keyword.clickLogin();
        keyword.closeBrowser();
    }
}