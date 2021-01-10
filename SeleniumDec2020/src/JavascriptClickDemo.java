import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptClickDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Latest Jars\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();			
        
        //Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;		
        		
        //Launching the Site.	
     //   js.executeScript("window.location = 'http://demo.guru99.com/V4/'");
     //   driver.get("http://demo.guru99.com/V4/");	
        driver.navigate().to("http://demo.guru99.com/V4/");
     
          //Maximize window		
        driver.manage().window().maximize();		
        
        String title = js.executeScript("return document.title;").toString();
        System.out.println(title);
        String url = js.executeScript("return document.URL;").toString();
        System.out.println(url);
        String domain = js.executeScript("return document.domain;").toString();
        System.out.println(domain);
        WebElement button = driver.findElement(By.xpath("//input[@name='btnLogin']"));
        
        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr34926");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("amUpenu");
        
      //  js.executeScript("window.scrollBy(0,300)");
     //   js.executeScript("arguments[0].click();", button);
        WebElement link = driver.findElement(By.linkText("here"));
        js.executeScript("arguments[0].scrollIntoView(true);", link);	
     //   js.executeScript("alert('Welcome to Utkarshaa academy');");
        js.executeScript("history.go(0)");
        js.executeScript("window.location = 'http://www.facebook.com'");
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement login = driver.findElement(By.xpath("//*[@name='login']"));
        js.executeScript("arguments[0].value='9423111564';", email);
        js.executeScript("arguments[0].value='8830158607';", password);
        
        String sText =  js.executeScript("return document.documentElement.innerText;").toString();
        System.out.println(sText);
        js.executeScript("arguments[0].click();", login);
        
       // js.executeScript("document.getElementById('email').value='9423111564';");
	}

}
