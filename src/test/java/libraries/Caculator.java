package libraries;

import object.CaculatorPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static supports.CommonFunction.*;

public class Caculator extends CaculatorPage {

    //Cach 1:
//    public final String METRIC_UNITS = "//a[text()='Metric Units']";
//    public final String AGE = "//input[@class='inhalf']";
//    public final String GENDER = "//input[@id='csex1']";
//    public final String HEIGHT = "//input[@id='cheightmeter']";
//    public final String WEIGHT = "//input[@id='ckg']";
//    public final String CACULATE = "//input[@value='Calculate']";
//    public final String RESULT = "//div[@class='bigtext']";
//
//    public final By METRIC_UNITS1 = By.xpath("//a[text()='Metric Units']");
//
//    public Caculator()
//    {
//    }
//    public void goToMetricUnit(){
//        check(How.XPATH, METRIC_UNITS);
//    }
//    public void inputAge(String age){
//        fill(How.XPATH,AGE,age);
//    }
//    public void selectGenderMale(){
//        check(How.XPATH, GENDER);
//    }
//    public void inputHeight(String height){
//        fill(How.XPATH, HEIGHT, height);
//    }
//    public void inputWeight(String weight){
//        fill(How.XPATH, WEIGHT, weight);
//    }
//    public void clickCaculate(){
//        click(How.XPATH, CACULATE);
//    }
//    public void getResult(){
//       String ketqua = text(How.XPATH,RESULT);
//        System.out.println(ketqua);
//    }

    //Cach 2: By

    public Caculator()
    {
    }
    public void goToMetricUnit(){
        check(METRIC_UNITS);
    }
    public void inputAge(String age){
        fill(AGE,age);
    }
    public void selectGenderMale(){
        check(GENDER);
    }
    public void inputHeight(String height){
        fill(HEIGHT, height);
    }
    public void inputWeight(String weight){
        fill(WEIGHT, weight);
    }
    public void clickCaculate(){
        click(CACULATE);
    }

    public void fillForm(String age, String height, String weight){
        fill(AGE,age);
        check(GENDER);
        fill(HEIGHT, height);
        fill(WEIGHT, weight);
    }
    public String getResult(){
        return (text(RESULT));
    }


//    //Cach 3
//    private WebDriver driver;
//    @FindBy(xpath = "//a[text()='Metric Units']")
//    WebElement METRIC_UNITS;
//
//    @FindBy(xpath = "//input[@class='inhalf']")
//    WebElement AGE;
//
//    @FindBy(xpath = "//input[@id='csex1']")
//    WebElement MAILGENDER;
//
//    @FindBy(xpath = "//input[@id='cheightmeter']")
//    WebElement HEIGHT;
//
//    @FindBy(xpath = "//input[@id='ckg']")
//    WebElement WEIGHT;
//
//    @FindBy(xpath = "//input[@value='Calculate']")
//    WebElement CACULATE;
//
//    @FindBy(xpath = "//div[@class='bigtext']")
//    WebElement RESULT;
//
//    public Caculator(WebDriver driver){
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
//    public Caculator()
//    {
//    }
//    public void goToMetricUnit(){
//        if (!METRIC_UNITS.isSelected()){
//            METRIC_UNITS.click();
//        }
//    }
//   public void inputAge(String age){
//        AGE.clear();
//        AGE.sendKeys(age);
//    }
//    public void selectGenderMale(){
//        if (!MAILGENDER.isSelected()){
//            MAILGENDER.click();
//        }
//    }
//    public void inputHeight(String height){
//        HEIGHT.clear();
//        HEIGHT.sendKeys(height);
//    }
//    public void inputWeight(String weight){
//        WEIGHT.clear();
//        WEIGHT.sendKeys(weight);
//    }
//    public void clickCaculate(){
//        CACULATE.click();
//    }
//    public void getResult(){
//        String ketqua = RESULT.getText();
//        System.out.println(ketqua);
//    }
}
