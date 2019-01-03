package studyss.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class IteractionMethods {
    public ChromeDriver driver;

    public IteractionMethods (ChromeDriver driver) {
        this.driver = driver;


    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }
}
