package studyss.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import studyss.Model.MailFillForm;

public class NewMailFillForm {
    public ChromeDriver driver;
    public WebDriverWait wait ;

    public void clickSendButtonTopCreateNewLetter() {
        driver.findElement(By.xpath("//p[@class='send_container']/input[@type='submit'][@name='send']")).click();
    }

    public void fillNewMailForm(MailFillForm mailFillForm) {
        driver.findElement(By.xpath("//textarea[@name='to']")).click();
        driver.findElement(By.xpath("//textarea[@name='to']")).clear();
        driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys(mailFillForm.getSendTo());

        driver.findElement(By.xpath("//span//input[@type='text']")).click();
        driver.findElement(By.xpath("//span//input[@type='text']")).clear();
        driver.findElement(By.xpath("//span//input[@type='text']")).sendKeys(mailFillForm.getTopicOfTheLetter());

        driver.findElement(By.xpath("//div/textarea[@name='body']")).click();
        driver.findElement(By.xpath("//div/textarea[@name='body']")).clear();
        driver.findElement(By.xpath("//div/textarea[@name='body']")).sendKeys(mailFillForm.getBodyOfTheLetter());
    }
}
