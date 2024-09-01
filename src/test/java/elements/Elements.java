package elements;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import maven.project.homePage;

public class Elements extends  homePage{

    private static final Logger log = Logger.getLogger(Elements.class);


    @Test(priority = 0)
      public static void  textbox(){
          driver.findElement(By.id("fullname")).click();
          log.info("clicked on the full name");
          driver.findElement(By.id("fullname")).sendKeys("Sunil Singh Yadav");

        driver.findElement(By.id("email")).click();
        log.info("clicked on the email");
        driver.findElement(By.id("email")).sendKeys("sunil.xyz@gmail.com");

        driver.findElement(By.id("address")).click();
        log.info("clicked on the address");
        driver.findElement(By.id("address")).sendKeys("asd sdaf dsf sd fgsadgsadfghasdfgfsadgsadf");

        driver.findElement(By.id("password")).click();
        log.info("clicked on the password");
        driver.findElement(By.id("password")).sendKeys("abc@123");

        driver.findElement(By.cssSelector("[class=\"btn btn-primary\"]")).click();
        log.info("clicked on the submit");

      }

      @Test(dependsOnMethods = {"textbox"}, priority = 0)
      public void checkBox() throws InterruptedException {

        if(driver.findElement(By.cssSelector("[href=\"check-box.php\"]")).getText().equalsIgnoreCase("Check Box")){
          log.info("method already expanded");

        }

        driver.findElement(By.cssSelector("[class=\"accordion-button\"]")).click();
        log.info("button extended successfully");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[href=\"check-box.php\"]")).click();
        driver.findElement(By.id("c_bs_1")).click();
        driver.findElement(By.xpath("//li[@id=\"bs_2\"]/span[@class=\"plus\"]")).click();
        driver.findElement(By.xpath("//li[@id=\"bf_4\"]/span[@class=\"plus\"]")).click();
        driver.findElement(By.id("c_bf_4")).click();

      }

      @Test(dependsOnMethods = {"checkBox"})
      public void radioButton() throws InterruptedException {

    //    driver.findElement(By.cssSelector("[class=\"accordion-button\"]")).click();
        log.info("button extended successfully");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[href=\"radio-button.php\"]")).click();
        driver.findElement(By.cssSelector("[class=\"form-check-input\"][value=\"igottwo\"]")).click();
        Thread.sleep(200);
        log.info(driver.findElement(By.xpath("//div[@id=\"check\"]/b")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id=\"check\"]/b")).getText(), "Yes");

        driver.findElement(By.cssSelector("[class=\"form-check-input\"][onclick=\"show3();\"]")).click();
        Thread.sleep(200);
        log.info(driver.findElement(By.xpath("//div[@id=\"check1\"]/b")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id=\"check1\"]/b")).getText(), "Impressive");

      }








}
