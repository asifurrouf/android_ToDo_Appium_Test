package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class TestTodoPage {

    private AndroidDriver driver;

    private By clickonfab =By.id("com.example.todo:id/fab");
    private By todoTask = By.id("com.example.todo:id/edit_todo");

    private By saveBtn = By.id("com.example.todo:id/button_save");


    public TestTodoPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickOnFab(){
        driver.findElement(clickonfab).click();
    }

    public void setToDoTask(String email){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(todoTask).sendKeys(email);
    }

    public void clickSaveBtn(){
        driver.findElement(saveBtn).click();
    }

}
