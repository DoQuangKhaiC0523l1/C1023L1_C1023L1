package BaiThi.Page;

import BaiThi.Interface.SaleInterfaces;
import actions.commons.AbstractPage;
import org.openqa.selenium.WebDriver;

public class SalePage extends AbstractPage {
    WebDriver driver;
    public SalePage(WebDriver driver){
        this.driver=driver;
    }
    public void clickSales(){
        clickToElement(driver, SaleInterfaces.Sales);
    }
    public void clickInvoices(){
        clickToElement(driver,SaleInterfaces.Invoices);
    }
    public void clickAddPayment(){
        clickToElement(driver,SaleInterfaces.addPayment);
    }
    public void clickButtonWrench(){
        clickToElement(driver,SaleInterfaces.bttWrench);
    }
    public void clickButtonDelete(){
        clickToElement(driver,SaleInterfaces.bttDelete);
    }
    public void confirmDelete(){
        clickToElement(driver,SaleInterfaces.confirmDelete);
    }
}
