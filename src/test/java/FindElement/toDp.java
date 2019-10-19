package FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toDp {
    public static void main(String[] args) {


    WebDriver driver = new ChromeDriver();
    driver.get("http://todomvc.com/examples/vanillajs/");
    for(int i = 0; i < 100; i ++)
    driver.findElement(By.className("new-todo")).sendKeys(String.format("to do %d" , i));
    }}