import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment1 {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/radio.html");
		   driver.manage().window().maximize();
		 Object expectedTitle ="Radio Button & Check Box Demo" ;
		Object actualTitleOfPage =driver.getTitle() ;
		if (actualTitleOfPage.equals(expectedTitle)){
		   
		   System.out.println("Title verification successful");
		   }
		   else 
			   System.out.println("Title verification fail");
		
		driver.findElement(By.id("vfb-7-1")).click();
		driver.findElement(By.id("vfb-6-1")).click();
		driver.findElement(By.id("vfb-6-2")).click();
		
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		WebElement dropdown = driver.findElement(By.name("country"));
		Select select = new Select (dropdown);
		

	  select.selectByVisibleText("KUWAIT");
 	   
		 Thread.sleep(3000);
		      driver.close();
		      
		   
		
	}

}
