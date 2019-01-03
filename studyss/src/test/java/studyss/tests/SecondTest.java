package studyss.tests;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class SecondTest extends TestBase{




    @Test

    public void sendEmptyEmail() throws Exception {
        app.clickCreateLetterHeaderMainMailBox();
        app.getNewMailFillForm().click(By.xpath("//p[@class='send_container']/input[@type='submit'][@name='send']"));
        app.getNavigationHelper().alertCompareByText("При заполнении формы были допущены ошибки!");
        Assert.assertTrue(app.getNavigationHelper().driver.findElement(By.xpath("//span[contains(text(), 'Поле \"Кому\" не указано')]")).isDisplayed());
    }
}









