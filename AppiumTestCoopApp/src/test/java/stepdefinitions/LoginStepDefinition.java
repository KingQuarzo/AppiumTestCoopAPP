package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;
import java.util.Map;

import static Tasks.Task.*;
import static userinterfaces.LoginPage.*;
import static userinterfaces.ProductosPage.consultarHistorialAhorroBtn;
import static userinterfaces.ProductosPage.cuentaAhorroTitle;

public class LoginStepDefinition {

    @Given("^el actor ingreso a la pantalla incial login$")
    public void elActorIngresoALaPantallaIncialLogin() throws MalformedURLException {
        abrirApp();
    }
    @When("^se autentique en el aplicativo$")
    public void seAutentiqueEnElAplicativo(Map<String, String> usuario) throws InterruptedException {
        escribirTexto(identificacionTxt,usuario.get("usuario"));
        escribirTexto(passwordTxt,usuario.get("password"));
        clickEnElemento(loginBtn);
        Thread.sleep(1000);
    }
    @Then("^el visualizara la pantalla de productos$")
    public void elVisualizaraLaPantallaDeProductos() {
        assert visualizacionBoton(consultarHistorialAhorroBtn);
        assert "Cuenta de ahorro".equals(obtenerTexto(cuentaAhorroTitle));
    }

    @After
    public void after() throws InterruptedException {
        fuckOff();
    }
}
