package Module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get(" https://demo.guru99.com/test/web-table-element.php");
		   driver.manage().window().maximize();
			        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		   for (WebElement row : rows) {
					   WebElement companyName = row.findElement(By.xpath("td[1]"));
			   System.out.println(companyName.getText());
	        }
		   
		  
		   
		
}
}
