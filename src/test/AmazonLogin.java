package test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AmazonLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		  System.setProperty("webdriver.chrome.driver","chromedriver");
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://www.amazon.in/events/greatindianfestival?tag=msn2020deskstd1-21");
		   
		   driver.manage().window().maximize();
		    
		  driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		  
		  WebElement SigninLink = driver.findElement(By.linkText("Sign in"));
		    SigninLink.click();
		  
		  WebElement UserName = driver.findElement(By.xpath("//input[@name ='email']"));
         UserName.sendKeys("sethirachit1996@gmail.com"); 
		   
	//   WebElement Password = driver.findElement(By.xpath("//input[@name = 'password']"));
	  //  Password.sendKeys("Rachit15@");
		   
	
         WebElement Continue = driver.findElement(By.xpath("//*[@id ='continue']"));
  	     Continue.click();
  	    
  	    WebElement SignInButton = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
 	    SignInButton.click();
  	   
  	   
 	   
  	   
	   
	   
	}

}
