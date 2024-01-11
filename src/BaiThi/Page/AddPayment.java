package BaiThi.Page;

import BaiThi.Interface.AddPaymentInterfaces;
import actions.commons.AbstractPage;
import org.openqa.selenium.WebDriver;

public class AddPayment extends AbstractPage {
    WebDriver driver;
    public AddPayment(WebDriver driver){
        this.driver=driver;
    }
    public void inputInvoice(){
        clickToElement(driver,AddPaymentInterfaces.clickInvoice);
        enter(driver, AddPaymentInterfaces.cbbInvoice,"INVOICE #20");
    }
    public void inputPaymentmethod() {
        clickToElement(driver,AddPaymentInterfaces.clickPaymentMethod);
        enter(driver,AddPaymentInterfaces.cbbPaymentMethod,"Cash");
    }
    public void selectPaymentDate() {
       sendkeyToElement(driver,AddPaymentInterfaces.inputPayment,"1-2-2004");
    }
    public void inputAmount(){
        cleanToElement(driver,AddPaymentInterfaces.txbAmount);
        sendkeyToElement(driver,AddPaymentInterfaces.txbAmount,"1");
    }
    public void inputNote(){
        enter(driver,AddPaymentInterfaces.txbNote,"Do Quang Khai");
    }
    public void clickSave(){
        clickToElement(driver,AddPaymentInterfaces.bttSave);
    }
}
