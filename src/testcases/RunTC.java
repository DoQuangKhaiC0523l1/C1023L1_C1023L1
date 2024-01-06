package testcases;

import actions.pages.HomePage;
import actions.pages.LoginPage;
import actions.pages.RegisterPage;
import org.testng.annotations.Parameters;

import actions.commons.AbstractTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RunTC extends AbstractTest {
    WebDriver driver;
    private LoginPage loginPage;
    private RegisterPage registerPage;
    private HomePage homePage;


    String url = "https://demo.guru99.com/V4";

    String email, user, password;

    @Parameters({"browser"})
    @BeforeTest
    public void Before(String browser) {
        driver = openMultiBrowsers(browser);
        email = randomEmail();
    }

    @Test
    public void TC_1() {
        loginPage = new LoginPage(driver);
        registerPage = new RegisterPage(driver);
        homePage = new HomePage(driver);
        System.out.println("Step-1: Open Website");
        loginPage.openLoginPage(url);
        System.out.println("Step-2: Click Here");
        loginPage.ClickHere();
        System.out.println("Step-3: Enter Email");
        registerPage.enterEmail(email);
        System.out.println("Step-4: Click submit button");
        registerPage.clickSubmit();
        System.out.println("Step-5: Get UserID");
        user = registerPage.getUserName();
        System.out.println("Step-6: Get Password");
        password = registerPage.getPassword();

    }

    @Test
    public void TC_2() {
        loginPage = new LoginPage(driver);
        registerPage = new RegisterPage(driver);
        homePage = new HomePage(driver);
        System.out.println("Step-1: Back to LoginPage");
        loginPage.openLoginPage(url);
        System.out.println("Step-2: Enter Email");
        loginPage.inputUserName(user);
        System.out.println("Step-3: Enter Password");
        loginPage.inputPass(password);
        System.out.println("Step-4: Click Login button");
        loginPage.clickLoginbtt();
        System.out.println("Step-5: Verify HomePage");
        homePage.verifyHomePageIsDisplayed(user);
        System.out.println(user);
    }


    @AfterTest
    public void After() {
        driver.quit();
    }
}
