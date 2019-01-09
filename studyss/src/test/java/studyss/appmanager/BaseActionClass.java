package studyss.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;



public class  BaseActionClass {
    public WebDriver driver;

    public BaseActionClass(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnLocator(By Locator) {
        driver.findElement(Locator).click();

    }

    public void clickAndType(By Locator, String text) {
        driver.findElement(Locator).click();
        if(text != null) {
            String existingText = driver.findElement(Locator).getAttribute("value");
            if (!text.equals(existingText)) {
            }
        }
        driver.findElement(Locator).clear();
        driver.findElement(Locator).sendKeys(text);
        }



        public boolean isElementPresent(By locator){
        try {driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }


        }

        }



