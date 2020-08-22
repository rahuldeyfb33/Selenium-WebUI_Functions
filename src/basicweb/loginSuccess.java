package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginSuccess {

	public static void main(String[] args) {
		
		String baseURL="http://automationpractice.com/index.php?controller=authentication&back=my-account";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul.dey\\workspace\\libs\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		
		driver.findElement(By.name("email")).sendKeys("rahuldeyfb33@gmail.com");
		
		driver.findElement(By.name("passwd")).sendKeys("abcd@1234");
		
		driver.findElement(By.name("SubmitLogin")).click();
		
		
		String currentURL = driver.getCurrentUrl();
		
		System.out.println(currentURL);
		
		

		
		if(currentURL == "http://automationpractice.com/index.php?controller=my-account"){
				
		System.out.println("Login Successfull");
			
		}
		
		else{
			System.out.println("Login failed");
		}
		
		
		

	}

}
