package basicTest;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasicUnit {

    private AppiumDriver appiumDriver;

    @BeforeEach
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName","HUAWEI P30 lite");
        desiredCapabilities.setCapability("platformVersion","10");
        desiredCapabilities.setCapability("appPackage","com.vrproductiveapps.whendo");
        desiredCapabilities.setCapability("appActivity",".ui.HomeActivity");
        desiredCapabilities.setCapability("platformName","Android");

        appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        appiumDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @AfterEach
    public void cleanUp() throws InterruptedException {
        Thread.sleep(5000);
        appiumDriver.quit();
    }
    @Test
    public void createTaskWhenDo(){
        // Click +
        appiumDriver.findElement(By.id("com.vrproductiveapps.whendo:id/fab")).click();
        // Set Title
        appiumDriver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextTitle")).sendKeys("REMOVE");
        // Set Notas
        appiumDriver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextNotes")).sendKeys("esta es una descripcion");
        // Click Save
        appiumDriver.findElement(By.id("com.vrproductiveapps.whendo:id/saveItem")).click();
        // Verificacion
        String expectedResult="REMOVE";
        String actualResult=appiumDriver.findElement(By.id("com.vrproductiveapps.whendo:id/home_list_item_text")).getText();
        Assertions.assertEquals(expectedResult,actualResult,"ERROR tarea no fue creado!");
    }
}
