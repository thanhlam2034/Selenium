package modules.FindElement;
import libraries.Caculator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static supports.CommonFunction.*;

public class CaculatorTest {
    public static void main(String[] args) {
//        openBrowser("chrome");
//        visit("https://www.calculator.net/bmi-calculator.html?");
//        Caculator caculator = new Caculator();

        WebDriver driver = new ChromeDriver();
        // Open website
        driver.get("https://www.calculator.net/bmi-calculator.html?");
        Caculator caculator = new Caculator(driver);
        caculator.goToMetricUnit();
        caculator.inputAge("31");
        caculator.selectGenderMale();
        caculator.inputHeight("158");
        caculator.inputWeight("59");
        caculator.clickCaculate();
        caculator.getResult();

    }
}
