package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeAccountCreation {

	public static void main(String[] args) throws InterruptedException {
		String baseURL="https://www.mirion.com/account/create";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul.dey\\workspace\\libs\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		String title = driver.getTitle();
		String titleWithoutSpaces = title.replaceAll("\\s", "");
		String upperTitle = titleWithoutSpaces.toUpperCase();
		System.out.println(upperTitle);
		
		char[] CharArray = upperTitle.toCharArray();
		
		for(int i=0; i<=CharArray.length; i++ ){
			if(i == 0){
				System.out.println(CharArray[0]);
			}
			
			if(i == (CharArray.length-1)){
				System.out.println(CharArray[CharArray.length-1]);
			}
		}
		
		
		
		driver.findElement(By.id("accounts_account_first_name")).sendKeys("Rahul");
		driver.findElement(By.id("accounts_account_last_name")).sendKeys("Dey");
		driver.findElement(By.id("accounts_account_email")).sendKeys("rahuldeyfb33@gmail.com");
		driver.findElement(By.id("accounts_account_phone")).sendKeys("51321545");
//		driver.findElement(By.name("accounts_account[country]")).selectByVisibleText("India");
		driver.findElement(By.id("accounts_account_company")).sendKeys("Attra");
		driver.findElement(By.id("accounts_account_password")).sendKeys("abcd1234");
		driver.findElement(By.id("accounts_account_password_confirmation")).sendKeys("abcd1234");
		
		
		driver.findElement(By.className("button js-submit")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		driver.quit();
		
		
		
		
	}

}
