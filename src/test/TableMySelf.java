package test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;                             //how to find rows nd table
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TableMySelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","chromedriver");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.w3schools.com/html/html_tables.asp");
		   
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		  //  driver .switchTo().frame("iframeResult");
		    
		    List <WebElement> rowelements = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		    System.out.println( rowelements.size());
	        int rowsize = rowelements.size();
	        
	        List <WebElement> colelements = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
	        System.out.println( colelements.size());
	        int colsize =colelements.size();
	        
	       WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[7]]/td[1]"));
	      System.out.println(data.getText());
	       //driver.switchTo().parentFrame();
	   //     int colsize = colelements.size();
	        
	     //   for(int i=1;i<=rowsize;i++) {
	      //  	(int j =1; j<= colsize;j++){
	        //		System.out.println("//table[@id='customers']/tbody/tr[" + i +"/td[" + j +"]").getText() + " ");
	        	}
	        
	       
	}


