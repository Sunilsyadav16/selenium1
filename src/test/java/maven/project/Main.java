package maven.project;

import jdk.internal.org.jline.terminal.TerminalBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
		
		Thread.sleep(2000);
		
		driver.close();

	}

	@Test
	public void pageTitle(){

	//	String pageTitle=driver.getCurrentUrl();
		//System.out.println(pageTitle);

		driver.findElement(By.xpath("//a[@class=\"et_pb_button et_pb_button_0 et_pb_bg_layout_light\"]")).click();
		String textValue=driver.findElement(By.id("Skills_Improved")).getText();
	//	System.out.println(textValue);

	}


}
