package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","chromedriver");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://jqueryui.com/datepicker/");
		   
		    driver.manage().window().maximize();
		    
		    driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		    
		    driver.switchTo().frame(0);
		    WebElement date = driver.findElement(By.id("datepicker"));
		    
		 //   WebElement date = driver.findElement(By.xpath("//input[@id = 'datepicker']"));
		    
		  //   date.sendKeys("15/10/21");
		    date.click();
		    WebElement day = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='15']"));
	     
		    
		    WebElement arrow = driver.findElement(By.xpath("//a[@title='Next']"));
	        WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")); 
	        
	        String sMonth=month.getText();
	        while(!sMonth.equals("December"));
	        {
	        	arrow.click();
	        	month = driver.findElement(By.xpath("//span[@class ='ui-datepicker-month']"));
	        	arrow = driver.findElement(By.xpath("//a[@title='Next']"));
	        	sMonth= month.getText();
	        	
	        	
	        }
	        WebElement day = driver.findElement(By.xpath("//table[@class='ui-datepicker-calender]//a[text()='15']"));
		      day.click(); 
	}

}
