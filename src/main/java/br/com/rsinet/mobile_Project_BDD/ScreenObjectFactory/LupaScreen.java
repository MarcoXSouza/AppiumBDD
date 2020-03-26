package br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LupaScreen {

	/**
	 * @author marcos.souza
	 * Essa classe mapeia e manipula os elementos do aplicativo
	 */

	public LupaScreen(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "com.Advantage.aShopping:id/imageViewSearch")
	private WebElement clicaPesquisa;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
	private WebElement clicaLupa;

	@FindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	private WebElement clicaItem;

	@FindBy(id = "com.Advantage.aShopping:id/textViewProductName")
	private WebElement validaProduto;

	@FindBy(id = "com.Advantage.aShopping:id/textViewNoProductsToShow")
	private WebElement produtoInexistente;

	public void getClicaLupa() {
		clicaLupa.click();
	}

	public void getPesquisaLupa(String produto) {
		clicaLupa.sendKeys(produto);
	}

	public void getClicaItem() {
		clicaItem.click();
	}

	public void getClicaPesquisa() {
		clicaPesquisa.click();
	}

	public String getValidaProduto() {
		return validaProduto.getText();
	}

	public String getProdutoInexistente() {
		return produtoInexistente.getText();
	}

}
