package frameworks;

import java.io.BufferedReader;
import java.io.FileReader;

import org.testng.annotations.Test;

public class HybridTest {

    @Test
    public void loginTest() throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("test-data/login-data.csv"));

        String line;

        br.readLine(); // Skip header

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            String username = data[0];
            String password = data[1];

            keywords keyword = new keywords();

            keyword.openBrowser();

            keyword.openURL("https://www.saucedemo.com/");

            keyword.enterUsername(username);

            keyword.enterPassword(password);

            keyword.clickLogin();

            keyword.closeBrowser();
        }

        br.close();
    }
}