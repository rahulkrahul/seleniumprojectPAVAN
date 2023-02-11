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
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleDropdownWithoutSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();

		// Thread.sleep(5000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit wait

		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		List<WebElement> lst = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println(lst.size());

		System.out.println("Normal for loop print values");
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i).getText());
			String label = lst.get(i).getText();
			if (label.equalsIgnoreCase("Java") || label.equalsIgnoreCase("Phyton")) {
				lst.get(i).click();
			}

		}

		System.out.println("enhance for each loop");
		for (WebElement li : lst) {
			System.out.println(li.getText());
		}

		for (WebElement li : lst) {
			String st = li.getText();
			if (st.equalsIgnoreCase("Java") || st.equalsIgnoreCase("Oracle")) {

				li.click();
			}
		}

	}

}
