package friday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password#123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		
	    WebElement click = driver.findElement(By.xpath("//a[@title='Opportunities']"));
	    driver.executeScript("arguments[0].click();", click);
	    
	    driver.findElement(By.xpath("//div[@title='New']")).click();
	    driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("Akshay");
	    
	    //driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys("Akshay");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("9/6/2022");
	    
	    Thread.sleep(3000);
		WebElement click1 = driver.findElement(By.xpath("(//label[@class='slds-form-element__label'])[3]"));
		driver.executeScript("arguments[0].click()", click1);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		String attribute = driver.findElement(By.xpath("(//a[@class='forceActionLink']/div)[2]")).getAttribute("title");
		System.out.println(attribute);
		
		if(attribute.contains("Akshay")) {
			System.out.println("verified");
			
			
		}else {
			System.out.println("Not verified");
		}
		
		
		
		

	}

}
