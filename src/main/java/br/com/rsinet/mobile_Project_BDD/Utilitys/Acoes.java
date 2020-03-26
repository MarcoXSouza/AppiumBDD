package br.com.rsinet.mobile_Project_BDD.Utilitys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Acoes {
	public Acoes(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
	}

	private AndroidDriver<WebElement> driver = DriverFactory.driver;

	@SuppressWarnings("rawtypes")
	public void scroll() {
		TouchAction actions = new TouchAction((PerformsTouchActions) driver);
		actions.press(PointOption.point(1067, 1773)).moveTo(PointOption.point(1059, 332)).release().perform();
	}

	public void selecionaPorNome(String nome) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ nome + "\").instance(0))")
				.click();
	}

}
