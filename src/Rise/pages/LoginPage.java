package Rise.pages;

import Rise.interfaces.LoginPageInterfaces;
import actions.commons.AbstractPage;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void openLoginPage(String url){
        openUrl(driver,url);
    }
    public String getUserName(){
        return findAnElement(driver,LoginPageInterfaces.getUserName).getText();
    }
    public String getPassword(){
        return findAnElement(driver,LoginPageInterfaces.getPassWord).getText();
    }
    public void inputUserNameAndPassword(String user,String password){
        cleanToElement(driver,LoginPageInterfaces.txbEmail);
        cleanToElement(driver,LoginPageInterfaces.txbPass);
        sendkeyToElement(driver,LoginPageInterfaces.txbEmail,user);
        sendkeyToElement(driver,LoginPageInterfaces.txbPass,password);
    }
    public void clickSignIn(){
        clickToElement(driver,LoginPageInterfaces.bttLogin);
    }
}
