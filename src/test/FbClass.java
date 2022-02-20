package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import okio.Timeout;

public class FbClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\kirananx\\eclipse-workspace\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		
		//Use text function we can locate element
		WebElement Crebutton = driver.findElement(By.xpath("//*[text()='Create New Account']"));
		
		Crebutton.click();
		
		
		//username.sendKeys("creatorshashikiran@gmail.com");
		//password.sendKeys("Reset@123");
		
		//login.click();
		
		
		

	}

}
