package basicweb;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Chromedriverpractice {



	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul.dey\\workspace\\libs\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseURL="https://www.mirion.com/account";	
		driver.get(baseURL);		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();





	}



}