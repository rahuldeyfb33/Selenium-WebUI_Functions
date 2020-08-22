package basicweb;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AWSLogin {



	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Programming\\Selenium\\eclipse-workspace\\libs\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseURL="https://console.aws.amazon.com/console/home?nc2=h_ct&src=header-signin";	
		driver.get(baseURL);		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("resolving_input")).sendKeys("rahuldeyfb39@gmail.com");
		driver.findElement(By.id("next_button")).click();
		driver.findElement(By.id("password")).sendKeys("Amazon@1234");
		driver.findElement(By.id("sign_button")).click();




	}



}