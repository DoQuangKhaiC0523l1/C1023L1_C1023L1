package Rise.pages;

import Rise.interfaces.TaskPageInterfaces;
import actions.commons.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TaskPage extends AbstractPage {
    WebDriver driver;

    public TaskPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickTask() {
        clickToElement(driver, TaskPageInterfaces.ClickTask);
    }

    public void verifyTitleTaskDisplayed() {
        Assert.assertTrue(driver.findElement(By.xpath(TaskPageInterfaces.TitleTask)).isDisplayed());
    }

    public void clickAddTask() {
        clickToElement(driver, TaskPageInterfaces.ClickAddTask);
    }
    public void searchTask()  {
         enter(driver,TaskPageInterfaces.fieldSearch,"Demo");
    }
    public void clickNewTitle(){
        clickToElement(driver,TaskPageInterfaces.newTile);
    }
    public void inputComment(){
        sendkeyToElement(driver,TaskPageInterfaces.fieldComment,"khai");
    }

}
