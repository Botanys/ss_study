package studyss;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {

    ChromeDriver driver;


    @BeforeTest

    public void launchBrowser() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get("https://www.i.ua/");

    }

    @AfterTest

    public void driverQuit() {
        driver.quit();
    }

    public void clickSendButtonTopCreateNewLetter() {
        driver.findElement(By.xpath("//p[@class='send_container']/input[@type='submit'][@name='send']")).click();
    }

    public void clickCreateLetterHeaderMainMailBox() {
        driver.findElement(By.xpath("//li/a[contains(text(),'Создать')]")).click();
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

    public void login(String loginName, String password, String enterDomain) {
        driver.findElement(By.xpath("//input[@name='login']"));
        driver.findElement(By.xpath("//input[@name='login']")).clear();
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys(loginName);

        driver.findElement(By.xpath("//input[@type='password']"));
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);

        Select chouseDomain = new Select(driver.findElement(By.xpath("//select[@name='domn']")));
        chouseDomain.selectByValue(enterDomain);

        driver.findElement(By.xpath("//input[@value='Войти']")).click();
    }
}
