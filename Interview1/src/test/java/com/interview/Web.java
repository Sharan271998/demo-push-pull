package com.interview;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Web extends SupportClass {
	static WebDriver driver;

	@BeforeClass
	public static void intialSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
	}

	@Test
	//public void login() {

		//driver.findElement(By.xpath("//a[text()='Sign up' ]")).click();
	//}

	public void execute() throws IOException, InterruptedException {

		// driver.findElement(By.xpath("//a[text()='Sign up' ]")).click();
		//Thread.sleep(500);
		// driver.findElement(By.id("sign-username")).sendKeys("deepak");
		WebElement element = driver.findElement(By.id("cat"));
		String text = element.getText();
		System.out.println(text);
		try {
			WriteCell(text);
		} catch (InvalidFormatException e) {
			System.out.println("handled");
		} catch (IOException e) {
			e.printStackTrace();
		}
		Thread.sleep(500);
		System.out.println("added sucessflly");

	}

	@After
	public void screenSchot() throws IOException {
		// JavascriptExecutor js= (JavascriptExecutor)driver ;
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File file1 = new File("D:\\software\\java\\New folder\\Interview1\\screenshot\\s1.png");
		FileUtils.copyFile(screenshotAs, file1);
	}

	@AfterClass
	public static void quit() {
		driver.close();
	}

}
