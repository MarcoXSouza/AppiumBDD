package br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class CadastroScreen {
	public CadastroScreen(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement nome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement email;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement senha;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement confirmarSenha;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText")
	private WebElement primeiroNome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText")
	private WebElement ultimoNome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement telefone;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewCountries")
	private WebElement pais;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextState']/child::*[1]")
	private WebElement estado;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement endereco;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText")
	private WebElement cidade;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText")
	private WebElement cep;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonRegister")
	private WebElement registra;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private WebElement ValidaCadastro;

	@SuppressWarnings("rawtypes")
	public void scroll(WebDriver driver) {
		TouchAction actions = new TouchAction((PerformsTouchActions) driver);
		actions.press(PointOption.point(1067, 1773)).moveTo(PointOption.point(1059, 332)).release().perform();
	}

	public void getNome(String usuario) {
		nome.click();
		nome.sendKeys(usuario);
	}

	public void getEmail(String eMail) {
		email.click();
		email.sendKeys(eMail);
	}

	public void getSenha(String password) {
		senha.click();
		senha.sendKeys(password);
	}

	public void getConfirmarSenha(String password1) {
		confirmarSenha.click();
		confirmarSenha.sendKeys(password1);
	}

	public void getPrimeiroNome(String usuario1) {
		primeiroNome.click();
		primeiroNome.sendKeys(usuario1);
	}

	public void getUltimoNome(String sobrenome) {
		ultimoNome.click();
		ultimoNome.sendKeys(sobrenome);
	}

	public void getTelefone(String phone) {
		telefone.click();
		telefone.sendKeys(phone);
	}

	public void getPais() {
		pais.click();
	}

	public void escolhePais(AndroidDriver<WebElement> driver) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "Brazil" + "\").instance(0))")
				.click();
	}

	public void getEstado(String esta) {
		estado.click();
		estado.sendKeys(esta);
	}

	public void getEndereco(String address) {
		endereco.click();
		endereco.sendKeys(address);
	}

	public void getCidade(String city) {
		cidade.click();
		cidade.sendKeys(city);
	}

	public void getCep(String CEP) {
		cep.click();
		cep.sendKeys(CEP);
	}

	public void getRegistra() {
		registra.click();
	}

	public String getValidaCadastro() {
		return ValidaCadastro.getText();
	}

}
