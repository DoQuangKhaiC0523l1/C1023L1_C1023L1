package BaiThi.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class AbstractTest {
    WebDriver driver;
    Actions actions;
//    @Parameters({"browser"})
//    @BeforeTest
        public WebDriver openMultiBrowsers(String browser) {
//        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", ".\\src\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
//        } else if (browser.equalsIgnoreCase("firefox")){
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\dok96\\IdeaProjects\\POM\\src\\resources\\geckodriver.exe");
//        driver = new FirefoxDriver();}
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        actions = new Actions(driver);
   return driver; }
    public String randomEmail() {
        Random random = new Random();
        int number = random.nextInt(999999);
        String randomEmail = "automation" + number + "@gmail.com";
        return randomEmail;
}}