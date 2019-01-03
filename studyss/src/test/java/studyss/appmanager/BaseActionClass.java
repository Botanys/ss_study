package studyss.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class  BaseActionClass {
    public ChromeDriver driver;

    public BaseActionClass(ChromeDriver driver) {
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
