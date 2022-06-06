package com.mintvelvet.driver;

import com.mintvelvet.config.ConfigFactory;
import com.mintvelvet.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public  final class LocalDriverFactory {


    private LocalDriverFactory() {};

    public static WebDriver getLocalDriver(String browserName) {

        WebDriver driver = null;

        if (browserName.equalsIgnoreCase(BrowserType.CHROME.toString())) {
           // ChromeOptions options = new ChromeOptions();
            //options.setBinary(ConfigFactory.getConfig().chromebinarypath());
            WebDriverManager.chromedriver().setup();
            System.out.println("the path  is " + WebDriverManager.chromedriver().getBrowserPath());
            // driver = new ChromeDriver(options);
            driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase(BrowserType.FIREFOX.toString())) {
            FirefoxOptions options = new FirefoxOptions();
            options.setBinary(ConfigFactory.getConfig().firefoxbinarypath());
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(options);
        } else if (browserName.equalsIgnoreCase(BrowserType.EDGE.toString())) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        return driver;
    }
}
