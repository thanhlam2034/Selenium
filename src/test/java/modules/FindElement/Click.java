package modules.FindElement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/status_codes");

        driver.findElement(By.xpath("//a[text()='here']")).click();
        driver.findElement(By.xpath("//a[text()='200']")).click();
        driver.findElement(By.xpath("//a[text()='here']")).click();

        driver.findElement(By.linkText("301")).click();
        driver.findElement(By.linkText("here")).click();

        driver.findElement(By.linkText("404")).click();
        driver.findElement(By.linkText("here")).click();

        driver.findElement(By.linkText("500")).click();
        driver.findElement(By.linkText("here")).click();
    }
}
