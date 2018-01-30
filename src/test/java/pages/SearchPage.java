package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.stream.Collectors;

import static junit.framework.TestCase.assertEquals;
import static stepDefinition.InitialSteps.driver;

public class SearchPage {
    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    //      @FindBy(how = How.XPATH, using = "//self::node()[text()='\"+ value + \"']/parent::*/parent::*/td")
    //    private WebElement checkbox;
@FindBy(how = How.XPATH, using ="//self::node()[text()='45507810188880000177']/parent::*/td/input")
    private WebElement el;

    public  void checkElem (String element, WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        el.findElement(By.xpath("//self::node()[text()='" + element + "']/parent::*/td/input"));
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(el));
        el.click();
    }

    }
