package test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertsSelf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","chromedriver");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demoqa.com/alerts");
		   
		    driver.manage().window().maximize();
		    
		   Thread.sleep(2000);
	//	   driver.findElement(By.id("alertButton")).click();
		//   Thread.sleep(2000);
		 //  Alert alert = driver.switchTo().alert();
		   //String alertMessage= driver.switchTo().alert().getText();
		 //  System.out.println(alertMessage);
		  // Thread.sleep(2000);
		  // alert.accept();
		   
		//   driver.findElement(By.id("timerAlertButton")).click();  
	//   Alert alert = driver.switchTo().alert();
		//   String alertMessage = driver.switchTo().alert().getText();
		  // System.out.println(alertMessage);
		   //Thread.sleep(2000);
		   //alert.accept();
		   
		   driver.findElement(By.partialLinkText("Click")).click();
		   
		   
		    
	}

}
