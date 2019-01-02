package studyss;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class SecondTest extends TestBase{




    @Test

    public void sendEmptyEmail() throws Exception {

        login("Meeet@ua.fm", "123456qwerty", "ua.fm");
        clickCreateLetterHeaderMainMailBox();
        clickSendButtonTopCreateNewLetter();
        alertCompareByText("При заполнении формы были допущены ошибки!");
        driver.findElement(By.xpath("//span[contains(text(), 'Поле \"Кому\" не указано')]")).isDisplayed();
    }
}









