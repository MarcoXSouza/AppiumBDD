package br.com.rsinet.mobile_Project_BDD.Utilitys;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {

	private static WebDriver driver;

	@SuppressWarnings("rawtypes")
	public static WebDriver iniciaDriver(WebDriver driver) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, "");
		cap.setCapability("deviceName", "AOSP on IA Emulator");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("unicodeKeyboard", true);
		cap.setCapability("resetKeyBoard", true);
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appPackage", "com.Advantage.aShopping");
		cap.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		return driver;
	}

	public static void fechaDriver() {

		driver.quit();
	}
}