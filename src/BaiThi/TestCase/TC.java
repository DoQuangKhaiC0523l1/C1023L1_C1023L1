package BaiThi.TestCase;

import BaiThi.Page.*;
import BaiThi.commons.AbstractTest;
import BaiThi.commons.DataProviderFactory;
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
    private Dashboard dashboard;
    private AddInvoice addInvoice;

    WebDriver driver;
    Actions actions;
    String email, user, password;

    @Parameters({"browser"})
    @BeforeTest
    public void beforeTest(String browser) {
        driver = openMultiBrowsers(browser);
        email = randomEmail();
    }

    @Test(dataProvider = "test", dataProviderClass = DataProviderFactory.class)
    public void TC1_verifyLogin(String user, String password) {
        System.out.println("TC01");
        loginPage = new LoginPageBT(driver);

        System.out.println("Step-1: Open Login page");
        loginPage.openLoginPage();

        System.out.println("Step-2: Input UserName and Password");
        loginPage.inputUserNameAndPassword(user, password);

        System.out.println("Step-3: Click SignIn button");
        loginPage.clickSignIn();
    }

    @Test(priority = 2)
    public void TC2_VerifyDashboard() {
        System.out.println("TC02");
        dashboard = new Dashboard(driver);

        System.out.println("Step-1: Verify Title");
        dashboard.verifyTitle();
    }

    @Test(priority = 3)
    public void TC3_SalePage() {
        salePage = new SalePage(driver);
        System.out.println("TC03");

        System.out.println("Step-1: Click Sales");
        salePage.clickSales();

        System.out.println("Step-2: Click Invoices");
        salePage.clickInvoices();
    }

    @Test(priority = 4)
    public void TC4_VerifyAddInvoice() {
        System.out.println("TC04");
        salePage = new SalePage(driver);
        addInvoice = new AddInvoice(driver);
        System.out.println("Step-1: Click Add Invoice");
        salePage.clickAddInvoice();

        System.out.println("Step-2: Input Bill date");
        addInvoice.enterBillDate("20-10-2004");

        System.out.println("Step-3: Input Due date");
        addInvoice.enterDuaDate("20-10-2005");

        System.out.println("Step-4: Select value with name Abe Bogisich in the Client");
        addInvoice.selectValueInClient("Client", "Abe Bogisich ");

        System.out.println("Step-5: Select value with name Mobile Game Development in the Project");
        addInvoice.selectValueInProject("Project", "Mobile Game Development ");

        System.out.println("Step-6: Select value in TAX");
        addInvoice.selectValueInTAX("TAX", "Tax (10%) ");

        System.out.println("Step-7: Select value in Second TAX");
        addInvoice.selectValueInSecondTAX("Second TAX", "Tax (10%) ");

        System.out.println("Step-8: Select value in TDS");
        addInvoice.selectValueInTDS("TDS", "Tax (10%) ");

        System.out.println("Step-9: Check to checkbox Recurring");
        addInvoice.checkToRecurring();

        System.out.println("Step-10: Input Repeat every");
        addInvoice.enterRepeatEvery("3");

        System.out.println("Step-11: Select value Day in cbb Time");
        addInvoice.selectValueInTime("Day(s)");

        System.out.println("Step-12: Input Cycle");
        addInvoice.enterCycle("2");

        System.out.println("Step-13: Input Note");
        addInvoice.enterNote("khai dep trai");

        System.out.println("Step-14: Click Save button");
        addInvoice.clickSave();
    }

    @Test(priority = 5)
    public void TC5_AddPaymentFirstTime() {
        System.out.println("TC05");
        salePage = new SalePage(driver);
        addPayment = new AddPayment(driver);

        System.out.println("Step-1: Back to Invoice page");
        salePage.clickInvoices();

        System.out.println("Step-2: Click Recurring on the navigation bar");
        salePage.clickRecurring();

        System.out.println("Step-3: Click on Invoice has been add");
        salePage.clickDetailInvoice();

        System.out.println("Step-4: Click Add Payment");
        salePage.clickAddPayment();

        System.out.println("Step-5: Select value with name cash in Payment Method");
        addPayment.selectValueInPaymentMethod("Payment method", "Cash ");

        System.out.println("Step-6: Input Payment Date");
        addPayment.enterPaymentDate("20-10-2020");

        System.out.println("Step-7: Input Amount");
        addPayment.enterAmount("200");

        System.out.println("Step-8: Input Note");
        addPayment.enterNote("Khai dep qua");

        System.out.println("Step-9: Click Save button");
        addPayment.clickSave();
    }

    @Test(priority = 6)
    public void TC6_AddPaymentSecondTime() {
        System.out.println("TC06");
        salePage = new SalePage(driver);
        addPayment = new AddPayment(driver);

        System.out.println("Step-1: Click Add Payment");
        salePage.clickAddPayment();

        System.out.println("Step-2: Select value with name cash in Payment Method");
        addPayment.selectValueInPaymentMethod("Payment method", "Cash ");

        System.out.println("Step-3: Input Payment Date");
        addPayment.enterPaymentDate("20-10-2020");

        System.out.println("Step-4: Input Amount");
        addPayment.enterAmount("200");

        System.out.println("Step-5: Input Note");
        addPayment.enterNote("Khai dep qua");

        System.out.println("Step-6: Click Save button");
        addPayment.clickSave();
    }

    @Test(priority = 7)
    public void TC6_AddPaymentThirdTime() {
        System.out.println("TC06");
        salePage = new SalePage(driver);
        addPayment = new AddPayment(driver);

        System.out.println("Step-1: Click Add Payment");
        salePage.clickAddPayment();

        System.out.println("Step-2: Select value with name cash in Payment Method");
        addPayment.selectValueInPaymentMethod("Payment method", "Cash ");

        System.out.println("Step-3: Input Payment Date");
        addPayment.enterPaymentDate("20-10-2020");

        System.out.println("Step-4: Input Amount");
        addPayment.enterAmount("200");

        System.out.println("Step-5: Input Note");
        addPayment.enterNote("Khai dep qua");

        System.out.println("Step-6: Click Save button");
        addPayment.clickSave();
    }

    @Test(priority = 7)
    public void TC7_DeletePaymentFirstTime() {
        System.out.println("TC07");
        salePage = new SalePage(driver);

        System.out.println("Step-1: Click List Payment");
        salePage.clickListPayment();

        System.out.println("Step-2: Click Delete button");
        salePage.clickDeletePayment();
    }

    @Test(priority = 8)
    public void TC7_DeletePaymentSecondTime() {
        System.out.println("TC07");
        salePage = new SalePage(driver);

        System.out.println("Step-1: Click List Payment");
        salePage.clickListPayment();

        System.out.println("Step-2: Click Delete button");
        salePage.clickDeletePayment();
    }

    @Test(priority = 9)
    public void TC7_DeletePaymentThirdTime() {
        System.out.println("TC07");
        salePage = new SalePage(driver);

        System.out.println("Step-1: Click List Payment");
        salePage.clickListPayment();

        System.out.println("Step-2: Click Delete button");
        salePage.clickDeletePayment();
    }

    @AfterTest
    public void After() {
    }
}
