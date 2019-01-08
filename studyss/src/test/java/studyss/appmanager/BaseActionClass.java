package studyss.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class  BaseActionClass {
    public WebDriver driver;

    public BaseActionClass(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnLocator(By Locator) {
        driver.findElement(Locator).click();

    }

    public void clickAndType(By Locator, String text) {
        driver.findElement(Locator).click();
        driver.findElement(Locator).clear();
        driver.findElement(Locator).sendKeys(text);
    }
}
