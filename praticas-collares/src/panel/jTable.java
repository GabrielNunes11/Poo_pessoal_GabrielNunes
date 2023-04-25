package panel;

import javax.swing.JFrame;
import javax.swing.JTable;

public class jTable {

	public static void main(String[] args) {
		
		String[] nomeColunas = {
			"Nome", "Sobrenome", "Signo", "Idade", "Programa Java?"	
		};
		Object[][] dados = {
				{"Breno", "Malaquias", "Gêmeos", 43, true},
				{"Jurandir", "Mauricio", "Touro", 30, false},
				{"José", "Maria", "Aries", 89, true},
		};
		
		JTable jTable = new JTable(dados, nomeColunas);
		
		JFrame jFrame = new JFrame();
		jFrame.setSize(455, 300);
		
		jFrame.add(jTable);
		jFrame.setVisible(true);
	}
		
}
