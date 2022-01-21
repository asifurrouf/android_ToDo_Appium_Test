package Pages;

import io.appium.java_client.android.AndroidDriver;

public class HomePage{

    private final AndroidDriver driver;

    public HomePage(AndroidDriver driver){
        this.driver = driver;
    }

    public TestTodoPage todo(){
        return new TestTodoPage(driver);
    }


}
