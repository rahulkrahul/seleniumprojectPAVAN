package seleniumprojectPAVAN;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScriptOrangeHRMLoginTest {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		Thread.sleep(5000);

		String act_label = "";
		try {
			act_label = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
			System.out.println(act_label);
		}
		catch(NoSuchElementException e) {
			
		}
		System.out.println(act_label);

		String exp_label="Dashboard";
		if(act_label.equalsIgnoreCase(exp_label)) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		
	}
}
