package controller;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Exchange implements IExchange {

	@Override
	public void lerArquivo(String path) throws IOException {
		File arquivo = new File (path);
		if (arquivo.exists() ) {
			FileInputStream fluxo = new FileInputStream(arquivo);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			
			while (linha != null) {
				System.out.println(linha);
			    linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		 } 
    }
	 private static void ValueUnit(JSONObject jsonObject, String unit) {
	        if (jsonObject.has("rates")) {
	            JSONObject rates = jsonObject.getJSONObject("rates");

	            if (rates.has(unit)) {
	                double value = rates.getDouble(unit);
	                System.out.println("Valor para a unidade " + unit + ": " + value);
	            } else {
	                System.out.println("Unidade não encontrada: " + unit);
	            }
	        }
	    }
	
}
