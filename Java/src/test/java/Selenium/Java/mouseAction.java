package Selenium.Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Latest Jars\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		Actions actions=new Actions(driver);
		
		WebElement doubleclickbutton= driver.findElement(By.cssSelector("button#doubleClickBtn"));
		
		WebElement RightClickbutton= driver.findElement(By.cssSelector("button#rightClickBtn"));
		
		WebElement clickButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		actions.doubleClick(doubleclickbutton).perform();
		
		actions.contextClick(RightClickbutton).perform();

		actions.click(clickButton).perform();
	}
}
