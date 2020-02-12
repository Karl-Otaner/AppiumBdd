package br.com.rsi_hub.bdd.contexto;

import java.util.HashMap;
import java.util.Map;

import br.com.rsi_hub.bdd.enums.Contexto;

public class ScenarioContext {

	private Map<String, Object> scenarioContext;
	
	
	public ScenarioContext() {
		scenarioContext = new HashMap<>();
	}
	
	public void setContexto(Contexto Key, Object value) {
		scenarioContext.put(Key.toString(), value);
	}
	
	public Object getContexto(Contexto Key) {
		return scenarioContext.get(Key.toString());
	}
	
	public Boolean isContains(Contexto Key) {
		return scenarioContext.containsKey(Key.toString());
	}
	
	
}
