//package basicweb;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//public class BasicActions {
//	WebDriver driver;
//	String baseURL;
//	
//	@Before
//	public void setUp() throws Exception {
//		driver = new ChromeDriver();
//		baseURL = "https://letskodeit.teachable.com/";
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		
//	}
//
//	
//	@Test
//	public void test() {
//		driver.get(baseURL);
//		driver.findElement(By.xpath(".//div[@id='navbar']//a[@href='/sign_in']")).click();
//		System.out.println("Clicked on login");
//		driver.findElement(By.id("user_email")).clear();
//		driver.findElement(By.id("user_email")).sendKeys("test@gmail.com");
//		System.out.println("Sending keys to user field");
//		driver.findElement(By.id("user_password")).sendKeys("password");
//		System.out.println("Sending keys to password");
//		driver.findElement(By.id("user_email")).clear();
//		
//		
//		
//	}
//	
//	@After
//	public void tearDown() throws Exception {
//		driver.quit();
//	}
//
//}
