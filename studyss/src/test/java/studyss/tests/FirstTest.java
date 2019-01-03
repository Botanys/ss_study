package studyss.tests;


import org.testng.annotations.Test;
import studyss.Model.MailFillForm;

public class FirstTest  extends TestBase {

    @Test
    public void testSendEmail() {


        app.clickCreateLetterHeaderMainMailBox();
        app.fillNewMailForm(new MailFillForm("Meeet@ua.fm", "Test", "TypeSmthing"));
        app.clickSendButtonTopCreateNewLetter();


    }


}
