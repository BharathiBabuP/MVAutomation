package com.mintvelvet.listeners;

import com.mintvelvet.annotations.FrameworkAnnotation;
import com.mintvelvet.reports.ExtentReport;
import com.mintvelvet.utils.logs.Log4j;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Arrays;

import static com.mintvelvet.enums.LogType.*;
import static com.mintvelvet.reports.FrameworkLogger.log;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result)
    {
        Log4j.startTestCase(result.getName());
        ExtentReport.createTest(result.getName());
        ExtentReport.AssignAuthor(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotation.class).Author());
        ExtentReport.AssignCategory(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotation.class).Category());
    }

    @Override
    public void onTestSuccess(ITestResult result)
    {
        Log4j.endTestCase(result.getName());
        //ExtentLogger.pass(result.getName() + " is passed successfully");
        log(PASS,result.getMethod().getMethodName() +" is passed");
    }

    @Override
    public void onTestFailure(ITestResult result)
    {
       // ExtentLogger.fail(result.getName() + " is failed");
      //  ExtentLogger.fail(result.getThrowable().getMessage());
       // ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));


    //    log(FAIL,result.getMethod().getMethodName() +" is failed");
    //    log(FAIL,result.getName()+" is failed");
        Log4j.endTestCase(result.getName());
        log(FAIL,result.getThrowable().toString());
        log(FAIL,Arrays.toString(result.getThrowable().getStackTrace()));

    }

    @Override
    public void onTestSkipped(ITestResult result)

    {
       // ExtentLogger.info(result.getName() + " is skipped");
        log(SKIP,result.getName() +" is skipped");
    }



    @Override
    public void onStart(ITestContext context)
    {
        ExtentReport.initReport();
    }

    @Override
    public void onFinish(ITestContext context)
    {
        ExtentReport.flushReport();
    }
}
