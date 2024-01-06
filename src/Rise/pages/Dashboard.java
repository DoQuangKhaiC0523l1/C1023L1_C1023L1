package Rise.pages;

import Rise.interfaces.DashboardInterfaces;
import actions.commons.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Dashboard extends AbstractPage {
    WebDriver driver;
    public Dashboard(WebDriver driver){
        this.driver=driver;
    }
    public void verifyTitleIsDisplayed(){
        Assert.assertTrue(driver.findElement(By.xpath(DashboardInterfaces.Title)).isDisplayed());
    }
}
