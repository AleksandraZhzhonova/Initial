package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.ru.*;

import java.util.List;
import static junit.framework.TestCase.assertEquals;
import static stepDefinition.HelpSteps.*;
import static stepDefinition.InitialSteps.*;

public class StepImplementation {

    /*
  WebDriver driver;

    @Дано("^открыт браузер и осуществлен переход по ссылке$")
    public void openBrowser() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\z.zolotaya\\Desktop\\driver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("-incognito");
        options.addArguments("-start-maximized");
        options.addArguments("dom.webnotifications.enabled");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(capabilities);
        driver.get("http://172.26.25.86:8081/sua/login");

    }

    @Дано("^открывается страница с формой \"([^\"]*)\"$")
    public void openStartPage(String window) throws Throwable {
        checkElement(window, driver);
    }
*/
    @Когда("^пользователь заполняет поле \"Имя пользователя\" значением \"([^\"]*)\"$")
    public void userFillsLoginField(String username) throws Throwable {
        enterData("username", "Имя пользователя", username, driver);
    }

    /*       public void enterData(String id, String placeholder, String data, WebDriver driver) {
               WebElement element = driver.findElement(By.xpath("//input[@id='"+id+"'][@placeholder='"+placeholder+"']"));
               element.clear();
               element.sendKeys(data);
           }
   */
    @Когда("^пользователь вводит в поле \"Пароль\" значение \"([^\"]*)\"$")
    public void userFillsPasswordField(String password) throws Throwable {
        enterData("password", "Пароль", password, driver);
    }

    @Также("^пользователь нажимает ссылку \"([^\"]*)\" в столбце \"Краткое наименование\"$")
    @И("^пользователь выбирает пункт \"([^\"]*)\"$")
    @А("^пользователь нажимает кнопку \"([^\"]*)\" в контекстном меню$")
    @Тогда("^пользователь выбирает финансовую организацию \"([^\"]*)\" типа КО$")
    @Когда("^пользователь нажимает кнопку \"([^\"]*)\"$")
    public void пользователь_нажимает_кнопку(String button) throws Throwable {
        // driver.findElement(By.xpath("//button[text() = 'Войти']")).click();
        //   driver.findElement(By.xpath("//self::node()[text() = '"+button+"']")).click();
        push(button, driver);
    }

    /*   public void push(String button, WebDriver driver) throws Throwable {
           driver.findElement(By.xpath("//self::node()[text() = '"+button+"']")).click();
       }
   */
 /*
 @Тогда("^пользователь нажимает кнопку \"([^\"]*)\" в контекстном меню$")
 public void userClicksExitButton(String buttonExit) throws Throwable {
     WebElement el = driver.findElement(By.xpath("//a[text() = '"+buttonExit+"']"));
     (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(el));
     el.click();

 }
 */
    @Тогда("^открывается модальное окно \"([^\"]*)\"$")
    public void openPageChooseFinOrg(String modal) throws Throwable {
        checkElement(modal, driver);
    }

    /*
        @Тогда("^пользователь выбирает финансовую организацию$")
        public void пользователь_выбирает_финансовую_организацию() throws Throwable {
            driver.findElement(By.xpath("//td[text() = '10']")).click();
        }
        */
/*
    @Тогда("^пользователь нажимает кнопку Выбрать$")
    public void пользователь_нажимает_кнопку_Выбрать() throws Throwable {
        driver.findElement(By.xpath("//button[text() = 'Выбрать']")).click();
    }
*/
    @Тогда("^открывается окно с логотипом \"Агентство по страхованию вкладов\"$")
    public void openPage() throws Throwable {
        Thread.sleep(1000);
        header.checkLogo(driver);
    }

    @И("^открывается страница \"([^\"]*)\"$")
    @Когда("^открывается страница с сообщением \"([^\"]*)\"$")
    @Тогда("^открывается страница с финансовой организацией \"([^\"]*)\"$")
    public void checkFinOrg(String finOrg) throws Throwable {
        checkElement(finOrg, driver);
    }

    /*
        @Тогда("^пользователь нажимает кнопку Права Все$")
        public void пользователь_нажимает_кнопку_Права_Все() throws Throwable {
            driver.findElement(By.xpath("//span[text() = 'Права  Все']")).click();
        }
        */
    @Когда("^пользователь заполняет поля \"Имя пользователя\" и \"Пароль\" значениями$")
    public void пользователь_заполняет_поля_и_значениями(DataTable data) throws Throwable {
        List<String> list = data.asList(String.class);
        enterData("username", "Имя пользователя", list.get(0), driver);
        enterData("password", "Пароль", list.get(1), driver);
    }

    @Тогда("^пользователь ставит чекбокс в столбце \"ID\" в строке со значением \"([^\"]*)\"$")
    public void пользователь_ставит_чекбокс(String value) throws Throwable {
       // searchPage.c
       // putCheckbox(value, driver);
    }

    @Тогда("^пользователь ставит чекбокс в столбце в строке со значением столбца \"Номер лицевого счета\" \"([^\"]*)\"$")
    public void екбокс(String value) throws Throwable {
searchPage.checkElem(value, driver);
     //   checkdElem(value, driver);
    }
/*
    @Тогда("^браузер закрыт$")
    public void браузер_закрыт() throws Throwable {
        driver.quit();
    }
*/
  /*  @Тогда("^пользователь нажимает кнопку с выпадающим списком \"Настройка\"$")
    public void пользователь_нажимает_кнопку_с_выпадающим_списком() throws Throwable {
        Thread.sleep(1000);
        header.pushSettingsButton(driver);
    }
*/
  /*
    @Тогда("^открывается страница с таблицей \"([^\"]*)\"$")
    public void открывается_страница_с_таблицей(String arg1) throws Throwable {
        tableReferenceBook.checkDirectory(arg1, driver);
    }

   */

    @Тогда("^позователь нажимает кнопку \"Поиск\" в верхней панели таблицы$")
    public void позователь_нажимает_кнопку_в_верхней_панели_таблицы() throws Throwable {
        Thread.sleep(1000);
        tableReferenceBook.pushSearchButton(driver);
    }

    @И("^пользователь выбирает пункт \"([^\"]*)\" в выпадающем списке \"Тип актива функциональный\"$")
    @Когда("^пользователь выбирает пункт \"([^\"]*)\" в выпадающем списке \"содержит\"$")
    @Тогда("^пользователь выбирает пункт \"([^\"]*)\" в выпадающем списке \"ID Плана Счетов\"$")
    public void пользователь_выбирает_пункт_в_выпадающем_списке(String option) throws Throwable {
        chooseOptionInSearchModalWindow(option,driver);
    }

    @Когда("^пользователь заполняет поле значением \"([^\"]*)\"$")
    public void пользователь_заполняет_поле_значением(String value) throws Throwable {
        modalWindowSearchTable.inputDate(value,driver);
    }
    @Тогда("^отображается \"Номер счёта 2-го порядка\" содержащий \"([^\"]*)\"$")
    public void отображается_содержащий(String value) throws Throwable {
        checkPresenceOfElements(value, driver);
    }

    @Тогда("^пользователь выбирает пункт \"([^\"]*)\" в выпадающем списке панели навигации$")
    public void chooseNavigationOption(String option) throws Throwable {
        Thread.sleep(1000);
        chooseOptionFromNavigation(option, driver);
    }

    @Тогда("^пользователь нажимает кнопку с выпадающим списком \"([^\"]*)\"$")
    public void пользователь_нажимает_кнопку_с_выпадающим_списком(String option) throws Throwable {
        Thread.sleep(1000);
        pushNavigationButton(option, driver);
    }
    @Тогда("^открывается страница с таблицей \"([^\"]*)\"$")
    public void открывается_страница_с_таблицей(String arg1) throws Throwable {
        checkDirectory(arg1, driver);
    }
    @Тогда("^пользователь вводит в поле \"([^\"]*)\" значение \"([^\"]*)\" таблицы \"Создание актива второй этап\"$")
    public void enterValueToForm(String arg1, String arg2) throws Throwable {
        enterValue(arg1, arg2, driver);

    }
    @Тогда("^На странице присутствуют вкладки$")
    public void на_странице_присутствуют_вкладки(DataTable data) throws Throwable {
        List<String> list = data.asList(String.class);
        assertEquals(list, header.getNavigationElementLabels());
    }
/*
    @Когда("^пользователь заполняет поля \"Имя пользователя\" и \"Пароль\" значениями$")
    public void пользователь_заполняет_поля_и_значениями(DataTable data) throws Throwable {
        List<String> list = data.asList(String.class);
        enterData("username", "Имя пользователя", list.get(0), driver);
        enterData("password", "Пароль", list.get(1), driver);
    }
*/
}