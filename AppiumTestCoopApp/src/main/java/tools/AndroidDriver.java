package tools;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

public class AndroidDriver {

    protected static AppiumDriver driver;

    public static AppiumDriver useCoopApp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("FM-51")
                .setPlatformName("Android")
                .setPlatformVersion("10")
                .setAppPackage("com.udem.appudem")
                .setAppActivity("com.udem.appudem.LoginCliente")
                .setUdid("HVA0DCPW")
                .setAutomationName("UiAutomator2");

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), options);

        Logger logger = Logger.getLogger(AndroidDriver.class.getName());
        logger.fine("Application Started");
        return driver;
    }

    public static void fuckOff() throws InterruptedException {
        Thread.sleep(1000);
        if (driver != null) driver.quit();
    }
}
