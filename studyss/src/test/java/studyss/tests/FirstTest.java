package studyss.tests;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import studyss.Model.MailFillForm;

public class FirstTest extends TestBase {

    @Test
    public void testSendEmail() {


        app.clickCreateLetterHeaderMainMailBox();
        app.getNewMailFillForm().fillNewMailForm(new MailFillForm("Meeet@ua.fm", "Test", "TypeSmthing"));
        app.getNewMailFillForm().click(By.xpath("//p[@class='send_container']/input[@type='submit'][@name='send']"));
        Assert.assertTrue(app.getNavigationHelper().driver.findElement(By.xpath("//div[contains(text(), 'Письмо успешно отправлено адресатам')]")).isDisplayed());

    }


}
