package test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbsSignUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","chromedriver");
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://en-gb.facebook.com/");
		   
		   driver.manage().window().maximize();
		    
		    driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		    
		    WebElement CreateAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		    CreateAccount.click();
		    
		    WebElement FName = driver.findElement(By.xpath("//input[@name ='firstname']"));
		    FName.sendKeys("Rachit");
		    
		    WebElement LName = driver.findElement(By.xpath("//input[@name ='lastname']"));
		    LName.sendKeys("xtsd");
		    
		    WebElement Day = driver.findElement(By.xpath("//select[@id= 'day']"));
		    Select ddDay = new Select(Day);
		    
		///    ddDay.selectByVisibleText("14");
		    ddDay.selectByValue("12");
		    //ddDay.selectByIndex(3);
		    
		    WebElement Month = driver.findElement(By.xpath("//select[@id ='month']"));
		    Select m = new Select (Month);
		//    m.selectByVisibleText("feb");
		    m.selectByIndex(2);
		    
		//    WebElement Year = driver.findElement(By.xpath("//select[@id='year]"));
		  //  Select y = new Select(Year);
		   // y.selectByValue("2019");
		    
		    WebElement Female = driver.findElement(By.xpath("//input[@type = 'radio' and @value ='1']"));
		    Female.click();
		    if(Female.isSelected()) {
		    	System.out.println("Radio Button Selected");
		    }else {
		    	System.out.println("Radio Button is not Selected");
		    }
	 //    List <WebElement> Months = driver.findElements(By.xpath("//select[@id ='month']/option*));
		// 	for(int i =1;i<=Months.size();i++)  {
		  // 	System.out.println(Months,get(i).getText());	//imp for displaying products/month
		    	
		    
		 	}    
		    
		   	
	}


