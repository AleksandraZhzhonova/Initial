package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.stream.Collectors;

public class Header {
    public Header(WebDriver driver) {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

  /*  @FindBy(how = How.XPATH, using ="//li[@id='tuningMenu']/a[@role='button']")
    private WebElement buttonSettings;

    public void pushSettingsButton (WebDriver driver) {
        buttonSettings.click();
    }
*/

  /*  @FindAll({@FindBy(how = How.XPATH, using ="//ul[@class='nav navbar-nav']")})
     private List<WebElement> navigationElements;

    public List<String> getNavigationElementLabels() {
        return navigationElements.stream().map(WebElement::getText).collect(Collectors.toList());
    }
*/

    @FindBy(how = How.XPATH, using ="//self::node()[@title = 'Агентство по страхованию вкладов']")
    private WebElement logos;

    public void checkLogo(WebDriver driver) {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(logos));
        logos.isDisplayed();
    }

    @FindAll({@FindBy(how = How.XPATH, using ="//ul[@class='nav nav-tabs full']/li")})
    private List<WebElement> navigationElements;

    public List<String> getNavigationElementLabels() {
        return navigationElements
                .stream()
                .limit(13)
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }




}
