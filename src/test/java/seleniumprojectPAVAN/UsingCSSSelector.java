package seleniumprojectPAVAN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCSSSelector {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// using tag id tag #
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("macbook");
		driver.findElement(By.cssSelector("input#small-searchterms")).clear();
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("iphone");
		
		//using tag class tag .
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("macbook");
		driver.findElement(By.cssSelector("input.search-box-text")).clear();
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("iphone");
		
		//using tag attribute []-> 
		driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("macbook");
		driver.findElement(By.cssSelector("input[id='small-searchterms']")).clear();
		driver.findElement(By.cssSelector("[id='small-searchterms']")).sendKeys("macbook");

		//using tag class attribute .[]
		driver.findElement(By.cssSelector("input.search-box-text[id='small-searchterms']")).sendKeys("macbook");
		driver.findElement(By.cssSelector("input.search-box-text[id='small-searchterms']")).clear();
		driver.findElement(By.cssSelector("input.search-box-text[id='small-searchterms']")).sendKeys("samsung");
	}
}
