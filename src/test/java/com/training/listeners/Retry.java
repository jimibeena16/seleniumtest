package com.training.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

    int count = 0;
    int maxTry = 2;

    @Override
    public boolean retry(ITestResult result) {

        if (count < maxTry) {
            count++;
            System.out.println("Retrying Test : "
                    + result.getName()
                    + " Retry Count : "
                    + count);

            return true;
        }

        return false;
    }
}