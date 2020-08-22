package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeXpath {
public static void main(String[] args) {
	
	String baseURL="https://www.mirion.com/account";
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul.dey\\workspace\\libs\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();		
	driver.manage().window().maximize();		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(baseURL);
	driver.findElement(By.xpath("//a[@href='/account/create']")).click();
//	driver.findElement(By.xpath("//a[text()='Create ']")).click(); 
//	driver.findElement(By.id("user_email")).sendKeys("rahuldeyfb33@gmail.com");
	
	
}

}
