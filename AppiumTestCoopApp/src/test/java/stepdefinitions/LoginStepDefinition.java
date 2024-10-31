package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;
import java.util.Map;

import static actorActions.Actor.*;
import static userinterfaces.LoginPage.*;

public class LoginStepDefinition {

    @Given("^el actor ingreso a la pantalla incial login$")
    public void elActorIngresoALaPantallaIncialLogin() throws MalformedURLException {
        abrirApp();
    }
    @When("^se autentique en el aplicativo$")
    public void seAutentiqueEnElAplicativo(Map<String, String> usuario) {
        escribirTexto(identificacionTxt,usuario.get("usuario"));
        escribirTexto(passwordTxt,usuario.get("password"));
        clickEnElemento(loginBtn);
    }
    @Then("^el visualizara la pantalla de productos$")
    public void elVisualizaraLaPantallaDeProductos() {
    }
}
