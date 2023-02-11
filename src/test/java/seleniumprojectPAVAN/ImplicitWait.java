	/*	driver.get();
		driver.getCurrentUrl();
		driver.getPageSource();
		driver.getTitle();
		driver.getWindowHandle();
		driver.getWindowHandles();//Set
		*/
package seleniumprojectPAVAN;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait

		
		System.out.println("Get current URL"+ driver.getCurrentUrl());
		System.out.println("Get Title"+ driver.getTitle());
		System.out.println("Get Page source "+ driver.getPageSource());
		String str= driver.getPageSource();
		System.out.println(str.contains("html"));
		
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windowId=driver.getWindowHandles();
		
		for(String winId:windowId) {
			System.out.println(winId);
		}
		//driver.switchTo(windowId)
		


	}

}
