package friday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task3 {

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
	
	Thread.sleep(3000);
    driver.findElement(By.xpath("//div[contains(@class,'slds-form-element__control')]/input")).sendKeys("Tasks");
    driver.findElement(By.xpath("//p[@class='slds-truncate']/mark")).click();
    driver.findElement(By.xpath("//a[@title='Show one more action']")).click();
    driver.findElement(By.xpath("//a[@role='menuitem']")).click();
    
    driver.findElement(By.xpath("(//input[@role='combobox'])[2]")).sendKeys("Bootcamp");
    driver.findElement(By.xpath("//a[@class='select']")).click();
    driver.findElement(By.xpath("//a[text()='Waiting on someone else']")).click();
    driver.findElement(By.xpath("//span[text()='Save']")).click();
    
    String attribute = driver.findElement(By.xpath("//div[text()='Bootcamp']")).getAttribute("title");
    System.out.println(attribute);
    
    if(attribute.contains("Bootcamp")) {
    	System.out.println("verified");
    	
    }else {
    	System.out.println("Not verified");
    }
    
    
	
	
	

	}

}
