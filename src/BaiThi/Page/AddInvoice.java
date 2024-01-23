package BaiThi.Page;

import BaiThi.Interface.AddInvoiceInterface;
import BaiThi.commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AddInvoice extends AbstractPage {
    WebDriver driver;
    Actions actions;
    public AddInvoice(WebDriver driver ){
        this.driver=driver;
    }
    public void enterBillDate(String value) {
        cleanToElement(driver,AddInvoiceInterface.TXB_BILLDATE);
        enter(driver, AddInvoiceInterface.TXB_BILLDATE,value);
    }
    public void enterDuaDate(String value){
        enter(driver, AddInvoiceInterface.TXB_DUADATE,value);
    }
    public void selectValueInClient(String cbb , String value){
        clickToElement(driver,AddInvoiceInterface.CBB_CLIENT,cbb);
        clickToElement(driver,AddInvoiceInterface.OPTION_CLIENT,value);
    }
    public void selectValueInProject(String cbb , String value){
        clickToElement(driver,AddInvoiceInterface.CBB_PROJECT,cbb);
        clickToElement(driver,AddInvoiceInterface.OPTION_PROJECT,value);
    }
    public void selectValueInTAX(String cbb , String value){
        clickToElement(driver,AddInvoiceInterface.CBB_TAX,cbb);
        clickToElement(driver,AddInvoiceInterface.OPTION_TAX,value);
    }
    public void selectValueInSecondTAX(String cbb , String value){
        clickToElement(driver,AddInvoiceInterface.CBB_SECONDTAX,cbb);
        clickToElement(driver,AddInvoiceInterface.OPTION_SECONDTAX,value);
    }
    public void selectValueInTDS(String cbb , String value){
        clickToElement(driver,AddInvoiceInterface.CBB_TDS,cbb);
        clickToElement(driver,AddInvoiceInterface.OPTION_TDS,value);
    }
    public void checkToRecurring(){
        checkToCheckbox(driver,AddInvoiceInterface.CXB_RECURRING);
    }
    public void enterRepeatEvery(String value){
        enter(driver,AddInvoiceInterface.TXB_REPEATEVERY,value);
    }
    public void selectValueInTime(String value){
        clickToElement(driver,AddInvoiceInterface.CBB_TIME);
        enter(driver,AddInvoiceInterface.OPTION_TIME,value);
    }
    public void enterCycle(String value){
        enter(driver,AddInvoiceInterface.TXB_CYCLE,value);
    }
    public void enterNote(String value){
        enter(driver,AddInvoiceInterface.TXA_NOTE,value);
    }
    public void clickSave(){
        clickToElement(driver,AddInvoiceInterface.BTN_SAVE);
    }
}
