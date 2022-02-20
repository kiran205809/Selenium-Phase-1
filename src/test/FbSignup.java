package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kirananx\\eclipse-workspace\\Selenium\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        
        WebElement signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        
        signup.click();
        
        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
        
        WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        
        
        
        
        firstname.sendKeys("kiran");
        lastname.sendKeys("A");
        
        mobile.sendKeys("7337808863");
        
        password.sendKeys("Reset");
        
        
        String strGender = "Male";

        
        //input[@value='1']
        //input[@value='2']
        //input[@value='-1']
        
        //label[text()='Male']/following-sibling::input
        //label[text()='Female']/following-sibling::input
        //label[text()='Custom']/following-sibling::input
        
        String genXpath = "//label[text()='" + strGender + "']/following-sibling::input";
        
        WebElement gen = driver.findElement(By.xpath(genXpath));
        gen.click();
        
List<WebElement> Months = driver.findElements(By.xpath("//select[@title='Month']/option"));
		
		for(WebElement elm : Months) {
			
			System.out.println(elm.getText());
			
			
		}
			
			WebElement CurrMonth = driver.findElement(By.xpath("//select[@title='Month']"));
	        
	       System.out.println("Current Month " + CurrMonth.getText());
	        
	        
	        WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
	        
	        Select ddDay = new Select(Day);
	        ddDay.selectByVisibleText("28");
	        
	       // WebElement CurrMonth = driver.findElement(By.xpath("//select[@title='Month']"));
	        
	        Select month = new Select(CurrMonth);
	        
	        month.selectByVisibleText("Nov");
	        
	        
	        
	        WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
	        
	        
	        Select Year =new Select(year);
	        
	        Year.selectByVisibleText("1983");
	        

        
	}
     
}
