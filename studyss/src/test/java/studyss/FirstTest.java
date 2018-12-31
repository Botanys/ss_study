package studyss;


import org.testng.annotations.Test;

public class FirstTest  extends TestBase {

    @Test
    public void testSendEmail() {

        login("Meeet@ua.fm", "123456qwerty", "ua.fm");
        clickCreateLetterHeaderMainMailBox();
        fillNewMailForm(new MailFillForm(" @ua.fm", "Test", "TypeSmthing"));
        clickSendButtonTopCreateNewLetter();


    }


}
