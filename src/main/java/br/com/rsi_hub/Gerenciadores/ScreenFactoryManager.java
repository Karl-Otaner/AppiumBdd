package br.com.rsi_hub.Gerenciadores;

import br.com.rsi_hub.bdd.screen.FormularioScreen;
import br.com.rsi_hub.bdd.screen.HomeScreen;
import br.com.rsi_hub.bdd.screen.LoginScreen;
import br.com.rsi_hub.bdd.screen.ProdutoScreen;
import io.appium.java_client.android.AndroidDriver;

public class ScreenFactoryManager {

	private AndroidDriver driver;
	private FormularioScreen formulario;
	private HomeScreen home;
	private LoginScreen login;
	private ProdutoScreen produto;

	public ScreenFactoryManager(AndroidDriver androidDriver) {
		this.driver = androidDriver;

	}

	public FormularioScreen getFormularioScreen() {
		return (formulario == null) ? formulario = new FormularioScreen(driver) : formulario;
	}

	public HomeScreen getHomeScreen() {
		return (home == null) ? home = new HomeScreen(driver) : home;
	}

	public LoginScreen getLoginScreen() {
		return (login == null) ? login = new LoginScreen(driver) : login;
	}

	public ProdutoScreen getProdutoScreen() {
		return (produto == null) ? produto = new ProdutoScreen(driver) : produto;
	}

}
