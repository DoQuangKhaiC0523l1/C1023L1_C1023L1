package actions.pages;

import actions.commons.AbstractPage;
import interfaces.RegisterPageInterface;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends AbstractPage {
    WebDriver driver;
    public RegisterPage(WebDriver driver_){
        this.driver=driver_;
    }
    public void enterEmail(String email) {
    sendkeyToElement(driver, RegisterPageInterface.txbEmail,email);
    }
    public void clickSubmit(){
        clickToElement(driver,RegisterPageInterface.bttSubmit);
    }
    public String getUserName(){
       return findAnElement(driver,RegisterPageInterface.UserName).getText();
    }
    public String getPassword(){
        return findAnElement(driver,RegisterPageInterface.PassWord).getText();
    }
}
