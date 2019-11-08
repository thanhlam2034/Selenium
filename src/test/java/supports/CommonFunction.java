package supports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CommonFunction {


    private static WebDriver driver;
    private static WebDriverWait wait;
    private final static int MAXIMUM_TIMEOUT = 60;
    public static void openBrowser(String browserName){

        switch (browserName) {
            case "chrome" : {
                driver = new ChromeDriver();
                break;
            }
            case "firefox" : {
                driver = new FirefoxDriver();
                break;
            }
            case "ie" : {
                driver = new InternetExplorerDriver();
                break;
            }
            case "edge" : {
                driver = new EdgeDriver();
                break;
            }
            case "safari" : {
                driver = new SafariDriver();
                break;
            }
            case "chrome-headless" : {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                driver = new ChromeDriver(chromeOptions);
                break;
            }
            case "firefox-headless" : {
                FirefoxOptions firefoxDriver = new FirefoxOptions();
                firefoxDriver.addArguments("--headless");
                driver = new FirefoxDriver(firefoxDriver);
                break;
            }
        }
        wait = new WebDriverWait(driver, MAXIMUM_TIMEOUT);
    }

    public static void visit(String url)
    {
        driver.get(url);
    }

//    /**
//     *
//     * @param how : name, id, css, xpath
//     * @param locator
//     * @return
//     */
//    public static WebElement find(How how, String locator){
//        return driver.findElement(how.buildBy(locator));
//    }
//
//    public static List<WebElement> all(How how, String locator){
//        return driver.findElements(how.buildBy(locator));
//    }
//
//    public static void click(How how, String locator){
////        wait.until(ExpectedConditions.elementToBeClickable(how.buildBy(locator)));
//        find(how, locator).click();
//    }
//
//    public static String text (How how, String locator) {
////        wait.until(ExpectedConditions.presenceOfElementLocated(how.buildBy(locator)));
//        return find(how, locator).getText();
//    }
//
//    public static void fill(How how, String locator, String text){
////        wait.until(ExpectedConditions.presenceOfElementLocated(how.buildBy(locator)));
//        find(how, locator).clear();
//        find(how, locator).sendKeys(text);
//    }
//
//    public static void check(How how, String locator){
//        if (!find(how, locator).isSelected()){
//            click(how, locator);
//        }
//    }
//
//    public static void uncheck(How how, String locator){
//        wait.until(ExpectedConditions.presenceOfElementLocated(how.buildBy(locator)));
//        if (find(how, locator).isSelected()){
//            click(how, locator);
//        }
//    }
//
//    public static void select (How how, String locator, String variableTest){
//        wait.until(ExpectedConditions.presenceOfElementLocated(how.buildBy(locator)));
//        Select select = new Select(find(how, locator));
//        select.selectByVisibleText(variableTest);
//    }
//
//    public static void select (How how, String locator, int index){
//        wait.until(ExpectedConditions.presenceOfElementLocated(how.buildBy(locator)));
//        Select select = new Select(find(how, locator));
//        select.selectByIndex(index);
//    }
//
//    public static void navigate(String url){
//        driver.navigate().to(url);
//    }
//
//    public static void backPreviousPage()
//    {
//        driver.navigate().back();
//    }
//
//    public static void refreshPage()
//    {
//        driver.navigate().refresh();
//    }
//
//    public static void close()
//    {
//        if (driver != null){
//            driver.quit();
//        }
//    }
//
//    public static void hover(How how, String locator){
//        Actions hover = new Actions(driver);
//        hover.moveToElement(find(how, locator)).perform();
//    }
//    public static void doubleClick(How how, String locator){
//        Actions hover = new Actions(driver);
//        hover.doubleClick(find(how, locator)).perform();
//    }

    public static WebElement find(By locator){
        return driver.findElement(locator);
    }

    public static void click(By locator){
        find(locator).click();
    }
        public static void check(By locator){
        if (!find(locator).isSelected()){
            click(locator);
        }
    }
        public static void fill(By locator, String text){
        find(locator).clear();
        find(locator).sendKeys(text);
    }

        public static String text (By locator) {
        return find(locator).getText();
    }
}
