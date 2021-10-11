package test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;                             //how to find rows nd table
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","chromedriver");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.monsterindia.com/seeker/registration");
		   
		    driver.manage().window().maximize();
		    
		    driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		    
		    WebElement File = driver.findElement(By.xpath("//input[@type='file]"));
	}        file.sendKeys("home/racsethicisco/Downloads");
	

}
