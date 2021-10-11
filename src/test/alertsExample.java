package test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
public class alertsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","chromedriver");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demoqa.com/alerts");
		   
		    driver.manage().window().maximize();
		    
		    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		    
		    WebElement button1 = driver.findElement(By.xpath("//button[@id = 'alertButton']"));
		    button1.click();
		    
		    Alert alert =driver.switchTo().alert();
		    alert.accept();
		    
		   WebElement button2 = driver.findElement(By.xpath("//button[@id = 'promptButton']"));
		   button2.click();
		    
		   Alert alert2 = driver.switchTo().alert();
	       alert2.sendKeys("Clicked Ok");
	        alert2.accept();
	}
	

}
