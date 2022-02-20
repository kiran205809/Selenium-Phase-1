package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	

	System.setProperty("webDriver.chrome.driver", "C:\\Users\\kirananx\\eclipse-workspace\\Selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demoqa.com/frames");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			
			driver.switchTo().frame("frame1");
			
			WebElement username = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
			
			System.out.println(username.getText());

}
}