package BaiThi.Page;

import BaiThi.Interface.AddPaymentInterfaces;
import BaiThi.commons.AbstractPage;
import org.openqa.selenium.WebDriver;

public class AddPayment extends AbstractPage {
    WebDriver driver;
    public AddPayment(WebDriver driver){
        this.driver=driver;
    }
    public void selectValueInPaymentMethod(String cbb,String value){
        clickToElement(driver,AddPaymentInterfaces.CBB_PAYMENTMETHOD,cbb);
        clickToElement(driver,AddPaymentInterfaces.OPTION_PAYMENTMETHOD,value);
    }
    public void enterPaymentDate(String value){
        cleanToElement(driver,AddPaymentInterfaces.TXB_PAYMENTDATE);
        enter(driver,AddPaymentInterfaces.TXB_PAYMENTDATE,value);
    }
    public void enterAmount(String value){
        cleanToElement(driver,AddPaymentInterfaces.TXB_AMOUNT);
        enter(driver,AddPaymentInterfaces.TXB_AMOUNT,value);
    }
    public void enterNote(String value){
        clickToElement(driver,AddPaymentInterfaces.TXA_NOTECLICK1);
        clickToElement(driver,AddPaymentInterfaces.TXA_NOTECLICK);
        sendkeyToElement(driver,AddPaymentInterfaces.TXA_NOTE,value);
    }
    public void clickSave(){
        clickToElement(driver,AddPaymentInterfaces.BTN_SAVE);
    }
}
