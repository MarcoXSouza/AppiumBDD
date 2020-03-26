package br.com.rsinet.mobile_Project_BDD.TestSteps;

import java.net.MalformedURLException;

import org.junit.Assert;

import br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory.LupaScreen;
import br.com.rsinet.mobile_Project_BDD.Utilitys.TestContext;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LupaSteps {
	private LupaScreen lupa;
	private TestContext testContext;

	public LupaSteps(TestContext context) throws MalformedURLException {
		testContext = context;
		lupa = testContext.getScreenFactory().getLupaScreen();
	}

	@Dado("^que cliquei na lupa$")
	public void que_cliquei_na_lupa() throws MalformedURLException {
		lupa.getClicaLupa();
	}

	@Quando("^pesquisei o produto \"([^\"]*)\"$")
	public void pesquisei_o_produto(String produto) {
		lupa.getPesquisaLupa(produto);
		lupa.getClicaPesquisa();
	}

	@Entao("^o produto sera validado \"([^\"]*)\"$")
	public void o_produto_sera_validado(String produto) throws Exception {
		lupa.getClicaItem();
		Assert.assertTrue(lupa.getValidaProduto().equals(produto));
	}

	@Entao("^o produto nao sera encontrado \"([^\"]*)\"$")
	public void o_produto_nao_sera_encontrado(String produto) throws Exception {
//		Assert.assertFalse(lupa.getProdutoInexistente().equals(produto));
	}

}
