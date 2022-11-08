package maven.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Main {

	@Test
	public void startDriver() throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://ultimateqa.com/complicated-page");
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
