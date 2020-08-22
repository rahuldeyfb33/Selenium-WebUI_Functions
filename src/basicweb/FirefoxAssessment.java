package basicweb;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxAssessment {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\rahul.dey\\workspace\\libs\\drivers\\geckodriver.exe");
	File pathBinary = new File("C:\\Users\\rahul.dey\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
	FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
	DesiredCapabilities desired = DesiredCapabilities.firefox();
	FirefoxOptions options = new FirefoxOptions();
	desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
	WebDriver driver = new FirefoxDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://www.mirion.com/account");
//	driver.findElement(By.className("button button--compact")).click();
//	driver.findElement(By.linkText("Create an Account")).click();
	driver.findElement(By.xpath("//a[@href='/account/create']")).click();
//	driver.findElement(By.id("user_email")).sendKeys("rahuldeyfb33@gmail.com");
}
}