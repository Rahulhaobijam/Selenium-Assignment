package Module2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Assignment3 {


	    public static void main(String[] args) throws Exception {
	    	 WebDriver driver = new ChromeDriver();
			 driver.get("https://jqueryui.com/");
			   driver.manage().window().maximize();
	        
	        
	        driver.findElement(By.linkText("Draggable")).click();
	        
	        
	        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	        
	        
	        WebElement draggable = driver.findElement(By.id("draggable"));
	        
	       
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].setAttribute('style', 'position: absolute; left: 100px; top: 100px;')", draggable);
	        
	        
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	       Files.copy(screenshot, new File("C:\\Users\\rahul\\Downloads\\Sample ss.jpg"));
	       
	       driver.close();
	        
	    }
	}

	    


