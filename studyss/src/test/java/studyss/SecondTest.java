package studyss;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class SecondTest extends TestBase{


    @Test

    public void sendEmptyEmail(){

        login("Meeet@ua.fm", "123456qwerty", "ua.fm");
        clickCreateLetterHeaderMainMailBox();
        clickSendButtonTopCreateNewLetter();
        WebDriverWait wait = new WebDriverWait(driver, 10 );
        Alert alert = wait.until(alertIsPresent());
    }

}
