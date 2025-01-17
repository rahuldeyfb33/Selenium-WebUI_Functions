package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;



public class FireFoxDriverWin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\rahul.dey\\workspace\\libs\\drivers\\geckodriver.exe");
		File pathBinary = new File("C:\\Users\\rahul.dey\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
		DesiredCapabilities desired = DesiredCapabilities.firefox();
		FirefoxOptions options = new FirefoxOptions();
		desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.google.co.in/");
		
	}

}
