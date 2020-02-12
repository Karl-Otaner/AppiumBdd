package br.com.rsi_hub.bdd.screen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ProdutoScreen {

	public AndroidDriver<MobileElement> driver;
	private WebDriverWait wait;

	public ProdutoScreen(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 20);

	}

	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Tablets\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]/android.widget.ImageView")
	private WebElement escolherTablet;

	@FindBy(how = How.XPATH, using = "//*[@text='BOSE SOUNDLINK AROUND-EAR WIRELESS HEADPHONES II']")
	private WebElement ProdutoSemSaldo;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewNoProductsToShow")
	private WebElement textoBusca;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewProductOutOfStock")
	private WebElement produtoEsgotado;

	public void produtoEscolhido(String produto) throws InterruptedException {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ produto + "\").instance(0))")
				.click();
	}

	public void escolherTablet() {
		wait.until(ExpectedConditions.visibilityOf(escolherTablet)).click();
	}

	public void ProdutoSemSaldo() {
		wait.until(ExpectedConditions.visibilityOf(ProdutoSemSaldo)).click();

	}

	public String textoBusca() {
		return textoBusca.getText();
	}

	public String produtoEsgotado() {
		return produtoEsgotado.getText();
	}
}
