package br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LupaScreen {

	@SuppressWarnings("unused")
	private WebDriver driver;

	public LupaScreen(AndroidDriver<WebElement> driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewSearch")
	private WebElement clicaPesquisa;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
	private WebElement clicaLupa;

	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	private WebElement clicaItem;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewProductName")
	private WebElement validaProduto;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewNoProductsToShow")
	private WebElement produtoInexistente;

	public void getClicaLupa() {
		clicaLupa.click();
	}

	public void getPesquisaLupaValido() {
		clicaLupa.sendKeys("HP ELITEPAD 1000 G2 TABLET");
	}
	
	public void getPesquisaLupaInvalido() {
		clicaLupa.sendKeys("Agua");
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
