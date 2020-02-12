package br.com.rsi_hub.bdd.steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsi_hub.bdd.contexto.TestContext;
import br.com.rsi_hub.bdd.screen.HomeScreen;
import br.com.rsi_hub.bdd.screen.ProdutoScreen;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class BuscaLupaStep {
	
	private TestContext contexto;
	private HomeScreen home;
	private ProdutoScreen produto;
	
	
	
	public BuscaLupaStep(TestContext contexto) {
		this.contexto = contexto;
		home = contexto.getFactoryManager().getHomeScreen();
		produto = contexto.getFactoryManager().getProdutoScreen();
		
	}

	@Dado("^O usuario esta na tela inicial do App$")
	public void oUsuarioEstaNaTelaInicialDoApp() throws Throwable {
		contexto.getAndroidDriverManager().createDriver();

	}

	@Quando("^ele clica na tela barra de pesquisa$")
	public void eleClicaNaTelaBarraDePesquisa() throws Throwable {
		home.clicaSearch();

	}

	@Quando("^digita o nome do produto valido$")
	public void digitaONomeDoProdutoValido() throws Throwable {
		home.digiteProduto("laptops");
		home.clicaLupa();

	}

	@Quando("^sera direcionado para a tela do produto$")
	public void seraDirecionadoParaATelaDoProduto() throws Throwable {
		produto.produtoEscolhido("HP STREAM - 11-D020NR LAPTOP");
		
	}

	@Entao("^validara o produto escolhido$")
	public void validara_o_produto_escolhido() throws Throwable {
		assertTrue(contexto.getAndroidDriverManager().createDriver().getPageSource()
				.contains("HP STREAM - 11-D020NR LAPTOP"));


	}
	
	@Quando("^digita o nome do produto$")
	public void digitaONomeDoProduto() throws Throwable {
		home.clicaSearch();
		home.produtoInexistente("carro");
		home.clicaLupa();
		
	}

	@Entao("^valida a mensagem que o produto nao existe$")
	public void validaAMensagemQueOProdutoNaoExiste() throws Throwable {
		System.out.println(produto.textoBusca());
		assertTrue(produto.textoBusca().contains("No results for"));
		
	}
	
	
}
