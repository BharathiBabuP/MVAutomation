package com.mintvelvet.reports;

import com.aventstack.extentreports.ExtentTest;

import java.util.Objects;

public final class ExtentManager {

    public ExtentManager(){}

    private static final ThreadLocal<ExtentTest> threadLocal = new ThreadLocal<>();

    static synchronized ExtentTest getExtent() {
        return threadLocal.get();
    }

    static synchronized void  setExtent(ExtentTest test)
    {
        if(Objects.nonNull(test)) {
            threadLocal.set(test);
        }

    }

    static void unload(){
        threadLocal.remove();
    }

}
