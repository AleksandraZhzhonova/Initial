package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.*;
import static junit.framework.TestCase.assertEquals;

public class TableReferenceBook {
    public TableReferenceBook(WebDriver driver) {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

 /*   @FindBy(how = How.XPATH, using ="(//self::node()[text()='Справочники'])[2]")
    private WebElement labelDirectory;

    public void checkDirectory (String directory, WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
      // (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(labelDirectory));
        labelDirectory.isDisplayed();
        assertEquals(labelDirectory.getText(), directory);
    }
*/

    @FindBy(how = How.XPATH, using ="(//span[@class=\"ui-icon fa fa-search fa-fw\"])[1]")
    private WebElement buttonSearchLupa;

    public void pushSearchButton (WebDriver driver) throws InterruptedException {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(buttonSearchLupa));
        buttonSearchLupa.click();
    }
}

