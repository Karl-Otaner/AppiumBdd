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
	private WebElement ProdutoInvalido;

	@FindBy(how = How.XPATH, using = "//*[@text='SOLD OUT']")
	private WebElement semSaldo;

	

	public void produtoEscolhido(String produto) throws InterruptedException {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ produto + "\").instance(0))").click();;
	}

	

	
	public void escolherTablet() {
		wait.until(ExpectedConditions.visibilityOf(escolherTablet)).click();
	}

	public void ProdutoInvalido() {
		wait.until(ExpectedConditions.visibilityOf(ProdutoInvalido)).click();
		
	}

}
