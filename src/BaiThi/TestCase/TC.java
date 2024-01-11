package BaiThi.TestCase;

import BaiThi.Page.AddPayment;
import BaiThi.Page.LoginPageBT;
import BaiThi.Page.SalePage;
import actions.commons.AbstractTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC extends AbstractTest {
    private LoginPageBT loginPage;
    private SalePage salePage;
    private AddPayment addPayment;
    WebDriver driver;
    Actions actions;
    String url = "https://rise.fairsketch.com/signin";
    String email, user, password;

    @Parameters({"browser"})
    @BeforeTest
    public void beforeTest(String browser) {
        driver = openMultiBrowsers(browser);
        email = randomEmail();
    }

    @Test(priority = 1)
    public void TC1_verifyLogin() {
        System.out.println("TC01");
        loginPage = new LoginPageBT(driver);
        System.out.println("Step-1: Open Login page");
        loginPage.openLoginPage(url);
        System.out.println("Step-2: Get UserName");
        user = loginPage.getUserName();
        System.out.println("Step-3: Get Password");
        password = loginPage.getPass();
        System.out.println("Step-4: Input UserName and Password");
        loginPage.inputUserNameAndPassword(user, password);
        System.out.println("Step-5: Click SignIn button");
        loginPage.clickSignIn();
    }

    @Test(priority = 2)
    public void TC2_SalePage() throws InterruptedException {
        salePage = new SalePage(driver);
        addPayment = new AddPayment(driver);
        System.out.println("TC02");
        System.out.println("Step-1: Click Sales");
        salePage.clickSales();
        System.out.println("Step-2: Click Invoices");
        salePage.clickInvoices();
    }

    @Test(priority = 3)
    public void TC3_AddPaymentLan1() throws InterruptedException {
        System.out.println("TC03");
        salePage = new SalePage(driver);
        addPayment = new AddPayment(driver);
        System.out.println("Lan 1");
        System.out.println("Step-1: Click Add Payment");
        salePage.clickAddPayment();
        System.out.println("Step-2: Input invoice");
        addPayment.inputInvoice();
        System.out.println("Step-3: Input Payment method");
        addPayment.inputPaymentmethod();
        System.out.println("Step-4: Choose value in Payment Date");
        addPayment.selectPaymentDate();
        System.out.println("Step-5: Input Amount");
        addPayment.inputAmount();
        System.out.println("Step-6: Input Note");
        addPayment.inputNote();
        System.out.println("Step-7: Click Save");
        addPayment.clickSave();
        Thread.sleep(5000);
    }

    @Test(priority = 4)
    public void TC4_AddPaymentLan2() throws InterruptedException {
        System.out.println("TC04");
        salePage = new SalePage(driver);
        addPayment = new AddPayment(driver);
        System.out.println("Lan 2");
        System.out.println("Step-1: Click Add Payment");
        salePage.clickAddPayment();
        System.out.println("Step-2: Input invoice");
        addPayment.inputInvoice();
        System.out.println("Step-3: Input Payment method");
        addPayment.inputPaymentmethod();
        System.out.println("Step-4: Choose value in Payment Date");
        addPayment.selectPaymentDate();
        System.out.println("Step-5: Input Amount");
        addPayment.inputAmount();
        System.out.println("Step-6: Input Note");
        addPayment.inputNote();
        System.out.println("Step-7: Click Save");
        addPayment.clickSave();
        Thread.sleep(5000);
    }
    @Test(priority = 5)
    public void TC5_AddPaymentLan3() throws InterruptedException {
        System.out.println("TC05");
        salePage = new SalePage(driver);
        addPayment = new AddPayment(driver);
        System.out.println("Lan 3");
        System.out.println("Step-1: Click Add Payment");
        salePage.clickAddPayment();
        System.out.println("Step-2: Input invoice");
        addPayment.inputInvoice();
        System.out.println("Step-3: Input Payment method");
        addPayment.inputPaymentmethod();
        System.out.println("Step-4: Choose value in Payment Date");
        addPayment.selectPaymentDate();
        System.out.println("Step-5: Input Amount");
        addPayment.inputAmount();
        System.out.println("Step-6: Input Note");
        addPayment.inputNote();
        System.out.println("Step-7: Click Save");
        addPayment.clickSave();
        Thread.sleep(5000);
    }
    @Test(priority = 6)
    public void TC6_Delete1(){
        System.out.println("TC06");
        salePage= new SalePage(driver);
        System.out.println("Step-1: Click wrench");
        salePage.clickButtonWrench();
        System.out.println("Step-2: Click Delete");
        salePage.clickButtonDelete();
        System.out.println("Step-3: Confirm Delete");
        salePage.confirmDelete();
    }
    @Test(priority = 7)
    public void TC7_Delete2(){
        System.out.println("TC07");
        salePage= new SalePage(driver);
        System.out.println("Step-1: Click wrench");
        salePage.clickButtonWrench();
        System.out.println("Step-2: Click Delete");
        salePage.clickButtonDelete();
        System.out.println("Step-3: Confirm Delete");
        salePage.confirmDelete();
    }
    @AfterTest
    public void After() throws InterruptedException {
    }
}
