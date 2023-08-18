package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_SingleSelect_Amazon 
{
	public static void main(String[] args) throws Throwable
	{
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Entering the URL
		driver.get("https://www.amazon.in/ ");
		
		// maximize the screen
		driver.manage().window().maximize();
		
		WebElement Dropdown = driver.findElement(By.xpath("//select [@id='searchDropdownBox']"));
		
		Select s = new Select(Dropdown);
		s.selectByIndex(8);
		
		Thread.sleep(2000);
		
		s.selectByValue("search-alias=alexa-skills");
		
		Thread.sleep(2000);
		
		s.selectByVisibleText("Alexa Skills");
		
		Thread.sleep(2000);
		System.out.println(s.isMultiple());
		
		List<WebElement> values = s.getOptions();
		
		for(WebElement b:values)
		{
			System.out.println(b.getText());
		}
	}
}
