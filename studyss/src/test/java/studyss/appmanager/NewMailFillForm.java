package studyss.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import studyss.Model.MailFillForm;


public class NewMailFillForm extends IteractionMethods{



    public NewMailFillForm(ChromeDriver driver) {
        super(driver);


    }

    public void fillNewMailForm(MailFillForm mailFillForm) {
        type(By.xpath("//textarea[@name='to']"), mailFillForm.getSendTo());
        type(By.xpath("//span//input[@type='text']"), mailFillForm.getTopicOfTheLetter());
        type(By.xpath("//div/textarea[@name='body']"), mailFillForm.getBodyOfTheLetter());
    }

}
