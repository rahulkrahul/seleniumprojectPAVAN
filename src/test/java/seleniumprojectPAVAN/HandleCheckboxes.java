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

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();

		// Thread.sleep(5000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit wait

		List<WebElement> chkBoxes = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Number of checkboxes:" + chkBoxes.size());
		/*
		 * for(int i=0;i<chkBoxes.size();i++) { if(chkBoxes.get(i).isEnabled()) {
		 * chkBoxes.get(i).click();
		 * System.out.println("Checkbox name:"+chkBoxes.get(i).getText()); } }
		 */
		// select last two checkboxes use index
		for (int i = 5; i < chkBoxes.size(); i++) {
			if (chkBoxes.get(i).isEnabled()) {
				chkBoxes.get(i).click();
				System.out.println("Checkbox name:" + chkBoxes.get(i).getText());
			}
		}

		// select first two checkboxes use index
		for (int i = 0; i < chkBoxes.size(); i++) {
			if (i < 2) {
				if (chkBoxes.get(i).isEnabled()) {
					chkBoxes.get(i).click();
					System.out.println("Checkbox name:" + chkBoxes.get(i).getText());
				}
			}
		}

//		//enhanced forloop - check all checkboxes
//		for(WebElement chk:chkBoxes) {
//			chk.click();
//			
//		}
		//uncheck checkboxes
		for(WebElement chk:chkBoxes) {
			if(chk.isSelected()) {
				chk.click();
			}
		}
	}

}
