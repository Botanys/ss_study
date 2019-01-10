package studyss.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MailHelpRubric extends TestBase {


      @Test
    public void mailHelp() {
          app.getSessionManager().clickHelpHeaderMainMailBox();

          Assert.assertTrue(app.driver.findElement(By.xpath("//span[contains(text(), 'Помощь')]")).isDisplayed());


    }
}
