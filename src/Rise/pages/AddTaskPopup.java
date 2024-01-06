package Rise.pages;

import Rise.interfaces.AddTaskPopupInterface;
import actions.commons.AbstractPage;
import org.openqa.selenium.WebDriver;

public class AddTaskPopup extends AbstractPage {
    WebDriver driver;
    public AddTaskPopup (WebDriver driver){
        this.driver=driver;
    }
    public void inputTitleInAddTask(String value){
        sendkeyToElement(driver, AddTaskPopupInterface.txbTitle,value);}
    public void inputDesc(String value){
        sendkeyToElement(driver,AddTaskPopupInterface.txbDescription,value);}
    public void RelatedTo() throws InterruptedException {
        clickToElement(driver,AddTaskPopupInterface.clickRelate);
        clickToElement(driver,AddTaskPopupInterface.cbbRelated);
        Thread.sleep(1000);
    }
    public void Client(String value){
        clickToElement(driver,AddTaskPopupInterface.clickClient);
        enter(driver,AddTaskPopupInterface.searchClient,value);
    }
    public void Point(){
        clickToElement(driver,AddTaskPopupInterface.clickPoints);
        clickToElement(driver,AddTaskPopupInterface.cbbPoints);
    }
    public void AssignTo(){
        clickToElement(driver,AddTaskPopupInterface.clickAssign);
        clickToElement(driver,AddTaskPopupInterface.cbbAssign);
    }
    public void Collaborators(){
        clickToElement(driver,AddTaskPopupInterface.clickCollaborators);
        clickToElement(driver,AddTaskPopupInterface.cbbCollaborators);
    }
    public void Status(){
        clickToElement(driver,AddTaskPopupInterface.clickStatus);
        clickToElement(driver,AddTaskPopupInterface.cbbStatus);
    }
    public void Priority(){
        clickToElement(driver,AddTaskPopupInterface.clickPriority);
        clickToElement(driver,AddTaskPopupInterface.cbbPriority);
    }
    public void Label(){
        clickToElement(driver,AddTaskPopupInterface.clickLabel);
        clickToElement(driver,AddTaskPopupInterface.cbbLabel);
    }
    public void StartDate(String value){
        clickToElement(driver,AddTaskPopupInterface.clickStartDate);
        enter(driver,AddTaskPopupInterface.StartDate,value);
    }

    public void Deadline(String value){
        clickToElement(driver,AddTaskPopupInterface.clickDeadline);
        enter(driver,AddTaskPopupInterface.Deadline,value);
    }
    public void Recurring(){
        clickToElement(driver,AddTaskPopupInterface.cxbRecurring);
    }
    public void RepeatEvery(String value){
        sendkeyToElement(driver,AddTaskPopupInterface.txbRepeatEvery,value);
        clickToElement(driver,AddTaskPopupInterface.clickTime);
        clickToElement(driver,AddTaskPopupInterface.Time);
    }
    public void Cycles(String value){
        sendkeyToElement(driver,AddTaskPopupInterface.Cycles,value);
    }
    public void Save() throws InterruptedException {
        clickToElement(driver,AddTaskPopupInterface.bttSave);

    }



}
