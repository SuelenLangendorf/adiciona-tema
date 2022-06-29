package pages;

import elementos.Elementos;
import metodos.Metodos;

public class AdicionarCustomerPage {
	

		
		Metodos metodos = new Metodos();
		Elementos elementos = new Elementos();
		
		public void selecionarTema(String tema) {
			metodos.escrever(elementos.getSwitchtheme(), tema);
			metodos.clicar(elementos.getAddrecord());
		}
		
	}


