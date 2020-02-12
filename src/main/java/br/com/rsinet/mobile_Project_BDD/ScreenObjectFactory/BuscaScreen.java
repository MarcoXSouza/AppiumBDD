package br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class BuscaScreen {
	public BuscaScreen(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView")
	private WebElement escolheCategoria;

	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Tablets\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	private WebElement escolheItem;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewProductQuantity")
	private WebElement quantidade;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
	private WebElement adcQuantidade;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewApply")
	private WebElement aplicar;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonProductAddToCart")
	private WebElement adcAoCarrinho;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewCartLength")
	private WebElement confereCarrinho;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewProductName")
	private WebElement verificaItem;

	public void getEscolheCategoria() {
		escolheCategoria.click();
	}

	public void getEscolheItem() {
		escolheItem.click();
	}

	public void getQuantidade() {
		quantidade.click();
	}

	public void getAdcQuantidade() {
		adcQuantidade.click();
		adcQuantidade.sendKeys("20");
	}

	public void getAplicar() {
		aplicar.click();
	}

	public void getAdcAoCarrinho() {
		adcAoCarrinho.click();
	}

	public String getVerificaItem() {
		return verificaItem.getText();
	}

	public String getConfereCarrinho() {
		return confereCarrinho.getText();
	}

}
