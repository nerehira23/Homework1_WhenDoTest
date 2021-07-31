package runner;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class MyStepdefs {
    /**
     *{int} --> entero/numerico
     *{string} --> "cualquier valor"
     *{} --> cualquier valor
     *{float}
     * {word} --> para palabras sin espacio
     */


    @Given("tengo un usuario {string}")
    public void tengoUnUsuarioAdministrador(String user) {

    }

    @And("tengo abierto facebook app")
    public void tengoAbiertoFacebookApp() {
    }

    @When("yo ingreso mi {} en la caja de texto user")
    public void yoIngresoMiImoralesGmailComEnLaCajaDeTextoUser(String email) {
    }

    @And("yo ingreso mi {} en la caja de texto password")
    public void yoIngresoMiPwdEnLaCajaDeTextoPassword(String password) {
    }

    @And("yo hago clic en el boton login")
    public void yoHagoClicEnElBotonLogin() {
    }

    @Then("yo deberia de ingresar a facebook")
    public void yoDeberiaDeIngresarAFacebook() {
    }

    //Usando MAPS
    @When("yo realizo el login a la app")
    public void yoRealizoElLoginALaApp(Map<String, String> textboxes) {
        for (String key : textboxes.keySet()){
            System.out.println("Key: "+key+", Value:"+ textboxes.get(key));
        }
    }

    //USANDO OBJECT
    @When("yo realizo el login en la app")
    public void yoRealizoElLoginEnLaApp(List<FormularioLogin> login) {

    }

    @DataTableType
    public FormularioLogin covertMap(Map<String, String> value){
        return new FormularioLogin(value.get("email"),value.get("password"));
    }
}
