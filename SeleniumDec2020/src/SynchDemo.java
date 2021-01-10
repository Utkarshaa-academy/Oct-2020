import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium Latest Jars\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.yahoo.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.findElement(By.xpath("//*[@id=\"header-signin-link\"]/span")).click();
		
		Actions action = new Actions(driver);
		
	//	WebElement username = driver.findElement(By.cssSelector("input#login-username"));
		
	//	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#login-username"))).sendKeys("ravinangre");
		
	//	 driver.findElement(By.cssSelector("input#login-username")).sendKeys("ravinangre");
		
	//	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#login-signin"))).click();
		
	//	driver.findElement(By.cssSelector("input#login-signin")).click();
				
	//	driver.findElement(By.cssSelector("input#login-passwd")).sendKeys("1234567");
		
	//	driver.findElement(By.cssSelector("button#login-signin")).click();
		WebElement google = driver.findElement(By.xpath("//*[@id='tpa-google-button']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("arguments[0].scrollIntoView(true);", google);	
		google.click();
		js.executeScript("alert('Welcome to Google');"); 
		
	}

}
