package BaiThi.Page;

import BaiThi.Interface.LoginPageInterfaces;
import actions.commons.AbstractPage;
import org.openqa.selenium.WebDriver;

public class LoginPageBT extends AbstractPage {
    WebDriver driver;

    public LoginPageBT(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginPage(String url) {
        openUrl(driver, url);
    }

    public String getUserName() {
       return getTextElement(driver, LoginPageInterfaces.getUserName);
    }

    public String getPass() {
       return getTextElement(driver, LoginPageInterfaces.getPassWord);
    }

    public void inputUserNameAndPassword(String user, String password) {
        cleanToElement(driver, LoginPageInterfaces.txbEmail);
        cleanToElement(driver, LoginPageInterfaces.txbPass);
        sendkeyToElement(driver, LoginPageInterfaces.txbEmail, user);
        sendkeyToElement(driver, LoginPageInterfaces.txbPass, password);
    }

    public void clickSignIn() {
        clickToElement(driver, LoginPageInterfaces.bttLogin);
    }
}
