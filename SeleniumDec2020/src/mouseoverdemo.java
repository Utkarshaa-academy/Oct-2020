import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoverdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Latest Jars\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/menu/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
		driver.manage().window().maximize();
		
		Actions actions=new Actions(driver);

		WebElement MainMenu2 = driver.findElement(By.xpath("//a[contains(text(),'Main Item 2')]"));
		
		actions.moveToElement(MainMenu2).build().perform();
		
		WebElement subList = driver.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST »')]"));
		
		actions.moveToElement(subList).build().perform();
	}

}
