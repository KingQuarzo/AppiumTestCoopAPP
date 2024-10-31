package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;
import java.util.Map;

import static Tasks.Task.*;
import static Tasks.Task.escribirTexto;
import static tools.AndroidDriver.fuckOff;
import static userinterfaces.LoginPage.registrarBtn;
import static userinterfaces.RegistroPage.correoTxt;
import static userinterfaces.RegistroPage.tipoIdTxt;
import static userinterfaces.RegistroPage.identificacionTxt;
import static userinterfaces.RegistroPage.nombresTxt;
import static userinterfaces.RegistroPage.apellidosTxt;
import static userinterfaces.RegistroPage.passwordTxt;
import static userinterfaces.RegistroPage.fechaNacimientoTxt;
import static userinterfaces.RegistroPage.registrarseBtn;

public class RegistroStepDefinition {

    @Given("el actor ingreso a la pantalla de registro")
    public void elActorIngresoALaPantallaDeRegistro() throws MalformedURLException, InterruptedException {
        abrirApp();
        clickEnElemento(registrarBtn);
        Thread.sleep(1000);
    }

    @When("se ingrese todos los datos para un registro")
    public void seIngreseTodosLosDatosParaUnRegistro(Map<String, String> usuario) throws InterruptedException {
        escribirTexto(tipoIdTxt,usuario.get("tipoId"));
        escribirTexto(identificacionTxt,usuario.get("identificacion"));
        escribirTexto(correoTxt,usuario.get("correo"));
        escribirTexto(nombresTxt,usuario.get("nombres"));
        escribirTexto(apellidosTxt,usuario.get("apellidos"));
        escribirTexto(passwordTxt,usuario.get("password"));
        escribirTexto(fechaNacimientoTxt,usuario.get("fechaNacimiento"));
        escribirTexto(passwordTxt,usuario.get("password"));
        clickEnElemento(registrarseBtn);
        Thread.sleep(3000);
    }

    @After
    public void after() throws InterruptedException {
        fuckOff();
    }

}
