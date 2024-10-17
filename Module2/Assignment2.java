package Module2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/delete_customer.php");
		   driver.manage().window().maximize();
		   driver.findElement(By.name("cusid")).sendKeys("12345");
		   driver.findElement(By.name("submit")).click();
		   Alert alert1 = driver.switchTo().alert();
	        System.out.println(alert1.getText()); 
	        alert1.accept(); 
	        Alert alert2 = driver.switchTo().alert();
	        System.out.println(alert2.getText());  
	        alert2.accept();
		   
		   
		   
		   Thread.sleep(3000);
		      driver.close();
	

	 
	
}
}
