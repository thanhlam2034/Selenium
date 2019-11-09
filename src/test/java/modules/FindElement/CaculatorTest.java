package modules.FindElement;
import libraries.Caculator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import supports.CommonFunction;

import static supports.CommonFunction.*;

public class CaculatorTest {
    Caculator caculator = new Caculator();
    @BeforeMethod
    public void goToMetricUnit(){
        String browserName = "chrome";
        if(System.getProperty("browser") !=null){
            browserName = System.getProperty("browser");
        }
        CommonFunction.openBrowser(browserName);
        visit("https://www.calculator.net/bmi-calculator.html?");
        caculator.goToMetricUnit();
    }

    @DataProvider(name="testdata1")
    Object[][] caculatorData(){
        return new Object[][]{
                {"31","158","58","BMI = 23.2 kg/m2   (Normal)"}
        };
    }
    @Test(dataProvider = "testdata1", description = "Validation")
    public void CalulatorTest(String age, String height, String weight, String expectResult) {
        caculator.fillForm(age, height, weight);
        caculator.clickCaculate();
        String result = caculator.getResult();
        Assert.assertEquals(result, expectResult);
    }
}