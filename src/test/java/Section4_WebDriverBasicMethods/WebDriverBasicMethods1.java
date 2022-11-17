package Section4_WebDriverBasicMethods;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasicMethods1 {

	public static void main(String[] args) {			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\GP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();								
	        		driver.get("https://www.google.com/");
	        		driver.manage().window().maximize();
					System.out.println(driver.getTitle());
					System.out.println(driver.getCurrentUrl());
					driver.navigate().to("https://www.yahoo.com/");
					driver.navigate().back();
					driver.navigate().forward();
					driver.manage().window().minimize();
					driver.close();
	}

}
