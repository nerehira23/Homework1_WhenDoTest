package activities.whenDo;

import controlAppium.Button;
import controlAppium.Label;
import controlAppium.TextBox;
import org.openqa.selenium.By;

public class CreateTaskScreen {

    public TextBox titleTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox descriptionTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button saveTaskButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    public Button deleteTaskButton = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
    public Button confirmDelete = new Button(By.id("android:id/button1"));

    public CreateTaskScreen(){

    }
}
