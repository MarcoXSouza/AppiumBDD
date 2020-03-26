package br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CadastroScreen {
	
	/**
	 * @author marcos.souza
	 * Essa classe mapeia e manipula os elementos do aplicativo
	 */

	public CadastroScreen(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement nome;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement email;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement senha;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement confirmarSenha;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText")
	private WebElement primeiroNome;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText")
	private WebElement ultimoNome;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement telefone;

	@FindBy(id = "com.Advantage.aShopping:id/textViewCountries")
	private WebElement pais;

	@FindBy(xpath = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextState']/child::*[1]")
	private WebElement estado;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement endereco;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText")
	private WebElement cidade;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText")
	private WebElement cep;

	@FindBy(id = "com.Advantage.aShopping:id/buttonRegister")
	private WebElement registra;

	@FindBy(id = "com.Advantage.aShopping:id/textViewMenuUser")
	private WebElement ValidaCadastro;

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
