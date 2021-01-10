import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Latest Jars\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("a._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy")).click();
		
		Select select = new Select(driver.findElement(By.cssSelector("select#day")));
		
		select.selectByIndex(0);
		
		Select selectmonth = new Select(driver.findElement(By.cssSelector("select#month")));
		
		selectmonth.selectByVisibleText("Aug");
		
		Select selectyear = new Select(driver.findElement(By.cssSelector("select#year")));
		
		selectyear.selectByVisibleText("2022");
		
	}

}
