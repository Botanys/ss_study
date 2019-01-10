package studyss.tests;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import studyss.Model.MailFillForm;

import java.util.List;


public class SendEmailTests extends TestBase {


    @Test
    public void sendMailWithEmptyFiledTo() throws Exception {
        int before = app.getMailBoxMainPage().quantityOfLetters();
        app.getSessionManager().clickCreateLetterHeaderMainMailBox();
        app.getNewMailFillForm().clickSendButtonTopCreateNewLetter();
        app.getSessionManager().alertCompareByText("При заполнении формы были допущены ошибки!", true);
        Assert.assertTrue(app.driver.findElement(By.xpath("//span[contains(text(), 'Поле \"Кому\" не указано')]")).isDisplayed());
        app.getNewMailFillForm().clickOnMailsButtom();
        int after = app.getMailBoxMainPage().quantityOfLetters();
        Assert.assertEquals(before, after);
    }

    @Test
    public void sendMailWithEmptyTopicAndEmptyBody() throws Exception {
       // int before = app.getMailBoxMainPage().quantityOfLetters();
        List<MailFillForm> before = app.getMailBoxMainPage().getMailName();

        app.getSessionManager().clickCreateLetterHeaderMainMailBox();
        app.getNewMailFillForm().fillNewMailForm(new MailFillForm("meeet@ua.fm", "",
                ""));
        app.getNewMailFillForm().clickSendButtonTopCreateNewLetter();
        app.getSessionManager().alertCompareByText("Вы хотите отправить сообщение без темы?", true);
        app.getSessionManager().alertCompareByText("Вы хотите отправить пустое сообщение?", true);
        Assert.assertTrue(app.driver.findElement(By.xpath("//div[contains(text(), 'Письмо успешно отправлено адресатам')]")).isDisplayed());

        app.getNewMailFillForm().clickOnMailsButtom();

        // int after = app.getMailBoxMainPage().quantityOfLetters();
        List<MailFillForm> after = app.getMailBoxMainPage().getMailName();
        Assert.assertEquals(before.size(), after.size() - 1);
    }

    @Test
    public void cancelSendingMailWithEmptyTopic() throws Exception {
        int before = app.getMailBoxMainPage().quantityOfLetters();

        app.getSessionManager().clickCreateLetterHeaderMainMailBox();
        app.getNewMailFillForm().fillNewMailForm(new MailFillForm("meeet@ua.fm", "",
                "1"));

        app.getNewMailFillForm().clickSendButtonTopCreateNewLetter();
        app.getSessionManager().alertCompareByText("Вы хотите отправить сообщение без темы?", false);

        app.getNewMailFillForm().clickOnMailsButtom();

        int after = app.getMailBoxMainPage().quantityOfLetters();
        Assert.assertEquals(before, after);
    }

}
/*    @Test

    List<MailFillForm> before = app.getMailBoxMainPage().getMailName();
}*/


