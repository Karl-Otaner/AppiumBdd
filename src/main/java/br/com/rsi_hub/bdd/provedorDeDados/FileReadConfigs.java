package br.com.rsi_hub.bdd.provedorDeDados;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileReadConfigs {
	private Properties properties;
	private final String propertyFilePath = "configs/Configuration.properties";
	
	public FileReadConfigs() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configs.properties nao encontrado em " + propertyFilePath);
		}
	}
		public long getImplicitlyWait() {
			String implicitlyWait = properties.getProperty("implicitlyWait");
			if (implicitlyWait != null) {
				try {
					return Long.parseLong(implicitlyWait);
				} catch (NumberFormatException e) {
					throw new RuntimeException("incapaz de analisar o valor: " + implicitlyWait + " em formato Long.");
				}
			}
			return 15;
		}
		public String getCapability_nomeDoAparelho() {
			String nomeDoAparelho = properties.getProperty("nomeDoAparelho");
			if (nomeDoAparelho != null)
				return nomeDoAparelho;
			else
				throw new RuntimeException("nomeDoAparelho nao especificado no arquivo Configuracoes.properties.");
		}
		
		public String getCapability_versaoDaPlataforma() {
			String versaoDaPlataforma = properties.getProperty("versaoDaPlataforma");
			if (versaoDaPlataforma != null)
				return versaoDaPlataforma;
			else
				throw new RuntimeException("versaoDaPlataforma nao especificado no arquivo Configuracoes.properties.");
		}
		public String getCapability_nomeDaPlataforma() {
			String nomeDaPlataforma = properties.getProperty("nomeDaPlataforma");
			if (nomeDaPlataforma != null)
				return nomeDaPlataforma;
			else
				throw new RuntimeException("nomeDaPlataforma nao especificado no arquivo Configuracoes.properties.");
		}
		public String getCapability_capsPacoteDoApp() {
			String capsPacoteDoApp = properties.getProperty("capsPacoteDoApp");
			if (capsPacoteDoApp != null)
				return capsPacoteDoApp;
			else
				throw new RuntimeException("capsPacoteDoApp nao especificado no arquivo Configuracoes.properties.");
		}
		
		public String getCapability_capsAtividadeDoApp() {
			String capsAtividadeDoApp = properties.getProperty("capsAtividadeDoApp");
			if (capsAtividadeDoApp != null)
				return capsAtividadeDoApp;
			else
				throw new RuntimeException("capsAtividadeDoApp nao especificado no arquivo Configuracoes.properties.");
		}

		public String getCapability_capsComandoDeEspera() {
			String capsComandoDeEspera = properties.getProperty("capsComandoDeEspera");
			if (capsComandoDeEspera != null)
				return capsComandoDeEspera;
			else
				throw new RuntimeException("capsComandoDeEspera nao especificado no arquivo Configuracoes.properties.");
		}
		
		public String getCapability_servidor() {
			String servidor = properties.getProperty("servidor");
			if (servidor != null)
				return servidor;
			else
				throw new RuntimeException("servidor nao especificado no arquivo Configuracoes.properties.");
		}

		public String getcaminhoDasConfigsDoReport() {
			String caminhoDasConfigsDoReport = properties.getProperty("caminhoDasConfigsDoReport");
			if (caminhoDasConfigsDoReport != null)
				return caminhoDasConfigsDoReport;
			else
				throw new RuntimeException(
						"caminhoDasConfigsDoReport nao especificado no arquivo Configuracao.properties pela chave: caminhoDaConfigDoReport");
		}
		

}
