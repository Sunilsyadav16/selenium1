package maven.project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Main {

	WebDriver driver;
	@BeforeTest
	public void startDriver() throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\Desktop\\chromedriver_win32\\chromedriver-win64\\chromedriver.exe");
		 driver= new ChromeDriver();
		
		driver.get("https://ultimateqa.com/complicated-page");
		

	}

	@Test
	public void pageTitle(){

	//driver.findElement(By.xpath("//*[@id=\"main-menu\"]/div/div[2]/div[2]/div/span")).click();
	driver.findElement(By.xpath("(//ul/li[@id=\"menu-item-218392\"]/a)[1]")).click();
	;

	}

	@AfterTest
	public void closeDriver(){

		driver.quit();

	}



}
