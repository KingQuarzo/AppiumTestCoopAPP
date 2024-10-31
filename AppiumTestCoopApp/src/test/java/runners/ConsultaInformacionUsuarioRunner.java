package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ConsultaInformacionUsuario.feature",
        glue = "stepdefinitions")
public class ConsultaInformacionUsuarioRunner {
}
