package Base;

import Pages.HomePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {

    AndroidDriver driver;
    protected HomePage homePage;

    @BeforeTest
    public void setDriver() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("platformName","Android");
        cap.setCapability("deviceName","Galaxy S9 plus");
        cap.setCapability("app","E:\\TODO\\app-debug.apk");
        cap.setCapability("udid","01152c7a0904");
        cap.setCapability("platformVersion","9");


        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);

        homePage = new HomePage(driver);

//        driver.quit();

    }

}
