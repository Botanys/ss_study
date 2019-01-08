package studyss.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;


public class ApplicationManager {


    private SessionManager sessionManager;
    private NewMailFillForm newMailFillForm;
    public WebDriver driver;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void unit() {
      if (browser.equals(BrowserType.CHROME)){
        driver = new ChromeDriver();
      } else if (browser.equals(BrowserType.FIREFOX)){
          driver = new FirefoxDriver();
      } else if (browser.equals(BrowserType.IE)){
          driver = new InternetExplorerDriver();
      }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.i.ua/");
        newMailFillForm = new NewMailFillForm(driver);
        sessionManager = new SessionManager(driver);
        sessionManager.logInViaMailMainPage("Meeet@ua.fm", "123456qwerty", "ua.fm");
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
