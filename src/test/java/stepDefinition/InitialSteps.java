package stepDefinition;


import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Тогда;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.Header;
import pages.ModalWindowSearchTable;
import pages.SearchPage;
import pages.TableReferenceBook;

import static stepDefinition.HelpSteps.checkElement;

public class InitialSteps {
    public static WebDriver driver;
    public static SearchPage searchPage;
    public static Header header;
    public static TableReferenceBook tableReferenceBook;
    public static ModalWindowSearchTable modalWindowSearchTable;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\z.zolotaya\\Desktop\\driver\\chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("-incognito");
            options.addArguments("-start-maximized");
            options.addArguments("dom.webnotifications.enabled");
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            driver = new ChromeDriver(capabilities);
            searchPage = new SearchPage(driver);
            header = new Header(driver);
            tableReferenceBook = new TableReferenceBook(driver);
            modalWindowSearchTable = new ModalWindowSearchTable(driver);

        }
        return driver;
    }


    @Дано("^открыт браузер и осуществлен переход по ссылке$")
    public void openBrowser() throws Throwable {
        driver = getDriver();
        driver.get("http://172.26.25.86:8081/sua/login");
    }

    @Дано("^открывается страница с формой \"([^\"]*)\"$")
    public void openStartPage(String window) throws Throwable {
        checkElement(window, driver);
    }
    @After
    @Тогда("^браузер закрыт$")
    public void браузер_закрыт() throws Throwable {
        driver.quit();
        driver = null;
    }
}

