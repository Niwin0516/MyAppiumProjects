import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class login {
    private static AppiumDriver<AndroidElement> driver;

    @BeforeClass
    public static void setUp() throws Exception {
        driver = StartDriverSession.initializeDriver("Android");

    }

    @Test
    public void detailsJob() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Skip\"]"));
        element.click();
        List<AndroidElement> elements = driver.findElements(By.xpath("//android.widget.ScrollView"));

        if (!elements.isEmpty()) {
            WebElement firstElement = elements.get(0);
            firstElement.click();
        } else {
            System.out.println("Daftar elemen kosong.");
        }
    }
    @Test
    public  void companySearch(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Skip\"]"));
        element.click();
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Companies\"]")).click();
    }

    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}