package studyss.appmanager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class SessionManager extends BaseActionClass{

    public SessionManager(WebDriver driver){
        super(driver);

    }

    public void clickCreateLetterHeaderMainMailBox() {
        driver.findElement(By.xpath("//li/a[contains(text(),'Создать')]")).click();
    }

    public void logInViaMailMainPage(String loginName, String password, String enterDomain) {

        clickAndType(By.xpath("//input[@name='login']"), loginName);
        clickAndType((By.xpath("//input[@type='password']")), password);
        Select chooseDomain = new Select(driver.findElement(By.xpath("//select[@name='domn']")));
        chooseDomain.selectByValue(enterDomain);

        clickOnLocator(By.xpath("//input[@value='Войти']"));
    }

    public void alertCompareByText(String TextShouldBe) throws Exception {
        driver.switchTo().alert();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        Alert alert = wait.until(alertIsPresent());
        String alertText = alert.getText();
        if (alertText.equals(TextShouldBe))
        {
            alert.accept();
        }
        else throw new Exception("Teкст алерта не верный");
    }


    public void clickHelpHeaderMainMailBox(){
        clickOnLocator(By.xpath("//a[contains(text(), 'Помощь')]"));
    }



}
