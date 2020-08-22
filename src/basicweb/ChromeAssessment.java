package basicweb;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ChromeAssessment {



	public static void main(String[] args) {

		String baseURL="https://www.mirion.com/account";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul.dey\\workspace\\libs\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);

		Object element;
//		((JavascriptExecutor) driver).executeScript("argument[0].scrollIntoView(true);",element);  
		driver.findElement(By.xpath("//a[@href='/account/create']")).click();

	}
}