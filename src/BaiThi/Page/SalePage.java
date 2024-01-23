package BaiThi.Page;

import BaiThi.Interface.SaleInterfaces;
import BaiThi.commons.AbstractPage;
import org.openqa.selenium.WebDriver;

public class SalePage extends AbstractPage {
    WebDriver driver;
    public SalePage(WebDriver driver){
        this.driver=driver;
    }
    public void clickSales(){
        clickToElement(driver, SaleInterfaces.BTN_SALES);
    }
    public void clickInvoices(){
        clickToElement(driver,SaleInterfaces.BTN_INVOICES);
    }
    public void clickAddInvoice(){
        clickToElement(driver,SaleInterfaces.BTN_ADDINVOICE);
    }
    public void clickAddPayment(){
        clickToElement(driver,SaleInterfaces.BTN_ADDPAYMENT);
    }
    public void clickRecurring(){
        clickToElement(driver,SaleInterfaces.BTN_RECURRING);
    }
    public void clickDetailInvoice(){
        clickToElement(driver,SaleInterfaces.DETAIL_INVOICE);
    }
    public void clickListPayment(){
        clickToElement(driver,SaleInterfaces.BTN_PAYMENT);
    }
    public void clickDeletePayment(){
        clickToElement(driver,SaleInterfaces.BTN_DELETE);
    }
}
