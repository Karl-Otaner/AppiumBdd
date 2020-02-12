package br.com.rsi_hub.Gerenciadores;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AndroidDriverManager {
	
	@SuppressWarnings("rawtypes")
	private AndroidDriver driver;
	
	
	@SuppressWarnings("rawtypes")
	
	public AndroidDriver createDriver() throws Exception {
		
		if(driver ==null) {
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		    desiredCapabilities.setCapability("platformName", "Android");
		    desiredCapabilities.setCapability("deviceName", "emulator-5554");
		    desiredCapabilities.setCapability("automationName", "uiautomator2");
		    desiredCapabilities.setCapability("appPackage", "com.Advantage.aShopping");
		    desiredCapabilities.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");
		    desiredCapabilities.setCapability("unicodeKeyboard", true);
		    desiredCapabilities.setCapability("resetKeyboard", true);


		    
		    driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
		    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
		
		return driver;
	}
		
		public AndroidDriver killDriver() {
			if(driver !=null) {
				driver.quit();
			}
				return driver = null;
		}

}
