package Rise.TestCase;

import Rise.pages.AddTaskPopup;
import Rise.pages.Dashboard;
import Rise.pages.LoginPage;
import Rise.pages.TaskPage;
import actions.commons.AbstractTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC extends AbstractTest {
    private LoginPage loginPage;
    private Dashboard dashboard;
    private TaskPage taskPage;
    private AddTaskPopup addTaskPopup;
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
        loginPage = new LoginPage(driver);
        System.out.println("Step-1: Open Login page");
        loginPage.openLoginPage(url);
        System.out.println("Step-2: Get UserName");
        user = loginPage.getUserName();
        System.out.println("Step-3: Get Password");
        password = loginPage.getPassword();
        System.out.println("Step-4: Input UserName and Password");
        loginPage.inputUserNameAndPassword(user, password);
        System.out.println("Step-5: Click SignIn button");
        loginPage.clickSignIn();
    }

    @Test(priority = 2)
    public void TC2_verifyTitleDashboard() {
        System.out.println("TC02");
        dashboard = new Dashboard(driver);
        System.out.println("Step-1: Verify Title Displayed ");
        dashboard.verifyTitleIsDisplayed();
    }

    @Test(priority = 3)
    public void TC3_verifyTask() {
        System.out.println("TC03");
        taskPage = new TaskPage(driver);
        System.out.println("Step-1: Click Tasks");
        taskPage.ClickTask();
        System.out.println("Step-2: Verify Title Displayed");
        taskPage.verifyTitleTaskDisplayed();
    }
    @Test(priority = 4)
    public void TC4_verifyAddTasks() throws InterruptedException {
        System.out.println("TC04");
        taskPage = new TaskPage(driver);
        addTaskPopup = new AddTaskPopup(driver);
        System.out.println("Step-1: Click AddTask");
        taskPage.clickAddTask();
        System.out.println("Step-2: Input Title");
        addTaskPopup.inputTitleInAddTask("Demo");
        System.out.println("Step-3: Input Description");
        addTaskPopup.inputDesc("Thực hành 2");
        System.out.println("Step-4: Choose value with name Client in Related To");
        addTaskPopup.RelatedTo();
        System.out.println("Step-5: Client");
        addTaskPopup.Client("Demo Client");
        System.out.println("Step-6: Choose value in Point");
        addTaskPopup.Point();
        System.out.println("Step-7: Choose value in AssignTo");
        addTaskPopup.AssignTo();
        System.out.println("Step-8: Choose value in Collaborators");
        addTaskPopup.Collaborators();
        System.out.println("Step-9: Choose value in Status");
        addTaskPopup.Status();
        System.out.println("Step-10: Choose value in Priority");
        addTaskPopup.Priority();
        System.out.println("Step-11: Choose value in Label");
        addTaskPopup.Label();
        System.out.println("Step-12: Choose value in StartDate");
        addTaskPopup.StartDate("20-10-2022");
        System.out.println("Step-13: Choose value in Deadline");
        addTaskPopup.Deadline("20-10-2023");
        System.out.println("Step-14: Click Recurring");
        addTaskPopup.Recurring();
        System.out.println("Step-15: Choose value in RepeatEvery");
        addTaskPopup.RepeatEvery("2");
        System.out.println("Step-16: Input value in Cycles");
        addTaskPopup.Cycles("2");
        System.out.println("Step-17: Click Save button");
        addTaskPopup.Save();
    }

    @Test(priority = 5)
    public void TC05_SearchTitle()  {
        System.out.println("TC05");
        taskPage = new TaskPage(driver);
        System.out.println("Step-1: Input Title");
        taskPage.searchTask();
    }
    @Test(priority = 6)
    public void TC06_Comment(){
        System.out.println("TC06");
        taskPage = new TaskPage(driver);
        System.out.println("Step-1: Click title");
        taskPage.clickNewTitle();
        System.out.println("Step-2: Comment");
    }

    @AfterTest
    public void After() {

    }
}
