package supports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CommonFunction {


    private static WebDriver driver;
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
                break;
            }
            case "firefox-headless" : {
                break;
            }

        }
    }

    public static void visit(String url)
    {
        driver.get(url);
    }

    /**
     *
     * @param how : name, id, css, xpath
     * @param locator
     * @return
     */
    public static WebElement find(How how, String locator){
        return driver.findElement(how.buildBy(locator));
    }

    public static List<WebElement> all(How how, String locator){
        return driver.findElements(how.buildBy(locator));
    }

    public static void click(How how, String locator){
        find(how, locator).click();
    }

    public static String text (How how, String locator) {
       return find(how, locator).getText();
    }

    public static void fill(How how, String locator, String text){
        find(how, locator).clear();
        find(how, locator).sendKeys(text);
    }

    public static void check(How how, String locator){
        if (!find(how, locator).isSelected()){
            click(how, locator);
        }
    }

    public static void uncheck(How how, String locator){
        if (find(how, locator).isSelected()){
            click(how, locator);
        }
    }

    public static void select (How how, String locator, String variableTest){
        Select select = new Select(find(how, locator));
        select.selectByVisibleText(variableTest);
    }

    public static void select (How how, String locator, int index){
        Select select = new Select(find(how, locator));
        select.selectByIndex(index);
    }

    public static void navigate(String url){
        driver.navigate().to(url);
    }

    public static void backPreviousPage()
    {
        driver.navigate().back();
    }

    public static void refreshPage()
    {
        driver.navigate().refresh();
    }

    public static void close()
    {
        if (driver != null){
            driver.quit();
        }
    }

}
