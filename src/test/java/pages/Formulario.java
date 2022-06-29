package pages;

import org.openqa.selenium.By;

import elementos.Elementos;
import metodos.Metodos;

public class Formulario {

	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();

	public void preencherDados(By elemento, String dados) {

		metodos.escrever(elemento, dados);

	}

	public void salvar() {
		metodos.clicar(elementos.getSave());

	}

	

}
