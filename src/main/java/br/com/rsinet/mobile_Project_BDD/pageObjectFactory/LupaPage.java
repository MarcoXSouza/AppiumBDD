package br.com.rsinet.mobile_Project_BDD.pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LupaPage {

	public LupaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewSearch")
	private WebElement clicaPesquisa;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
	private WebElement clicaLupa;

	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	private WebElement clicaItem;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewProductName")
	private String validaProduto;

	public void getClicaLupa() {
		clicaLupa.click();
	}

	public void getPesquisaLupa() {
		clicaLupa.sendKeys("HP ELITEPAD 1000 G2 TABLET");
	}

	public void getClicaItem() {
		clicaItem.click();
	}

	public void getClicaPesquisa() {
		clicaPesquisa.click();
	}

	public String getValidaProduto() {
		return validaProduto;
	}

}
