package actorActions;


import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import tools.AndroidDriver;

import java.net.MalformedURLException;

public class Actor extends AndroidDriver {

    public static void abrirApp() throws MalformedURLException {
        useCoopApp();
    }

    public static void clickEnElemento(String id) {
        WebElement boton = driver.findElement(new AppiumBy.ByAndroidUIAutomator(id));
        boton.click();
    }

    public static void escribirTexto(String id, String texto) {
        WebElement campoTexto = driver.findElement(new AppiumBy.ByAndroidUIAutomator(id));
        campoTexto.sendKeys(texto);
    }

    public static boolean visualizacionBoton(String id) {
        WebElement boton = driver.findElement(new AppiumBy.ByAndroidUIAutomator(id));
        return boton.isDisplayed();
    }

    public static String obtenerTexto(String id) {
        WebElement elemento = driver.findElement(new AppiumBy.ByAndroidUIAutomator(id));
        return elemento.getText();
    }

}
