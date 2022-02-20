package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kirananx\\eclipse-workspace\\Selenium\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
        
        System.out.println("Total of rows are " + rows.size());
        
        List<WebElement> colum = driver.findElements(By.xpath("//table[@id='customers']//th"));
        
        System.out.println("No of colums" +colum.size() );
        
        List<WebElement> thirdrow = driver.findElements(By.xpath("//table[@id='customers']//tr[4]/td"));
        
        for(WebElement ele:thirdrow) {
        	
        System.out.println(ele.getText());
        	
        	
        }
        
    List<WebElement> firstcolum = driver.findElements(By.xpath("//table[@id='customers']//td[1]"));
        
        for(WebElement ele:firstcolum) {
        	
        System.out.println(ele.getText());
        	
        	
        }
        
        
        

	}

}
