
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandDropDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Latest Jars\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		Actions actions=new Actions(driver);

		WebElement From = driver.findElement(By.id("draggable"));
		
		WebElement to = driver.findElement(By.id("droppable"));
		
		String actualText= to.getText();
		
		System.out.println(actualText);
		
		actions.dragAndDrop(From, to).build().perform();
		
		String totext = to.getText();	
		
		System.out.println(totext);
		if(totext.equals("Dropped!")) {
			 System.out.println("PASS: Source is dropped to target as expected");
			 }else {
			 System.out.println("FAIL: Source couldn't be dropped to target as expected");
			 }
		
	}

}
