package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_MultiSelect_Skillray {

	public static void main(String[] args) throws Throwable {
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Entering the URL
		driver.get("https://demoapp.skillrary.com/");
		
		// maximize the screen
		driver.manage().window().maximize();
		
		WebElement Dropdown = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s = new Select(Dropdown);
		s.selectByIndex(0);
		
		Thread.sleep(2000);
		s.selectByValue("99");
		
		Thread.sleep(2000);
		s.selectByVisibleText("INR 100 - INR 199 ( 16 )");
		
		//s.deselectAll();
		s.deselectByIndex(0);
		s.deselectByValue("99");
		s.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
		
		List<WebElement> ele = s.getAllSelectedOptions();
		for(WebElement ele1:ele)
		{
			System.out.println(ele1.getText());
		}		
	}
}