package studyss.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import studyss.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeTest

    public void launchBrowser() {
        app.unit();

    }

    @AfterTest

    public void driverQuit() {
        app.stop();
    }


}
