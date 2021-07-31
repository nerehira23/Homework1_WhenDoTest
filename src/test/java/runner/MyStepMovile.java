package runner;

import activities.whenDo.CreateTaskScreen;
import activities.whenDo.MainScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.net.MalformedURLException;
import java.util.Map;

public class MyStepMovile {

    private MainScreen mainScreen = new MainScreen();
    private CreateTaskScreen createTaskScreen = new CreateTaskScreen();

    @Given("la app WhenDo esta abierta")
    public void laAppWhenDoEstaAbierta() {
    }

    @And("yo hago click en el boton agregarTarjea")
    public void yoHagoClickEnElBotonAgregarTarjea() throws MalformedURLException {
        mainScreen.addTaskButton.click();
    }

    @When("yo creo una tarea")
    public void yoCreoUnaTarea(Map<String, String> datos) throws MalformedURLException {
        createTaskScreen.titleTextBox.setValue(datos.get("titulo"));
        createTaskScreen.descriptionTextBox.setValue(datos.get("descripcion"));
    }

    @And("yo realizo click en el boton guardar")
    public void yoRealizoClickEnElBotonGuardar() throws MalformedURLException {
        createTaskScreen.saveTaskButton.click();
    }

    @Then("la tarea con el nombre {string} deberia ser creada")
    public void laTareaConElNombreDeberiaSerCreada(String expectTitle) throws MalformedURLException {
        Assertions.assertEquals(expectTitle,mainScreen.nameTaskLabel.getText(),"Error una tarea no ha sido creado");
    }
}
