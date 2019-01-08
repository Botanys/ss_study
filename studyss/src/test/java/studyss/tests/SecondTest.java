package studyss.tests;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class SecondTest extends TestBase{




    @Test

    public void sendEmptyEmail() throws Exception {
        app.getSessionManager().clickCreateLetterHeaderMainMailBox();
        app.getNewMailFillForm().clickSendButtonTopCreateNewLetter();
        app.getSessionManager().alertCompareByText("При заполнении формы были допущены ошибки!");
        Assert.assertTrue(app.driver.findElement(By.xpath("//span[contains(text(), 'Поле \"Кому\" не указано')]")).isDisplayed());
    }



}


