package BaiThi.actions.pages;

import BaiThi.actions.commons.AbstractPage;
import interfaces.LoginPageInterface;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {
    WebDriver driver;

    public LoginPage(WebDriver driver_) {
        this.driver = driver_;
    }

    public void openLoginPage(String url) {
        openUrl(driver, url);
    }

    public void ClickHere() {
        clickToElement(driver, LoginPageInterface.HERE_LINK);
        back(driver);
        clickToElement(driver, LoginPageInterface.HERE_LINK);
    }

    public void inputUserName   (String user) {
        sendkeyToElement(driver, LoginPageInterface.txbUserId, user);
    }

    public void inputPass(String password) {
        sendkeyToElement(driver, LoginPageInterface.txbPassWord, password);
    }

    public void clickLoginbtt() {
        clickToElement(driver, LoginPageInterface.bttLogin);
    }
}

