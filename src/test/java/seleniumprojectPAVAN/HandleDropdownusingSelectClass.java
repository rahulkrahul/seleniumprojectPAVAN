/*	driver.get();
	driver.getCurrentUrl();
	driver.getPageSource();
	driver.getTitle();
	driver.getWindowHandle();
	driver.getWindowHandles();//Set
	*/
package seleniumprojectPAVAN;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleDropdownusingSelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();

		// Thread.sleep(5000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit wait
		
		WebElement drpCountryEle= driver.findElement(By.xpath("//select[@id='country-list']"));
		
		Select drpCountry= new Select(drpCountryEle);
		
		//find total number of options
		List<WebElement> options= drpCountry.getOptions();
		System.out.println("Number of options in the list country:"+options.size());
		
		/*drpCountry.selectByIndex(1);
		drpCountry.selectByVisibleText("USA");
		drpCountry.selectByValue("3");//attribute value
*/
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		
		System.out.println("enhance forloop");
		//enhance for loop
		for(WebElement opt: options) {
			System.out.println(opt.getText());
		}
		
		

		}

}
