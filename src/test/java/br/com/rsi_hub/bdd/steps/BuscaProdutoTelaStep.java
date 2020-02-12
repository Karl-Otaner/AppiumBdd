package br.com.rsi_hub.bdd.steps;

import static org.junit.Assert.assertTrue;

import br.com.rsi_hub.bdd.contexto.TestContext;
import br.com.rsi_hub.bdd.screen.HomeScreen;
import br.com.rsi_hub.bdd.screen.ProdutoScreen;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class BuscaProdutoTelaStep {

	private TestContext contexto;
	private HomeScreen home;
	private ProdutoScreen produto;

	public BuscaProdutoTelaStep(TestContext contexto) {
		this.contexto = contexto;
		home = contexto.getFactoryManager().getHomeScreen();
		produto = contexto.getFactoryManager().getProdutoScreen();
	}

	@Dado("^Usuario esta na tela principal do App$")
	public void usuario_esta_na_tela_principal_do_App() throws Throwable {
		contexto.getAndroidDriverManager().createDriver();

	}

	@Quando("^escolha o table pela tela do App$")
	public void escolhaOTablePelaTelaDoApp() throws Throwable {
		home.clicaTable();

	}

	@Quando("^clicar no table escolhido$")
	public void clicarNoTableEscolhido() throws Throwable {
		produto.escolherTablet();

	}

	@Quando("^vai para a tela do table$")
	public void vaiParaATelaDoTable() throws Throwable {
		produto.produtoEscolhido("HP PRO TABLET 608 G1");

	}

	@Entao("^valide o produto escolhido$")
	public void valide_o_produto_escolhido() throws Throwable {
		assertTrue(contexto.getAndroidDriverManager().createDriver().getPageSource()
				.contains("HP PRO TABLET 608 G1"));

	}

	@Quando("^escolher o headphone pela imagem da tela principal do app$")
	public void escolher_o_headphone_pela_imagem_da_tela_principal_do_app() throws Throwable {
		home.escolherHead();

	}

	@Quando("^clicar no headphone escolhido$")
	public void clicar_no_headphone_escolhido() throws Throwable {
		produto.ProdutoSemSaldo();

	}

	@Entao("^valide que nao tem saldo$")
	public void valide_que_nao_tem_saldo() throws Throwable {
		assertTrue(produto.produtoEsgotado().contains("SOLD OUT"));

	}

}
