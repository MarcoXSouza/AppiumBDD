package br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LogInScreen {
	
	/**
	 * @author marcos.souza
	 * Essa classe mapeia e manipula os elementos do aplicativo
	 */

	public LogInScreen(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "com.Advantage.aShopping:id/imageViewMenu")
	private WebElement clicaOpcoes;

	@FindBy(id = "com.Advantage.aShopping:id/linearLayoutLogin")
	private WebElement clicaLogIn;

	@FindBy(id = "com.Advantage.aShopping:id/textViewSingUpToday")
	private WebElement clicaNovaConta;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText")
	private WebElement userName;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText")
	private WebElement password;

	@FindBy(id = "com.Advantage.aShopping:id/buttonLogin")
	private WebElement fazLogIn;

	public void getClicaOpcoes() {
		clicaOpcoes.click();
	}

	public void getClicaLogIn() {
		clicaLogIn.click();
	}

	public void getClicaNovaConta() {
		clicaNovaConta.click();
	}

	public void getUserName() {
		userName.sendKeys("martos");
	}

	public void getPassword() {
		password.sendKeys("aBc123");
	}

	public void getFazLogIn() {
		fazLogIn.click();
	}

}
