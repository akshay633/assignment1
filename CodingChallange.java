package friday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CodingChallange {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://login.salesforce.com");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password#123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		
		Thread.sleep(3000);
		//parent to child path
		WebElement click1 = driver.findElement(By.xpath("//a[@title='Accounts']/span"));
		driver.executeScript("arguments[0].click()", click1);
		
		//patent to child path
		driver.findElement(By.xpath("//a[@title='New']/div")).click();
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Akshay");
		
		Thread.sleep(5000);
		WebElement click2 = driver.findElement(By.xpath("(//div[@role='none']/button)[3]"));
		driver.executeScript("arguments[0].click()", click2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@title='Public']")).click();
		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		String attribute = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]/a")).getAttribute("title");
		
		System.out.println(attribute);
		
		if(attribute.contains("Akshay")){
		System.out.println("verified");
		}else {
			System.out.println("not verified");
		}
		
		
		
		

		
		
	    
		
		
		
		
		
		
		
		
		
		
	

	}

}