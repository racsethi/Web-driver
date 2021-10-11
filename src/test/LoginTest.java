package test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args)  {
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
    
  //  String ActualMsg = Error.getText();
    //String ExpMsg = "The email or password you have entered is invalid.";
     // if (ActualMsg.equals(ExpMsg)) {
    //	 System.out.println("Test passed");
    	 
   //  }else {
    //	 System.out.println("Test failed");
     List<WebElement> Links = driver.findElements(By.tagName("a"));
     System.out.println("Total links are : "+ Links.size());
      for(WebElement data : Links) {
    	//  System.out.println(data.getText());
    	  System.out.println("Target URL is :" + data.getAttribute("href"));
      }
      System.out.println(driver.getTitle());
      System.out.println(driver.getCurrentUrl());
       
   // WebElement FogotPass = driver.findElement(By.partialLinkText("Forgot"));
  //  FogotPass.click();
  //  Thread.sleep(5000);
    
   driver.quit();
    
	}
	

}
