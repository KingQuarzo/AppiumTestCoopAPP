import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

public class AppTest {

    //static AppiumDriver driver;
    static AppiumDriver driver;
    public static void main(String[] args) throws MalformedURLException {
        openMobileApp();
        signIn(driver);
        signUp(driver);
    }

    public static void openMobileApp() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("FM-51")
                .setPlatformName("Android")
                .setPlatformVersion("10")
                .setAppPackage("com.udem.appudem")
                .setAppActivity("com.udem.appudem.LoginCliente")
                .setUdid("HVA0DCPW")
                .setAutomationName("UiAutomator2");

         driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), options);

        Logger logger = Logger.getLogger(AppTest.class.getName());
        logger.fine("Application Started");

    }

    public static void signIn(AppiumDriver driver){
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.udem.appudem:id/txt_identificacion\")")).sendKeys("123456789");
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.udem.appudem:id/txt_password\")")).sendKeys("123456789");
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.udem.appudem:id/btn_acceder\")")).click();

    }

    public static void signUp(AppiumDriver driver){
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.udem.appudem:id/Registrar\")")).click();

        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.udem.appudem:id/tipoID\")")).sendKeys("123456789");
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.udem.appudem:id/Identificacion\")")).sendKeys("123456789");
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.udem.appudem:id/Correo\")")).sendKeys("123456789");
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.udem.appudem:id/Nombres\")")).sendKeys("123456789");
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.udem.appudem:id/Apellidos\")")).sendKeys("123456789");
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.udem.appudem:id/Password\")")).sendKeys("123456789");
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.udem.appudem:id/FechaNacimiento\")")).sendKeys("123456789");

        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.udem.appudem:id/Registrarse\")")).click();

    }




}
