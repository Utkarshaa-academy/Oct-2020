import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertiesfile {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Sharayu\\eclipse-workspace\\SeleniumDec2020\\src\\demo.properties");
		Properties prop = new Properties();
		prop.load(file);
		//String username = prop.getProperty("username");
		//System.out.println(username);
		String url = prop.getProperty("url");
		System.out.println(url);
		
		System.setProperty("webdriver.chrome.driver",prop.getProperty("chromepath"));
        WebDriver driver= new ChromeDriver();			
        driver.get(url);
        driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
	}

}
