package studyss.tests;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import studyss.Model.MailFillForm;

public class CreateNewMail extends TestBase {

    @Test
    public void testSendEmail() {


        app.getSessionManager().clickCreateLetterHeaderMainMailBox();
        app.getNewMailFillForm().fillNewMailForm(new MailFillForm("Meeet@ua.fm", "Test", "TypeSmthing"));
        app.getNewMailFillForm().clickSendButtonTopCreateNewLetter();
        Assert.assertTrue(app.driver.findElement(By.xpath("//div[contains(text(), 'Письмо успешно отправлено адресатам')]")).isDisplayed());


    }


}
