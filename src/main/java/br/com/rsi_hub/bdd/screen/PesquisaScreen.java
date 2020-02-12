package br.com.rsi_hub.bdd.screen;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PesquisaScreen {
	
	public  AndroidDriver<MobileElement> driver;
	private WebDriverWait wait;
	
	public PesquisaScreen(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 20);
	}
	

}
