package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStack implements IDevice{

    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "ibethnerehira_cFq9G8");
        caps.setCapability("browserstack.key", "xG3djS21Aza6GNVHoPts");

        // Set URL of the application under test
        caps.setCapability("app", "bs://dc6d8592885b9d0e831d3d4c1d1c2421b4bdc623");

        // Specify device and os_version for testing
        caps.setCapability("device", "Huawei P30");
        caps.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "UCB Diplomado");
        caps.setCapability("build", "Modulo 43");
        caps.setCapability("name", "WhenDo");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);


        /* Write your Custom code here */
        return driver;
    }
}
