package studyss.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import studyss.Model.MailFillForm;

import java.util.ArrayList;
import java.util.List;

public class MailBoxMainPage extends BaseActionClass{
   
    public MailBoxMainPage(WebDriver driver) {
        super(driver);
    }


    public int quantityOfLetters() {
    return driver.findElements(By.xpath("//input[@type='checkbox']")).size();
    }

    public List<MailFillForm> getMailName() {
        List<MailFillForm> listOfEmailsTopics = new ArrayList<MailFillForm>();
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"mesgList\"]/form/div/a/span[3]/span"));
        for (WebElement element : elements) {
            String topicOfTheLetterText = element.getAttribute("innerText");
            MailFillForm topicOfTheLetters = new MailFillForm(null, topicOfTheLetterText,null);
            listOfEmailsTopics.add(topicOfTheLetters);
        }
        return listOfEmailsTopics;
    }
    }

