import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySelenium2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automation.co.il/tutorials/selenium/demo1/indexNoID.html");
	
		driver.findElement(By.id("firstname")).sendKeys("Gal");
		driver.findElement(By.id("lastname")).sendKeys("Matalon");
		driver.findElement(By.id("email")).sendKeys("gal@gmail.com");
		driver.findElement(By.id("next")).click();
	}

}
