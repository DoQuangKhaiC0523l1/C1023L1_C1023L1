package actions.pages;

import actions.commons.AbstractPage;
import interfaces.HomePageInterface;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends AbstractPage {
    WebDriver driver;
    public HomePage(WebDriver driver_) {
        this.driver=driver_;
    }
    public void verifyHomePageIsDisplayed(String user){
        Assert.assertTrue(driver.findElement(By.xpath(HomePageInterface.marquee)).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath(String.format(HomePageInterface.TXT_WELCOME,user))).isDisplayed());
    }
}
