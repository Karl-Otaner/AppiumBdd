package br.com.rsi_hub.bdd.screen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginScreen {
	
	public  AndroidDriver<MobileElement> driver;
	private  WebElement elemento = null;
	
	public LoginScreen(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewDontHaveAnAccount")
	private WebElement botaoLogin;
	
	
	public void botaoLogin() {
		botaoLogin.click();
	}
	
	
}
