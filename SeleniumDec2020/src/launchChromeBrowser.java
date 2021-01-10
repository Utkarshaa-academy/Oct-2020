import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Latest Jars\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("email")).sendKeys("8830158607");
		driver.findElement(By.xpath("//*[@class='inputtext _55r1 _6luy']")).sendKeys("8830158607");
		
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("9423111564");
		
		driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
		
		driver.findElement(By.xpath("//*[@name=\"submit[Confirm Deletion]\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"checkpointSubmitButton\"]")).click();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("12345");
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		driver.switchTo().alert().accept();
		
		driver.switchTo().alert().accept();
		
		
	//	driver.close();
		
		
		
	}

}
