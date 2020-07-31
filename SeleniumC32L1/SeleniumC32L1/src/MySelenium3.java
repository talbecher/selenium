import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySelenium3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automation.co.il/tutorials/selenium/demo1/indexNoID.html");
	
		driver.findElement(By.cssSelector("#firstname")).sendKeys("Gal");
		driver.findElement(By.cssSelector("#lastname")).sendKeys("Matalon");
		driver.findElement(By.cssSelector("#email")).sendKeys("gal@gmail.com");
		driver.findElement(By.cssSelector(".btn-next")).click();
		//page 2
		driver.findElement(By.cssSelector(".fa.fa-child")).click();
		driver.findElement(By.cssSelector("[name='next']")).click();
		//page 3
		driver.findElement(By.cssSelector("[name='streetname']")).clear();
		driver.findElement(By.cssSelector("[name='streetname']")).sendKeys("Lotem");
		driver.findElement(By.cssSelector("[name='streetnumber']")).sendKeys("1");
		driver.findElement(By.cssSelector("[name='city']")).sendKeys("Netanya");
		driver.findElement(By.cssSelector("#finish")).click();
		
		WebElement el = driver.findElement(By.cssSelector(".cta-title"));
		
		if (el.isDisplayed()) {
			String text = el.getText();
			System.out.println(text);
			if (text.contains("ωμεν")) {
				System.out.println("Test Avar");
			}
			else {
				System.out.println("Test Lo Avar");
			}
		}
		
		
	}

}
