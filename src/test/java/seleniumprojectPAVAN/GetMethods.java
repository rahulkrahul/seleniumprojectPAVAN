	/*	driver.get();
		driver.getCurrentUrl();
		driver.getPageSource();
		driver.getTitle();
		driver.getWindowHandle();
		driver.getWindowHandles();//Set
		*/
package seleniumprojectPAVAN;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
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
