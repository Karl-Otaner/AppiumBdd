package br.com.rsi_hub.bdd.contexto;

import br.com.rsi_hub.Gerenciadores.AndroidDriverManager;
import br.com.rsi_hub.Gerenciadores.ScreenFactoryManager;

public class TestContext {

	private AndroidDriverManager androidDriverManager;
	private ScreenFactoryManager screenFactoryManager;
	
	public TestContext() throws Exception {
		androidDriverManager = new AndroidDriverManager();
		screenFactoryManager = new ScreenFactoryManager(androidDriverManager.createDriver());
		
	}
	
	public AndroidDriverManager getAndroidDriverManager() {
		return androidDriverManager;
	}
	
	public ScreenFactoryManager getFactoryManager() {
		return screenFactoryManager;
	}
	
	
}
