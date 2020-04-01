package br.com.rsi_hub.bdd.screen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class HomeScreen {
	
	AndroidDriver driver;
	private WebDriverWait wait;
	
	public HomeScreen(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 20);
	}
	
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private WebElement cliqueMenu;
	
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private WebElement cliqueLogin;
	
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/editTextSearch")
	private WebElement clicaSearch;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewSearch")
	private WebElement clicaLupa;
	
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.ImageView")
	private WebElement clicaTablet;
	

	@FindBy(how = How.XPATH, using = "//*[@text='HEADPHONES']")
	private WebElement escolherHead;
	

	
	public void cliqueMenu() {
		cliqueMenu.click();
		
	}
	
	public void cliqueLogin() {
		cliqueLogin.click();
		
	}
	
	public void clicaSearch() {
		clicaSearch.click();
		
	}
	
	public void digiteProduto(String produto) {
		clicaSearch.sendKeys(produto);
	}
	
	public void clicaLupa() {
		clicaLupa.click();
	}

	public void produtoInexistente(String produto) {
		clicaSearch.click();
		clicaSearch.sendKeys(produto);
	}
	
	
	public void clicaTable() {
		wait.until(ExpectedConditions.visibilityOf(clicaTablet)).click();

	}
	
	public void escolherHead() {
		wait.until(ExpectedConditions.visibilityOf(escolherHead)).click();
	}

}
