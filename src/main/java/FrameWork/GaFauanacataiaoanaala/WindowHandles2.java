package FrameWork.GaFauanacataiaoanaala;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowHandles2 {
	@Test
	public void abc() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		//	<a href="/windows">Multiple Windows</a>
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		Set<String>  h=driver.getWindowHandles();
		Iterator<String> it =h.iterator();
		String child=it.next();
		System.out.println(driver.switchTo().window(child).getTitle());
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		String child2=it.next();
		System.out.println(driver.switchTo().window(child2).getTitle());
	//	System.out.println(driver.switchTo().window(child2).getTitle());
	
}
}
