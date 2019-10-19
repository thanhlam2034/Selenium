package FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/tables");

        int totalColumn = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th")).size();
        int totalRow = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();

        String cellLocator = "//table[@id='table1']/tbody/tr[%d]/td[%d]";
//        for (int row = 1; row <= totalRow ; row ++) {
//            for (int column = 1; column <= totalColumn; column++) {
//                String cellValue = driver.findElement(By.xpath(String.format(cellLocator, row, column))).getText();
//                System.out.println("Gia tri cua cell " + cellValue);
//            }
//        }
        //Get Due value
        for (int row = 1; row <= totalRow; row++)
        {
            String cellValue = driver.findElement(By.xpath(String.format(cellLocator,row,4))).getText();
            System.out.println("Gia tri cua cell " + Float.parseFloat(cellValue.replace("$","")));
        }
    }

    public static void printCellValue  (WebDriver driver, String tableLocator){
        int totalColumn = driver.findElements(By.xpath(tableLocator + "/thead/tr/th")).size();
        int totalRow = driver.findElements(By.xpath(tableLocator + "/tbody/tr")).size();

        String cellLocator = tableLocator + "/tbody/tr[%d]/td[%d]";
        for (int row = 1; row <= totalRow ; row ++) {
            for (int column = 1; column <= totalColumn; column++) {
                String cellValue = driver.findElement(By.xpath(String.format(cellLocator, row, column))).getText();
                System.out.println("Gia tri cua cell " + cellValue);
            }
        }
    }
}
