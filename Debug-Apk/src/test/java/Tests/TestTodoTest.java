package Tests;

import Base.Base;
import Pages.TestTodoPage;
import org.testng.annotations.Test;

public class TestTodoTest extends Base {

    @Test
    public void todoSuccess(){

          TestTodoPage testTodoPage = homePage.todo();
          testTodoPage.clickOnFab();
          testTodoPage.setToDoTask("Appium Automation");
          testTodoPage.clickSaveBtn();

    }

}
