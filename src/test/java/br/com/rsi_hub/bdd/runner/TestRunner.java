package br.com.rsi_hub.bdd.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "Feature",
		glue = {"br.com.rsi_hub.bdd.steps"},
//		tags = {"@SucessoProudutoTelaApp, @FalhaAquicaoDeProduto"},
		monochrome = true,
		plugin = { "pretty", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
		snippets = SnippetType.CAMELCASE
		
)



public class TestRunner {

}
