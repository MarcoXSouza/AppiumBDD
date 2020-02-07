package br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BuscaScreen {
	public BuscaScreen(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView")
	private WebElement escolheCategoria;

	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Tablets\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	private WebElement escolheItem;

	public void getEscolheCategoria() {
		escolheCategoria.click();
	}

	public void getEscolheItem() {
		escolheItem.click();
	}

}
