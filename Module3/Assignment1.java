package Module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment1 {
	 WebDriver driver;

	    @BeforeTest
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.get("https://demo.guru99.com/test/login.html");
	    }

	    @Test(dataProvider = "loginData")
	    public void loginTest(String username, String password) {
	        driver.findElement(By.name("email")).sendKeys(username);
	        driver.findElement(By.name("passwd")).sendKeys(password);
	        driver.findElement(By.id("SubmitLogin")).click();
	    }

	    @DataProvider(name = "loginData")
	    public Object[][] getData() {
	        return new Object[][] {
	            {"testuser1@gmail.com", "password1"},
	            {"testuser2@gmail.com", "password2"}
	        };
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	    }
	

}
