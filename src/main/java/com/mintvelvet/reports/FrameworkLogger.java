package com.mintvelvet.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.mintvelvet.config.ConfigFactory;
import com.mintvelvet.config.FrameworkConfig;
import com.mintvelvet.enums.LogType;
import com.mintvelvet.utils.ScreenshotUtils;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Consumer;

public class FrameworkLogger {


    private FrameworkLogger() {
    }

    private static final Consumer<String> PASS = (message) -> ExtentManager.getExtent().pass(message);
    private static final Consumer<String> FAIL = (message) -> ExtentManager.getExtent().fail(message);
    private static final Consumer<String> SKIP = (message) -> ExtentManager.getExtent().skip(message);
    private static final Consumer<String> INFO = (message) -> ExtentManager.getExtent().info(message);
    private static final Consumer<String> CONSOLE = (message) -> System.out.println("INFO---->" + message);
    public static final Consumer<String> EXTENTANDCONSOLE = PASS.andThen(CONSOLE);
    public static final Consumer<String> TAKESCREENSHOT = (message) -> ExtentManager.getExtent().info("", MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenShot()).build());

    private static final Map<LogType, Consumer<String>> MAP = new EnumMap<>(LogType.class);
    private static final Map<LogType, Consumer<String>> SCREENSHOTMAP = new EnumMap<>(LogType.class);

    static {
        MAP.put(LogType.PASS, PASS);
        MAP.put(LogType.FAIL, FAIL.andThen(TAKESCREENSHOT));
        MAP.put(LogType.SKIP, SKIP);
        MAP.put(LogType.INFO, INFO);
        MAP.put(LogType.CONSOLE, CONSOLE);
        MAP.put(LogType.EXTENTANDCONSOLE, EXTENTANDCONSOLE);
        SCREENSHOTMAP.put(LogType.PASS, PASS.andThen(TAKESCREENSHOT));
        SCREENSHOTMAP.put(LogType.FAIL, FAIL.andThen(TAKESCREENSHOT));
        SCREENSHOTMAP.put(LogType.SKIP, SKIP.andThen(TAKESCREENSHOT));
        SCREENSHOTMAP.put(LogType.INFO, INFO);
        SCREENSHOTMAP.put(LogType.CONSOLE, CONSOLE);
        SCREENSHOTMAP.put(LogType.EXTENTANDCONSOLE, EXTENTANDCONSOLE.andThen(TAKESCREENSHOT));
    }

    public static void log(LogType status, String message)
    {
        if (!ConfigFactory.getConfig().passedstepsscreenshots().equalsIgnoreCase("yes"))
        {
            MAP.getOrDefault(status, EXTENTANDCONSOLE).accept(message);
        }
        else {
        SCREENSHOTMAP.getOrDefault(status, EXTENTANDCONSOLE).accept(message);
        }
    }


}
