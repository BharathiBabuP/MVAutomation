package com.mintvelvet.driver;

import com.mintvelvet.config.ConfigFactory;
import com.mintvelvet.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteDriverFactory {

    private RemoteDriverFactory() {};

    public static WebDriver getRemoteDriver(String browserName) throws MalformedURLException
    {


        DesiredCapabilities desiredCapabilities =new DesiredCapabilities();

        if (browserName.equalsIgnoreCase(BrowserType.CHROME.toString()))
        {
            desiredCapabilities.setBrowserName(BrowserType.CHROME.toString().toLowerCase());
        }
        else if (browserName.equalsIgnoreCase(BrowserType.FIREFOX.toString()))
        {
            desiredCapabilities.setBrowserName(BrowserType.FIREFOX.toString().toLowerCase());

        } else if (browserName.equalsIgnoreCase(BrowserType.EDGE.toString()))
        {
            desiredCapabilities.setBrowserName(BrowserType.EDGE.toString().toLowerCase());
        }
       return new RemoteWebDriver(new URL(ConfigFactory.getConfig().remoteurl()),desiredCapabilities);


    }

    }
