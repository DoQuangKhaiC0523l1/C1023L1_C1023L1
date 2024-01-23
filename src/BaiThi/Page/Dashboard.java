package BaiThi.Page;

import BaiThi.Interface.DashboardInterface;
import BaiThi.commons.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Dashboard extends AbstractPage {
    WebDriver driver;
    public Dashboard (WebDriver driver){
        this.driver=driver;
    }

    public void verifyTitle(){
        Assert.assertTrue(driver.findElement(By.xpath(DashboardInterface.TITLE)).isDisplayed());
    }
}
