package studyss.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import studyss.Model.MailFillForm;

public class NewMailFillForm extends BaseActionClass{


    public NewMailFillForm(WebDriver driver) {
        super(driver);
    }


    public void clickSendButtonTopCreateNewLetter() {
        clickOnLocator(By.xpath("//p[@class='send_container']/input[@type='submit'][@name='send']"));
    }

    public void fillNewMailForm(MailFillForm mailFillForm) {
        clickAndType(By.xpath("//textarea[@name='to']"), mailFillForm.getSendTo());
        clickAndType(By.xpath("//span//input[@type='text']"), mailFillForm.getTopicOfTheLetter());
        clickAndType(By.xpath("//div/textarea[@name='body']"), mailFillForm.getBodyOfTheLetter());
    }

}
