package br.com.rsi_hub.Gerenciadores;

import br.com.rsi_hub.bdd.provedorDeDados.FileReadConfigs;

public class FileReadConfigsManager {
	
	private static FileReadConfigsManager fileReadConfigsManager = new FileReadConfigsManager();
	private static FileReadConfigs fileReadConfigs;

	private FileReadConfigsManager() {
		fileReadConfigs = new FileReadConfigs();
	}
	
	private static FileReadConfigsManager getInstancia() {
		return fileReadConfigsManager;
	}
	
	public FileReadConfigs getFileReadConfigs() {
		return (fileReadConfigs == null)? new FileReadConfigs() : fileReadConfigs;
	}
}
