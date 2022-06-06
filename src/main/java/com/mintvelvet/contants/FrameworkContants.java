package com.mintvelvet.contants;

import com.mintvelvet.config.ConfigFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class FrameworkContants {

    private FrameworkContants(){}

    private static final String USERDIRPATH =System.getProperty("user.dir");
    private static final String RESOURCESPATH = USERDIRPATH+"/src/test/resources";
    private static final String  EXTENTREPORTFOLDERPATH =USERDIRPATH +"/extent-test-output/";
    private static String extentReportFilePath = "";

    public static String getExtentReportFilePath()  {
        if(extentReportFilePath.isEmpty()) {
            extentReportFilePath = createReportPath();
        }
        return extentReportFilePath;
    }

    private static String createReportPath(){

            if(ConfigFactory.getConfig().overridereports().equalsIgnoreCase("no")){
                return EXTENTREPORTFOLDERPATH+getCurrentDateFormatter()+"-"+System.currentTimeMillis()+"/index.html";

            }
            else {
                return EXTENTREPORTFOLDERPATH+"/index.html";
            }
    }

    private static String getCurrentDateFormatter(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        return LocalDate.now().format(formatter);
    }


}
