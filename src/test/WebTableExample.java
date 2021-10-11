package test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;                             //how to find rows nd table
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","chromedriver");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.w3schools.com/html/html_tables.asp");
		   
		    driver.manage().window().maximize();
		    
		    driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		    List <WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	        
	        List <WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
	        
	       
	        System.out.println("no of rows are:" + rows.size());
	        System.out.println("no of columns are:" + columns.size());
	        
	        WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[7]/td[1]"));  //particular element
	        System.out.println(data.getText());
	        
	  ///      WebElement elem = driver.findElement(By.xpath("//*[text()='Define an HTML Table']"));  //for scrolling
	        
	        
	    //    JavascriptExecutor js = (JavascriptExecutor) driver;   // for scrolling
	      //  js.executeScript("arguments[0].scrollIntoView();", elem);
	       
	        WebElement elem1 = driver.findElement(By.xpath("//*[text()='Table Rows']"));   //for scrolling
	        JavascriptExecutor js1 = (JavascriptExecutor) driver;   // for scrolling
	        js1.executeScript("arguments[0].scrollIntoView();", elem1);
	}

}
