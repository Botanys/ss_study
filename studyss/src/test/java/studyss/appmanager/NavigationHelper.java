package studyss.appmanager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class NavigationHelper extends IteractionMethods {



    public NavigationHelper(ChromeDriver  driver) {
        super(driver);



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

    public void alertCompareByText(String TextShouldBe) throws Exception {
        driver.switchTo().alert();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        Alert alert = wait.until(alertIsPresent());
        String alertText = alert.getText();
        if (alertText.equals(TextShouldBe)) {
            alert.accept();
        } else throw new Exception("Teкст алерта не верный");
    }
}
