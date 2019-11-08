package modules.FindElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.How;
import supports.CommonFunction;

import static supports.CommonFunction.*;

public class Table
{
    public static void main(String[] args) {
//        openBrowser("chrome");
//        visit("https://the-internet.herokuapp.com/tables");
//
//        int totalColumn = all(How.XPATH,"//table[@id='table1']/thead/tr/th").size();
//        int totalRow = all(How.XPATH,"//table[@id='table1']/tbody/tr").size();
//
//        String cellLocator = "//table[@id='table1']/tbody/tr[%d]/td[%d]";
////        for (int row = 1; row <= totalRow ; row ++) {
////            for (int column = 1; column <= totalColumn; column++) {
////                String cellValue = driver.findElement(By.xpath(String.format(cellLocator, row, column))).getText();
////                System.out.println("Gia tri cua cell " + cellValue);
////            }
////        }
//        //Get Due value
//        for (int row = 1; row <= totalRow; row++)
//        {
//            String cellValue = text(How.XPATH,String.format(cellLocator, row));
//            System.out.println("Gia tri cua cell " + Float.parseFloat(cellValue.replace("$","")));
//        }
//    }
//
//    public static void printCellValue  (WebDriver driver, String tableLocator){
//        int totalColumn = CommonFunction.all(How.XPATH, tableLocator + "/thead/tr/th").size();
//        int totalRow = CommonFunction.all(How.XPATH, tableLocator + "/tbody/tr").size();
//
//        String cellLocator = tableLocator + "/tbody/tr[%d]/td[%d]";
//        for (int row = 1; row <= totalRow ; row ++) {
//            for (int column = 1; column <= totalColumn; column++) {
//                String cellValue = text(How.XPATH,String.format(cellLocator, row, column));
//                System.out.println("Gia tri cua cell " + cellValue);
//            }
//        }
    }

}
