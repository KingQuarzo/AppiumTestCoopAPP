package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

import static Tasks.Task.clickEnElemento;
import static Tasks.Task.obtenerTexto;
import static tools.AndroidDriver.fuckOff;
import static userinterfaces.MenuPrincipalPage.informacionUsuarioBtn;
import static userinterfaces.MenuPrincipalPage.menuDesplegableBtn;
import static userinterfaces.UserInfoPage.identificacionTxt;
import static userinterfaces.UserInfoPage.tipoIdTxt;
import static userinterfaces.UserInfoPage.correoTxt;
import static userinterfaces.UserInfoPage.nombresTxt;
import static userinterfaces.UserInfoPage.apellidosTxt;
import static userinterfaces.UserInfoPage.fechaNacimientoTxt;

public class ConsultaInformacionUsuarioStepDefinition {

    @When("ingrese a la seccion de informacion de usuario")
    public void ingreseALaSeccionDeInformacionDeUsuario() throws InterruptedException {
        clickEnElemento(menuDesplegableBtn);
        clickEnElemento(informacionUsuarioBtn);
        Thread.sleep(3000);
    }

    @Then("el visualizara la informacion registrada")
    public void elVisualizaraLaInformacionRegistrada(Map<String, String> usuario) {
        assert usuario.get("tipoId").equals(obtenerTexto(tipoIdTxt));
        assert usuario.get("identificacion").equals(obtenerTexto(identificacionTxt));
        assert usuario.get("correo").equals(obtenerTexto(correoTxt));
        assert usuario.get("nombres").equals(obtenerTexto(nombresTxt));
        assert usuario.get("apellidos").equals(obtenerTexto(apellidosTxt));
        assert usuario.get("fechaNacimiento").equals(obtenerTexto(fechaNacimientoTxt));
    }

    @After
    public void after() throws InterruptedException {
        fuckOff();
    }
}
