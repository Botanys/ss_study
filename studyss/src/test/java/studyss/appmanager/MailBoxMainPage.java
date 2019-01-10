package studyss.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailBoxMainPage extends BaseActionClass{
   
    public MailBoxMainPage(WebDriver driver) {
        super(driver);
    }


    public int quantityOfLetters() {
    return driver.findElements(By.xpath("//input[@type='checkbox']")).size();
    }
}
