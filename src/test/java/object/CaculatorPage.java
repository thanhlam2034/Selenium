package object;

import org.openqa.selenium.By;

public class CaculatorPage {
    public final By METRIC_UNITS = By.xpath("//a[text()='Metric Units']");
    public final By AGE = By.xpath("//input[@class='inhalf']");
    public final By GENDER = By.xpath("//input[@id='csex1']");
    public final By HEIGHT = By.xpath("//input[@id='cheightmeter']");
    public final By WEIGHT = By.xpath("//input[@id='ckg']");
    public final By CACULATE = By.xpath("//input[@value='Calculate']");
    public final By RESULT = By.xpath("//div[@class='bigtext']");
}
