package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class HelpSteps {

    public static void push(String button, WebDriver driver) throws Throwable {
        driver.findElement(By.xpath("//self::node()[text() = '" + button + "']")).click();
    }

    public static void enterData(String id, String placeholder, String data, WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//input[@id='" + id + "'][@placeholder='" + placeholder + "']"));
        element.clear();
        element.sendKeys(data);
    }

    public static void checkElement(String element, WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        WebElement el = driver.findElement(By.xpath("//self::node()[text() = '" + element + "']"));
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(el));
        el.isDisplayed();
        assertTrue(el.getText().equalsIgnoreCase(element));
    }

    public static void checkdElem(String element, WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//self::node()[text()='" + element + "']")).click();
        driver.findElement(By.xpath("//self::node()[text()='" + element + "']/parent::*/td/input")).click();
    }
    public static void chooseOptionInSearchModalWindow(String option, WebDriver driver) throws Throwable {
        driver.findElement(By.xpath("//option[text() = '" + option + "']")).click();
    }
    public static boolean checkPresenceOfElements(String element, WebDriver driver) throws InterruptedException {
        List<WebElement> list = driver.findElements(By.xpath("//self::node()[text() = '" + element + "']"));
        if (list.size() >= 1) {
            return true;
        }
        return false;
    }
    public static void chooseOptionFromNavigation(String option, WebDriver driver) throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//self::node()[@class = \"dropdown-menu\"]/li/a[contains (text(), \"" + option + "\")]")).click();
    }


    public static void pushNavigationButton (String option, WebDriver driver) throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//self::node()[@class = \"dropdown-toggle\"][contains (text(), \"" + option + "\")]")).click();
    }


    public static void checkDirectory (String directory, WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        WebElement el = driver.findElement(By.xpath("//self::node()[text() = '" + directory + "']"));
        el.isDisplayed();
        assertEquals(el.getText(), directory);
    }

    public static void enterValue (String input, String value, WebDriver driver) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//label[text()='"+ input + "']/../following-sibling::*//input"));
        element.clear();
        element.sendKeys(value);
    }


}
