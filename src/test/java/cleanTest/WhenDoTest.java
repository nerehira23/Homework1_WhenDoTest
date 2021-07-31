package cleanTest;

import activities.whenDo.CreateTaskScreen;
import activities.whenDo.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.net.MalformedURLException;

public class WhenDoTest {

    private MainScreen mainScreen = new MainScreen();
    private CreateTaskScreen createTaskScreen = new CreateTaskScreen();

    @Test
    public void verifyCreateTask() throws MalformedURLException {
        String title = "CREATE";
        mainScreen.addTaskButton.click();
        createTaskScreen.titleTextBox.setValue(title);
        createTaskScreen.descriptionTextBox.setValue("Esta es una descripcion");
        createTaskScreen.saveTaskButton.click();
        Assertions.assertEquals(title,mainScreen.nameTaskLabel.getText(),"Error una tarea no ha sido creado");

    }

    @Test
    public void verifyUpdateTask() throws MalformedURLException {

        String title = "CREATE";
        mainScreen.addTaskButton.click();
        createTaskScreen.titleTextBox.setValue(title);
        createTaskScreen.descriptionTextBox.setValue("Esta es una descripcion");
        createTaskScreen.saveTaskButton.click();

        title = "UPDATE";
        mainScreen.itemTask.click();
        createTaskScreen.titleTextBox.setValue(title);
        createTaskScreen.descriptionTextBox.setValue("Esta es una descripcion actualizada");
        createTaskScreen.saveTaskButton.click();
        Assertions.assertEquals(title,mainScreen.nameTaskLabel.getText(),"Error una tarea no ha sido actualizada");
    }


    @Test
    public void verifyDeleteTask() throws MalformedURLException {

        String title = "CREATE";
        mainScreen.addTaskButton.click();
        createTaskScreen.titleTextBox.setValue(title);
        createTaskScreen.descriptionTextBox.setValue("Esta es una descripcion");
        createTaskScreen.saveTaskButton.click();

        mainScreen.itemTask.click();
        createTaskScreen.deleteTaskButton.click();
        createTaskScreen.confirmDelete.click();
        boolean isPresent = mainScreen.itemTask.isPresent();
        Assertions.assertFalse(isPresent);
    }

    @AfterEach
    public void close() throws MalformedURLException {
        Session.getInstance().closeSession();
    }

}
