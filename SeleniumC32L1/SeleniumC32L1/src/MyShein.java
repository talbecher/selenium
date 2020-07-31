import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyShein {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://il.shein.com/");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".c-coupon-box >.iconfont.icon-close.she-close")).click();
		driver.findElement(By.cssSelector(".j-header-search-input")).sendKeys("t-shirt");
		driver.findElement(By.cssSelector(".iconfont-critical.icon-tubiaozhizuomoban.header2-icon-search")).click();
	

	}

}
