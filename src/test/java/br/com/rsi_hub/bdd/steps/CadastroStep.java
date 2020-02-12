package br.com.rsi_hub.bdd.steps;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsi_hub.Gerenciadores.ScreenFactoryManager;
import br.com.rsi_hub.bdd.contexto.TestContext;
import br.com.rsi_hub.bdd.screen.FormularioScreen;
import br.com.rsi_hub.bdd.screen.HomeScreen;
import br.com.rsi_hub.bdd.screen.LoginScreen;
import br.com.rsi_hub.utilitarios.MassaDeDados;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CadastroStep {

	public static AndroidDriver<MobileElement> driver;
	private ScreenFactoryManager manager;
	private FormularioScreen formulario;
	private WebDriverWait wait;
	private MassaDeDados massa;
	private HomeScreen home;
	private LoginScreen login;
	private TestContext contexto;
	
	public CadastroStep(TestContext contexto) {
		this.contexto = contexto;
		formulario = contexto.getFactoryManager().getFormularioScreen();
		home = contexto.getFactoryManager().getHomeScreen();
		login = contexto.getFactoryManager().getLoginScreen();
		massa = new MassaDeDados();

	}
	

	@Dado("^o usuario esta na tela inicial do site advantage online shopping$")
	public void o_usuario_esta_na_pagina_inicial_do_site_advantage_online_shopping() throws Throwable {
		contexto.getAndroidDriverManager().createDriver();
		
	}

	@Quando("o usuari clicar no botao menu$")
	public void o_usuario_clicar_no_botao_menu() throws Throwable {
		home.cliqueMenu();
	}

	@Quando("^clicar em botao de login$")
	public void clicar_em_botao_de_login() throws Throwable {
		home.cliqueLogin();

	}

	@Quando("^clicar em criar conta$")
	public void clicar_em_criar_conta() throws Throwable {
		login.botaoLogin();

	}

	@Quando("^Fazer o cadastro da nova conta$")
	public void fazer_o_cadastro_da_nova_conta() throws Throwable {
		formulario.digiteNome(massa.digiteNome());
		formulario.digiteEmail(massa.digiteEmail());
		formulario.digiteSenha(massa.digiteSenha());
		formulario.confirmarSenha(massa.confirmarSenha());
		formulario.digitePrimeiroNome(massa.digitePrimeiroNome());
		formulario.digiteUltimoNome(massa.digiteUltimoNome());
		formulario.digiteTelefone(massa.digiteTelefone());
		formulario.escolhaPais(massa.escolhaPais());
		formulario.digiteEstado(massa.digiteEstado());
		formulario.digiteEndereco(massa.digiteEndereco());
		formulario.digiteCidade(massa.digiteCidade());
		formulario.digiteCep(massa.digiteCep());
		
		

	}

	@Quando("^clica no botao registro$")
	public void clica_no_botao_registro() throws Throwable {
		formulario.clicarRegistro();
	}

	@Quando("^clica no botao menu$")
	public void clica_no_botao_menu() throws Throwable {
		Thread.sleep(1000);
		home.cliqueMenu();

	}

	@Entao("^validar o retorno a pagina inicial$")
	public void validar_o_retorno_a_pagina_inicial() throws Throwable {
		
		String confirmar = contexto.getAndroidDriverManager().createDriver().findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser")).getText();
		assertTrue(confirmar.contains(massa.digiteNome()));

	}

	@Quando("^Fazer o cadastro ja existente$")
	public void fazer_o_cadastro_ja_existente() throws Throwable {
		formulario.digiteNome(massa.digiteNome());
		formulario.digiteEmail(massa.digiteEmail());
		formulario.digiteSenha(massa.digiteSenha());
		formulario.confirmarSenha(massa.confirmarSenha());
		formulario.digitePrimeiroNome(massa.digitePrimeiroNome());
		formulario.digiteUltimoNome(massa.digiteUltimoNome());
		formulario.digiteTelefone(massa.digiteTelefone());
		formulario.escolhaPais(massa.escolhaPais());
		formulario.digiteEstado(massa.digiteEstado());
		formulario.digiteEndereco(massa.digiteEndereco());
		formulario.digiteCidade(massa.digiteCidade());
		formulario.digiteCep(massa.digiteCep());

	}

	@Quando("^clicar no botao registro$")
	public void clicar_no_botao_registro() throws Throwable {
		formulario.clicarRegistro();

	}

	@Entao("^validar mensagem de usuario ja cadastrado$")
	public void validar_mensagem_de_usuario_ja_cadastrado() throws Throwable {
		
		String msgErro = formulario.mensageErro().getText();
		Assert.assertTrue(msgErro.contains("REGISTER"));
	}

}
