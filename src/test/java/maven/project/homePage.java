package maven.project;

import org.apache.log4j.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class homePage {

	private static final Logger log = Logger.getLogger(homePage.class);


	WebDriver driver;
	@BeforeTest
	public void startDriver() {
		log.info("adssssssssssssssssssssssssssssssssssss");
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver-win64/chromedriver.exe");
		 driver= new ChromeDriver();
	//	 driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		log.info("Driver started successfully");
	}

	@Test(priority = 0)
	public void mensTshirts() throws InterruptedException {
		log.info("Page Title"+driver.getTitle());
	//driver.findElement(By.xpath("//*[@id=\"main-menu\"]/div/div[2]/div[2]/div/span")).click();
	driver.findElement(By.xpath("(//div/span[@class=\"_1XjE3T\"])[3]"));
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//div/span[@class=\"_1XjE3T\"])[3]"))).perform();
	driver.findElement(By.xpath("//div/object/a[1][@class=\"_3490ry\"]")).click();
	Thread.sleep(1000);

	}

	@Test(priority = 1)
	public  void Secrch() throws InterruptedException {
		log.info("driver is inside the seacrh test");
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("Watches");
		driver.findElement(By.xpath("//div/button")).click();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods = {"Secrch"})
	public  void OrderClick() throws InterruptedException {
		log.info("driver is inside the order test");
		driver.findElement(By.xpath("(//a[@class=\"IRpwTa _2-ICcC\"])[1]")).click();
		String windows=driver.getWindowHandle();
		log.info(windows);

		Thread.sleep(2000);
	}

	@AfterTest
	public void closeDriver(){

		driver.quit();

	}



}
