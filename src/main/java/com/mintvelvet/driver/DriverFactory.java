package com.mintvelvet.driver;

import com.mintvelvet.config.ConfigFactory;
import com.mintvelvet.enums.BrowserType;
import com.mintvelvet.enums.RunModeType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {


    public static WebDriver getDriver (String runMode ,String browserName) throws MalformedURLException
    {
        WebDriver driver = null;

         if(runMode.equalsIgnoreCase(RunModeType.LOCAL.toString().toLowerCase()))
         {
            driver = LocalDriverFactory.getLocalDriver(browserName);
         }
         else if(runMode.equalsIgnoreCase(RunModeType.REMOTE.toString().toLowerCase()))
         {

             System.out.println("in remote");
               driver =RemoteDriverFactory.getRemoteDriver(browserName);
        }
    return driver;
    }
}

