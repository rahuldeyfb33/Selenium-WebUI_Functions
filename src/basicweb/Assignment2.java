package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
	public static void main(String[] args) {

		String baseURL="http://automationpractice.com/index.php";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Programming\\Selenium\\eclipse-workspace\\libs\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);

		//clicking the login button
		driver.findElement(By.className("login")).click();


		//providing the email button
		driver.findElement(By.id("email_create")).sendKeys("rahuldeyfb3352@gmail.com");


		// Clicking the create account button
		driver.findElement(By.id("SubmitCreate")).click();

		// Providing all the details

		WebElement titleRadioBtn = driver.findElement(By.id("id_gender1"));
		titleRadioBtn.click();

		driver.findElement(By.id("customer_firstname")).sendKeys("Rahul");

		driver.findElement(By.id("customer_lastname")).sendKeys("Dey");

		driver.findElement(By.id("passwd")).sendKeys("abcd@1234");

		WebElement element1 = driver.findElement(By.id("days"));
		Select sel1 = new Select(element1);

		sel1.selectByValue("1");

		WebElement element2 = driver.findElement(By.name("months"));
		Select sel2 = new Select(element2);

		sel2.selectByValue("10");


		WebElement element3 = driver.findElement(By.name("years"));
		Select sel3 = new Select(element3);

		sel3.selectByValue("1994");

		WebElement newsCheckBox = driver.findElement(By.name("newsletter"));
		newsCheckBox.click();


		driver.findElement(By.id("firstname")).sendKeys("Kalyan");

		driver.findElement(By.id("lastname")).sendKeys("Kumar");
        
			
		driver.findElement(By.id("company")).sendKeys("Attra");
		
		driver.findElement(By.id("address1")).sendKeys("BTM");
		
		driver.findElement(By.id("address2")).sendKeys("Mico layout police station");
		
		driver.findElement(By.id("city")).sendKeys("Bangalore");
		
		WebElement element4 = driver.findElement(By.name("id_state"));
		Select sel4 = new Select(element4);

		sel4.selectByValue("1");
		
		driver.findElement(By.name("postcode")).sendKeys("56006");
		
		WebElement element5 = driver.findElement(By.name("id_country"));
		Select sel5 = new Select(element5);

		sel5.selectByValue("21");
		
		driver.findElement(By.id("phone")).sendKeys("54564121");
		
		driver.findElement(By.id("phone_mobile")).sendKeys("5455564121");
		
		driver.findElement(By.id("alias")).sendKeys("XYZ");
		
		driver.findElement(By.id("submitAccount")).click();
		
		
		
		
		
		
		
		
		
		
		
		















	}


}
