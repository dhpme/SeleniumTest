package com.mycompany.app.addressbook_selenium_ide;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
    public static void main( String[] args )
    {
		System.setProperty("webdriver.chrome.driver","/home/ubuntu/selenium/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		System.out.println ("Welcome to the demo for Selenium.");
		
		driver.get("http://15.207.71.62:8889/");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		 driver.findElement(By.className("v-button")).click();
		 driver.findElement(By.id("gwt-uid-5")).sendKeys("Dhpme4edurekaJenkins");
		 driver.findElement(By.id("gwt-uid-7")).sendKeys("DevOpsJenkins");
		 driver.findElement(By.id("gwt-uid-9")).sendKeys("9834562709");
		 driver.findElement(By.id("gwt-uid-11")).sendKeys("Dhpme4edureka@edureka.co");
		 driver.findElement(By.id("gwt-uid-13")).sendKeys("2/10/21");
		 driver.findElement(By.className("v-button-primary")).click();
		 //Thread.sleep(5000);
		 //driver.quit();
		 
    }
}
