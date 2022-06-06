package com.mintvelvet.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.mintvelvet.contants.FrameworkContants;
import com.mintvelvet.enums.CategoryType;

import java.util.Objects;

public final class ExtentReport {

    private ExtentReport(){}


    private static ExtentReports extent ;
    private static ExtentSparkReporter spark;
    private static ExtentTest test;


    public static void initReport(){
        if (Objects.isNull(extent))
        {
            extent = new ExtentReports();
            spark = new ExtentSparkReporter(FrameworkContants.getExtentReportFilePath());
            extent.attachReporter(spark);
            spark.config().setTheme(Theme.DARK);
            spark.config().setDocumentTitle("NAE UI Automation Report");
            spark.config().setReportName("Automation");
        }

    }



    public static void flushReport(){
        if(Objects.nonNull(extent)) {
            extent.flush();
        }
        ExtentManager.unload();
    }

    public static void createTest(String name) {
        test =extent.createTest(name);
        ExtentManager.setExtent(test);

    }

    public static void AssignAuthor(String[] authors) {
        for (String author:authors) {
            ExtentManager.getExtent().assignAuthor(author);
        }


    }

    public static void AssignCategory(CategoryType[] categories) {
        for (CategoryType category:categories) {
            ExtentManager.getExtent().assignCategory(category.toString());
        }


    }


}
