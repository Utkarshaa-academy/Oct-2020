import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlesDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Latest Jars\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();			
        driver.get("http://demo.guru99.com/popup.php");
        driver.manage().window().maximize();	
        String mainWindow=driver.getWindowHandle();
        //capture screenshot
        TakesScreenshot ts = (TakesScreenshot)driver;
        File srcfile =   ts.getScreenshotAs(OutputType.FILE);
     //   FileUtils.copyFile(srcfile, new File("C:\\Users\\Sharayu\\eclipse-workspace\\SeleniumDec2020\\src\\one.jpeg"));
        String timestamp = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
    	
		FileUtils.copyFile(srcfile,new File ("./ScreenShot_Folder/"+timestamp+ ".jpeg"));
        driver.findElement(By.linkText("Click Here")).click();
        Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!mainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	   
                    //actions performed in child window
                    driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");                			
                    
                    driver.findElement(By.name("btnLogin")).click();	
                    File srcfile1 =   ts.getScreenshotAs(OutputType.FILE);
                    FileUtils.copyFile(srcfile1,new File ("./ScreenShot_Folder1/"+timestamp+ ".jpeg"));
                    System.out.println(driver.switchTo().window(ChildWindow).getTitle());             
			// Closing the Child Window.
                    //    driver.close();		
            }		
        }		
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(mainWindow);
            driver.quit();
	}

}
