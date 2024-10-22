package Module4;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Assignment1 {
	   public static void main(String[] args) {

	     
	        WebDriverManager.chromedriver().setup();
	         WebDriver driver = new ChromeDriver();

	         driver.get("http://demo.guru99.com/V4/");

	         try {
	            
	             FileInputStream fis = new FileInputStream(new File("C:\\Users\\rahul\\Desktop\\Pro"));
	             Workbook workbook = WorkbookFactory.create(fis);
	             Sheet sheet = workbook.getSheetAt(0);

	          
	             Row row = sheet.getRow(0);
	             String username = row.getCell(A1).getStringCellValue();
	             String password = row.getCell(B2).getStringCellValue();

	           
	             WebElement usernameField = driver.findElement(By.name("uid"));
	             usernameField.sendKeys(username);

	          
	             WebElement passwordField = driver.findElement(By.name("password"));
	             passwordField.sendKeys(password);

	             
	             WebElement loginButton = driver.findElement(By.name("btnLogin"));
	             loginButton.click();

	            
	             Alert alert = driver.switchTo().alert();
	             alert.accept(); 
	          
	             workbook.close();
	             fis.close();

	         } catch (Exception e) {
	             e.printStackTrace();
	         } finally {
	             // Close the browser
	             driver.quit();
	

	         }
	   }
	   }
	
  

  
       
