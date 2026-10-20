package com.training.runners;
import io.cucumber.testng.*;
@CucumberOptions(
 features="src/test/resources/features",
 glue="com.training.steps",
 plugin={"pretty","html:target/cucumber-report.html"},
// tags="@smoke", 
 monochrome=true)
public class TestRunner extends AbstractTestNGCucumberTests {}