import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.get("https://www.automation.co.il");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.toLowerCase().contains("automation")) {
			System.out.println("Kol Akavod");
		}
		
		String title = driver.getTitle();
		System.out.println(title);

		String pageSource = driver.getPageSource();
		
		driver.quit();
		
	}

}
