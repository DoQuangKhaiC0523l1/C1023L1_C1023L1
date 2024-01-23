package BaiThi.Page;

import BaiThi.Interface.LoginPageInterfaces;
import BaiThi.commons.AbstractPage;
import org.openqa.selenium.WebDriver;

public class LoginPageBT extends AbstractPage {
    WebDriver driver;
    String url = "https://rise.fairsketch.com/signin";

    public LoginPageBT(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginPage() {
        openUrl(driver,url);
    }

//    public String getUserName() {
//       return getTextElement(driver, LoginPageInterfaces.getUserName);
//    }
//
//    public String getPass() {
//       return getTextElement(driver, LoginPageInterfaces.getPassWord);
//    }
    public void inputUserNameAndPassword(String user, String password) {
        cleanToElement(driver, LoginPageInterfaces.TXB_EMAIL);
        cleanToElement(driver, LoginPageInterfaces.TXB_PASSWORD);
        sendkeyToElement(driver, LoginPageInterfaces.TXB_EMAIL, user);
        sendkeyToElement(driver, LoginPageInterfaces.TXB_PASSWORD, password);
    }

    public void clickSignIn() {
        clickToElement(driver, LoginPageInterfaces.BTN_SIGNIN);
    }
}
