package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest {
	
	@Test
	public void LaunchBrowser() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.LINUX);
		cap.setBrowserName("chrome");
		
		URL url = new URL("http://172.17.0.1:4444/wd/hub");
		
		//WebDriver driver1 = new ChromeDriver();
		WebDriver driver = new RemoteWebDriver(url, cap);
		
		driver.get("https://www.simplilearn.com/");
		
		driver.quit();
		
	}

}
