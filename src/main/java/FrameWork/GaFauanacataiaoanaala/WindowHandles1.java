package FrameWork.GaFauanacataiaoanaala;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowHandles1 {
	@Test
	public void abc() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[minlength='2']")).sendKeys("Juhi");;
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("sinha.juhi@yahoo.com");;
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("12345");;
		driver.findElement(By.cssSelector(".form-check-input")).click();
		driver.findElement(By.cssSelector("#exampleFormControlSelect1")).click();
		WebElement b=driver.findElement(By.cssSelector("#exampleFormControlSelect1"));
		Select a=new Select(b);
		a.selectByIndex(1);
		driver.findElement(By.cssSelector("#inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("02/02/1992");
	//	driver.findElement(By.cssSelector("input[min='1000-01-01']")).click();
		WebElement h=driver.findElement(By.cssSelector(".btn.btn-success"));
		h.click();
		if(h.getText().contains("Success! The Form has been submitted successfully"));
		System.out.println("test pass");
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
	//	driver.close();
}
}
