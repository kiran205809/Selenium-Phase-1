package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		WebElement ele= driver.findElement(By.xpath("//button[@id='alertButton']"));
           
		ele.click();
		     Alert alert =driver.switchTo().alert();
		     
		     //Accepting the alert popup
		     //alert.accept();
		     //To retrieve the text
		     
		     System.out.println(alert.getText());
		     alert.accept();
		     
		     //To cancel
		     
		     WebElement ele1 =driver.findElement(By.xpath("//button[@id='confirmButton']"));
		     
		     ele1.click();
		     
		     Alert alert1=driver.switchTo().alert();
		     alert1.dismiss();
		     
		     
		     //TO send values in alert
		     
 WebElement ele2 =driver.findElement(By.xpath("//button[@id='promtButton']"));
		     
		     ele2.click();
		     
		     Alert alert2=driver.switchTo().alert();
		     alert2.sendKeys("Hello niklunj");
		     alert2.accept();
		
	}

}
     