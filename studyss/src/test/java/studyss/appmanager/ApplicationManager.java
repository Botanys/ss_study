package studyss.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class ApplicationManager {

    private SessionManager sessionManager;
    private NewMailFillForm newMailFillForm;
    public ChromeDriver driver;

    public void unit() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.i.ua/");
        newMailFillForm = new NewMailFillForm(driver);
        sessionManager = new SessionManager(driver);
        sessionManager.login("Meeet@ua.fm", "123456qwerty", "ua.fm");
    }

    public void stop() {
        driver.quit();
    }

    public NewMailFillForm getNewMailFillForm() {

        return newMailFillForm;
    }

    public SessionManager getSessionManager() {
        return sessionManager;
    }
}
