package view;

import java.io.IOException;
import javax.swing.JOptionPane;

import controller.Exchange;
import controller.IExchange;

public class Principal {

	public static void main(String[] args) {
		
        String unit = JOptionPane.showInputDialog("Digite a unidade: ");
		
		String path = "C:\\TEMP\\exchange.json";
		IExchange ex = new Exchange();
		

		try {
			ex.lerArquivo(path);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}

	}

}
