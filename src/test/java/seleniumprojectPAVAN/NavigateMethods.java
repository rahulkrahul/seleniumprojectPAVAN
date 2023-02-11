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
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//Thread.sleep(5000);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
		
		/*
		 * //Explicit wait WebDriverWait myWait= new
		 * WebDriverWait(driver,Duration.ofSeconds(10));//WebDriverWait class, waits on
		 * condition, element, use where it takes time WebElement username =
		 * myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//input[@placeholder='Username']"))); username.sendKeys("Admin");
		 */
		
		
		
		 // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30L))
		       .pollingEvery(Duration.ofSeconds(5L))
		       .ignoring(NoSuchElementException.class);

		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//input[@placeholder='Username']"));
		     }
		   });
		   System.out.println("Username displayed:"+foo.isDisplayed());
		   System.out.println("Username enabled:"+foo.isEnabled());
		   foo.sendKeys("Admin");
		   
		   
		System.out.println("Get current URL"+ driver.getCurrentUrl());
		System.out.println("Get Title"+ driver.getTitle());
		

	}

}
