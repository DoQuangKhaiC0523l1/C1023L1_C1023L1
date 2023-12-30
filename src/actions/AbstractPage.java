package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class AbstractPage {
    //WebBrowser
    public void openUrl(WebDriver driver,String url){
        driver.get(url);
    }
    public String getTitle(WebDriver driver){
        return driver.getTitle();
    }
    public String getCurrentUrl(WebDriver driver){
        return driver.getCurrentUrl();
    }
    public String getPageSource(WebDriver driver){
        return driver.getPageSource();
    }
    public void back(WebDriver driver){
        driver.navigate().back();
    }
    public void forward(WebDriver driver){
        driver.navigate().forward();
    }
    public void refresh(WebDriver driver){
        driver.navigate().refresh();
    }
    public WebElement findAnElement(WebDriver driver,String locator){
        return driver.findElement(By.xpath(locator));
    }
    public List<WebElement> findListElement(WebDriver driver, String locator){
       return driver.findElements(By.xpath(locator));
    }
    //WebElement

//    public void waitForElementVisible(WebDriver driver,String locator){
//        WebElement element = findAnElement(driver,locator);
//        WebDriverWait wait  = new WebDriverWait(driver,30);
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }
    public void waitForElementVisible(WebDriver driver,String locator){
        List <WebElement> element = findListElement(driver,locator);
        WebDriverWait wait  = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }
    public void waitForElementInvisible(WebDriver driver,String locator){
        WebElement element = findAnElement(driver,locator);
        By xpath = By.xpath(locator);
        WebDriverWait wait  = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(xpath));
    }
    public void waitForElementClickable(WebDriver driver,String locator){
        WebElement element = findAnElement(driver,locator);
        WebDriverWait wait  = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
}
    public void waitForElementPresence(WebDriver driver,String locator){
        By xpath = By.xpath(locator);
        WebDriverWait wait  = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
    }
    public void sendketToElement(WebDriver driver,String locator,String value){
        WebElement element = findAnElement(driver,locator);
        waitForElementVisible(driver,locator);
        element.sendKeys(value);
    }
    public void selectItemInComboboxByText(WebDriver driver,String locator,String value){
        WebElement element = findAnElement(driver,locator);
        Select select =new Select(element);
        element.sendKeys(value);
    }
    public void selectItemInComboboxByValue(WebDriver driver,String locator,String value){
        WebElement element = findAnElement(driver,locator);
        Select select =new Select(element);
        element.sendKeys(value);
    }
    public void selectItemByVisibleText(WebDriver driver,String locator,String value){
        WebElement element = findAnElement(driver,locator);
        scrollToElement(driver,locator);
        element.click();
    }
    public Object scrollToElement(WebDriver driver, String locator){
        WebElement element = findAnElement(driver,locator);
        return ((JavascriptExecutor)driver).executeScript("arguments[0].scrollToView(true);",element);
    }
    public void dragAndDropElement(WebDriver driver , String source,String destination){
        WebElement elementSource = findAnElement(driver,source);
        WebElement elementDestination = findAnElement(driver,destination);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(elementSource,elementDestination);
    }
    public void hoverElement(WebDriver driver , String locator){
    }
    public void doubleClickToElement(WebDriver driver,String locator){
        WebElement element = findAnElement(driver, locator);
        Actions actions = new Actions(driver);
        actions.doubleClick(element);
    }
    public void rightClickToElement(WebDriver driver,String locator){
        WebElement element = findAnElement(driver, locator);
        Actions actions = new Actions(driver);
        actions.contextClick(element);
    }
    public void checkToCheckbox(WebDriver driver,String locator){
        WebElement element = findAnElement(driver,locator);
        if (!element.isSelected()){
            element.click();
        }
    }
    public void unCheckToCheckbox(WebDriver driver,String locator){
        WebElement element = findAnElement(driver,locator);
        if (element.isSelected()){
            element.click();
        }
    }
    public String getAttributeValue(WebDriver driver,String locator,String attribute){
        WebElement element = findAnElement(driver, locator);
        return element.getAttribute(attribute);
    }
    public String getTextElement(WebDriver driver,String locator){
        WebElement element = findAnElement(driver, locator);
        return element.getText();
    }
    public void switchToWindowByTitle(WebDriver driver,String title){
        Set<String> allWindows = driver.getWindowHandles();
        for (String runWindows: allWindows){
            driver.switchTo().window(runWindows);
            String currentWindow = driver.getTitle();
            if (currentWindow.equals(title)){
                break;
            }
        }
    }
    public void clickToElement(WebDriver driver,String locator){
        WebElement element = findAnElement(driver,locator);
        waitForElementVisible(driver,locator);
        element.click();
    }

}
