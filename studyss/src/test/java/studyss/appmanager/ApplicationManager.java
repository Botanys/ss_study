package studyss.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {


    public NewMailFillForm newMailFillForm;
    public NavigationHelper navigationHelper;
    public ChromeDriver driver;



    public void unit() {
        navigationHelper.driver = new ChromeDriver();
        navigationHelper.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navigationHelper.driver.manage().window().maximize();
        navigationHelper.driver.get("https://www.i.ua/");
        newMailFillForm = new NewMailFillForm(driver);
        navigationHelper = new NavigationHelper(driver);
        navigationHelper.login("Meeet@ua.fm", "123456qwerty", "ua.fm");
    }

    public void stop() {
        navigationHelper.driver.quit();
    }

    public void clickCreateLetterHeaderMainMailBox() {
        navigationHelper.driver.findElement(By.xpath("//li/a[contains(text(),'Создать')]")).click();
    }

    public NewMailFillForm getNewMailFillForm() {
        return newMailFillForm;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
