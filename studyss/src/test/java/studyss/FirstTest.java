package studyss;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class FirstTest {

   ChromeDriver driver;

@BeforeTest

public void launchBrowser(){

    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().fullscreen();
    driver.get("https://www.i.ua/");

}

    @AfterTest
   public void driverQuit(){
    driver.quit();
   }

    @Test
    public void testFirst(){

    driver.findElement(By.xpath("//input[@name='login']"));
    driver.findElement(By.xpath("//input[@name='login']")).clear();driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Meeet@ua.fm");

    driver.findElement(By.xpath("//input[@type='password']"));
    driver.findElement(By.xpath("//input[@type='password']")).clear();
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456qwerty");


    Select chouseDomain = new Select(driver.findElement(By.xpath("//select[@name='domn']")));
    chouseDomain.selectByValue("ua.fm");

    driver.findElement(By.xpath("//input[@value='Войти']")).click();

    driver.findElement(By.xpath("//div[@class][1]/span[@class]/input[@type='checkbox']")).click();
    driver.findElement(By.xpath("//div[@class][2]/span[@class]/input[@type='checkbox']")).click();

    }


}
