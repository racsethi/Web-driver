package test;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screenshotexample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","chromedriver");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.simplilearn.com/");
		   
		    driver.manage().window().maximize();
		    
		    driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		    
		    WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		    LoginLink.click();
		    
		    WebElement UserName = driver.findElement(By.name("user_login"));
		    UserName.sendKeys("abc@gmail.com");
		    
		    WebElement Password = driver.findElement(By.id("password"));
		    Password.sendKeys("Rachit15@");
		    
		    WebElement LoginButton = driver.findElement(By.name("btn_login"));
		    LoginButton.click();
		    
		    String ActualMsg = Error.getText();
		    String ExpMsg = "The email or password you have entered is invalid.";
		    
		    TakesScreenshot tsObj = (TakesScreenshot) driver;
	        File image = tsObj.getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(image, new File("screenshot.png"));
	        
		      if (ActualMsg.equals(ExpMsg)) {
		    	 System.out.println("Test passed");
		    	 
		     }else {
		   
		     }	    	 System.out.println("Test failed");
		     
	}

}
