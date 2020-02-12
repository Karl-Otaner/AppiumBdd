package br.com.rsi_hub.Gerenciadores;

import br.com.rsi_hub.bdd.provedorDeDados.FileReadConfigs;

public class FileReadConfigsManager {

	private static FileReadConfigs fileReadConfigs;

	private FileReadConfigsManager() {
		fileReadConfigs = new FileReadConfigs();
	}

	public FileReadConfigs getFileReadConfigs() {
		return (fileReadConfigs == null) ? new FileReadConfigs() : fileReadConfigs;
	}
}
