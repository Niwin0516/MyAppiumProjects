
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class StartDriverSession {
    public static AppiumDriver<AndroidElement> initializeDriver(String platformName) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
        capabilities.setCapability(MobileCapabilityType.UDID, "15447372190008D"); // Pastikan ini sesuai dengan UDID perangkat Anda
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/niwinpriskilanapitupulu/Desktop/MyAppiumProjects/src/main/resources/Dealls_Jobs_base.apk");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");


        URI uri = new URI("http://0.0.0.0:4723");
        URL url = uri.toURL();
        AppiumDriver<AndroidElement> driver = new AndroidDriver<>(url, capabilities);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
