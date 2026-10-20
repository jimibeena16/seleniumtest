package seleniumdemo2;

import org.testng.annotations.*;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LoginExtent {

    ExtentReports extent;
    ExtentTest test;

    @BeforeSuite
    public void beforeSuite() {

        ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");

        extent = new ExtentReports();
        extent.attachReporter(spark);

        System.out.println("Report Initialized");
    }

    @Test
    public void verifyLogin() {

        test = extent.createTest("Verify Login");

        System.out.println("Login Test");

        test.pass("Login Successful");
    }

    @Test
    public void verifyLogout() {

        test = extent.createTest("Verify Logout");

        System.out.println("Logout Test");

        test.pass("Logout Successful");
    }

    @AfterSuite
    public void afterSuite() {

        extent.flush();

        System.out.println("Report Generated");
    }
}
