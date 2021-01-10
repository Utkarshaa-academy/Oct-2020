import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Latest Jars\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("input#email")).sendKeys("9423111564");
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("9423111564");
		
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy[name='pass']")).sendKeys("8830158607");
		
		driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy")).click();
		
		//driver.findElement(By.xpath("//button[@name='login']//preceding::input[4]")).sendKeys("9423111564");
		
	//	driver.findElement(By.xpath("//button[@name='login']//preceding::input[3]")).sendKeys("8830158607");
		
	//	driver.findElement(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//child::li[2]")).click();
		
	//	driver.findElement(By.xpath("//input[@type='text']//ancestor::div[1]")).sendKeys("8830158607");
		
	//	driver.findElement(By.xpath("//input[@type='text']//following::input[1]")).sendKeys("9423111564");
		
	//	driver.findElement(By.xpath("//button[contains(@data-testid,'royal_login_button')]")).click();
		
	//	driver.findElement(By.xpath("//*[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("8830158607");
		
	//	driver.findElement(By.xpath("//*[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("9423111564");
		
	//	driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
		
	//	driver.findElement(By.linkText("Forgotten password?")).click();
		
	//	driver.findElement(By.xpath("//ul[@class='uiList localeSelectorList _2pid _509- _4ki _6-h _6-j _6-i']//following-sibling::li//a[@title='Marathi']")).click();
	Thread.sleep(2000);
	List<WebElement> linkcount = 	driver.findElements(By.tagName("input"));
	System.out.println(linkcount.size());
	}

}
