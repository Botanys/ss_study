package studyss.tests;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import studyss.Model.MailFillForm;


public class SendEmailWithEmtyAddress extends TestBase{




    @Test

    public void sendMailWithEmptyFiledTo() throws Exception {
        app.getSessionManager().clickCreateLetterHeaderMainMailBox();
        app.getNewMailFillForm().clickSendButtonTopCreateNewLetter();
        app.getSessionManager().alertCompareByText("При заполнении формы были допущены ошибки!");
        Assert.assertTrue(app.driver.findElement(By.xpath("//span[contains(text(), 'Поле \"Кому\" не указано')]")).isDisplayed());
    }

    @Test
    public void sendMailWithEmptyTopicAndEmptyBody() throws Exception {
        app.getSessionManager().clickCreateLetterHeaderMainMailBox();
        app.getNewMailFillForm().fillNewMailForm(new MailFillForm("meeet@ua.fm", "",
                ""));
        app.getNewMailFillForm().clickSendButtonTopCreateNewLetter();
        app.getSessionManager().alertCompareByText("Вы хотите отправить сообщение без темы?");
        app.getSessionManager().alertCompareByText("Вы хотите отправить пустое сообщение?");
        Assert.assertTrue(app.driver.findElement(By.xpath("//div[contains(text(), 'Письмо успешно отправлено адресатам')]")).isDisplayed());

    }
    @Test
    public void cancelSendingMailWithEmptyTopic() throws Exception {
        app.getSessionManager().clickCreateLetterHeaderMainMailBox();
        app.getNewMailFillForm().fillNewMailForm(new MailFillForm("meeet@ua.fm", "",
                ""));
        app.getNewMailFillForm().clickSendButtonTopCreateNewLetter();
        app.getSessionManager().alertCompareByText("Вы хотите отправить сообщение без темы?");

    }
}


