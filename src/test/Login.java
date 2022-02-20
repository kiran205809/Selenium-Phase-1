package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kirananx\\Downloads\\chromedriver_win32\\chromedriver.exe");
//System.setProperty("webdriver.gecko.driver", "C:\\Users\\kirananx\\eclipse-workspace\\Selenium\\geckodriver.exe");
     WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
              
        driver.get("https://www.simplilearn.com/");
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
    
        
       WebElement Loginclick = driver.findElement(By.className("login"));
        
        Loginclick.click();
        
        WebElement Username = driver.findElement(By.name("user_login"));
        WebElement Password = driver.findElement(By.name("user_pwd"));
        WebElement Login = driver.findElement(By.name("btn_login"));
        WebElement Button= driver.findElement(By.className("rememberMe"));
        Button.click();
        
        Username.sendKeys("creatorshashikiran@gmail.com");
        Password.sendKeys("Reset@143");
        Login.click();
        
        
        WebElement ErrMsg = driver.findElement(By.id("msg_box"));
        String ActualMsg =ErrMsg.getText();
        String ExpectedMSg = "The email or password you have entered is invalid.";
        
        if(ActualMsg.equals(ExpectedMSg)) {
			System.out.println("TC Passed");
		}else {
			System.out.println("TC Failed");
			
			
			
			
		}
        
        //To inspect we use findElements and storing in list
List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links are " + links.size());
		
		
		// to retriev the value we below code
		for(WebElement elm : links) {
			
			System.out.println(elm.getAttribute("href"));
		}

		driver.close();
		
	}

}



