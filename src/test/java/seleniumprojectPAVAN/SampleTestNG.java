package seleniumprojectPAVAN;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SampleTestNG {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit wait
	}

	@Test(enabled=false,priority = 1)
	public void Login() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Test(enabled=false)
	public void Dashboard() {
		String act_label = "";
		try {
			act_label = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
			System.out.println(act_label);
		} catch (NoSuchElementException e) {

		}
		System.out.println(act_label);

		String exp_label = "Dashboard";
		if (act_label.equalsIgnoreCase(exp_label)) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
