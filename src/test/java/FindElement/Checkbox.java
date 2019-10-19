package FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        if (        driver.findElement(By.xpath("//input[@type='checkbox'][1]")).getAttribute("checked").equals(null))
        driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();

        if (driver.findElement(By.xpath("//input[@type='checkbox'][2]")).getAttribute("checked").equals(null))
        driver.findElement(By.xpath("//input[@type='checkbox'][2]")).getAttribute("checked");

    }
}
