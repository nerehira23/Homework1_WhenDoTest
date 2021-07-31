package session;

import controlAppium.Label;
import factoryDevices.FactoryDevice;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.time.Duration;

public class Session {

    private static Session instance = null;
    private AppiumDriver appiumDriver;

    private Session() throws MalformedURLException {
        appiumDriver = FactoryDevice.make(FactoryDevice.DeviceType.ANDROID).create();
    }

    //synchronized --> no usar para evitar problemas de ejecución paralela
    public static Session getInstance() throws MalformedURLException {
        if(instance==null)
            instance = new Session();
        return instance;
    }

    public void closeSession(){
        appiumDriver.quit();
        instance=null;
    }

    public AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }

    public void swipe() throws MalformedURLException {

        Label startControl = new Label(By.xpath("//android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup[2]"));
        Label endControl = new Label(By.xpath("//android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup[1]"));

        int startControlX=startControl.getControl().getLocation().getX();
        int startControlY=startControl.getControl().getLocation().getY();

        int endControlX=endControl.getControl().getLocation().getX();
        int endControlY=endControl.getControl().getLocation().getY();
        TouchAction action = new TouchAction(appiumDriver);
        action.press(PointOption.point(startControlX,startControlY)).
                waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).
                moveTo(PointOption.point(endControlX,endControlY)).
                release().perform();
    }
}
