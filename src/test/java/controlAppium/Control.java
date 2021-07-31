package controlAppium;


import io.appium.java_client.touch.WaitOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import session.Session;

import java.net.MalformedURLException;

public class Control {
    protected WebElement control;
    protected By locator;

    public Control(By locator){
        this.locator = locator;
    }

    protected void findControl() throws MalformedURLException {
        this.control= Session.getInstance().getAppiumDriver().findElement(this.locator);
    }

    public void click() throws MalformedURLException {
        this.findControl();
        this.control.click();
    }

    public String getText() throws MalformedURLException {
        this.findControl();
        return this.control.getText();
    }

    public WebElement getControl() throws MalformedURLException {
        this.findControl();
        return control;
    }
    public boolean isPresent() throws MalformedURLException {
        try {
            this.findControl();
            control.findElement(locator).isDisplayed();
            return true;
        }catch (Exception e){
            return false;
        }
    }



}
