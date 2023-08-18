package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_Popup_Firefox {

	public static void main(String[] args) {
	FirefoxProfile profile = new FirefoxProfile();
	profile.setPreference("dom.webnotifications.enable", false);;
	
	FirefoxOptions options = new FirefoxOptions();
	options.setProfile(profile);
	
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.quikr.com/");
	

	}

}
