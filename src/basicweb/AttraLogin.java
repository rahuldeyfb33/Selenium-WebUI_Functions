package basicweb;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AttraLogin {



	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Programming\\Selenium\\eclipse-workspace\\libs\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseURL="https://intranet.attra.com";	
		driver.get(baseURL);		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='http://portal.office.com']")).click();
//		driver.findElement(By.id("i0116")).sendKeys("rahul.dey@attra.com.au");
		driver.findElement(By.id("idSIButton9")).click();
		



	}



}