package seleniumdemo2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//@Test - applies to all public methods inside this class
public class LoginTest {
	 @BeforeSuite
	    public void beforeSuite() {
	        System.out.println("1. Before Suite - Open Report");
	    }

	    @BeforeTest
	    public void beforeTest() {
	        System.out.println("2. Before Test - Launch Browser");
	    }

	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("3. Before Class - Create Page Objects");
	    }

	    @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("4. Before Method - Login to Application");
	    }

	    @Test
	    public void verifyLogin() {
	        System.out.println("5. Test Case 1 - Verify Login");
	    }

	    @Test
	    public void verifyLogout() {
	        System.out.println("5. Test Case 2 - Verify Logout");
	    }

	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("6. After Method - Logout from Application");
	    }

	    @AfterClass
	    public void afterClass() {
	        System.out.println("7. After Class - Close Test Data");
	    }

	    @AfterTest
	    public void afterTest() {
	        System.out.println("8. After Test - Close Browser");
	    }

	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("9. After Suite - Flush Report");
	       
	    }

}