package studyss;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class FirstTest {

   ChromeDriver driver;

@BeforeTest

public void launchBrowser(){

    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().fullscreen();


}

    @AfterTest
   public void driverQuit(){
    driver.quit();
   }

    @Test
    public void testFirst() throws InterruptedException {

    driver.get("https://www.i.ua/");





    driver.findElement(By.xpath("//input[@name='login']"));
    driver.findElement(By.xpath("//input[@name='login']")).clear();driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Meeet@ua.fm");

    driver.findElement(By.xpath("//input[@type='password']"));
    driver.findElement(By.xpath("//input[@type='password']")).clear();
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456qwerty");


    Select chouseDomain = new Select(driver.findElement(By.xpath("//select[@name='domn']")));
    chouseDomain.selectByValue("ua.fm");
    driver.findElement(By.xpath("//input[@value='Войти']")).click();

    



    Thread.sleep(10000);



    }


}
