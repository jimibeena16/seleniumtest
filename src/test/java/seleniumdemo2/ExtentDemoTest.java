package seleniumdemo2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentDemoTest {

    static ExtentReports extent;

    static {
        ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");

        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    @Test
    public void passTest() {

        ExtentTest test = extent.createTest("Pass Test");

        test.pass("Step Passed");

        Assert.assertTrue(true);

        extent.flush();
    }

}