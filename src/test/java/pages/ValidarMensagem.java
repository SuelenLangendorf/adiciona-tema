package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import conexoes.DriversFactory;
import elementos.Elementos;
import metodos.Metodos;

public class ValidarMensagem extends DriversFactory{
	
	Elementos elementos = new Elementos();
	Metodos metodos = new Metodos();
	
	public void validarMensagem(String mensagemEsperada, By elemento) throws IOException, InterruptedException {
		metodos.pausa(3000);
		metodos.validarTexto(elemento, mensagemEsperada);
		metodos.screenShot("CT01-Adicionar usuario");

	}
	
	

}
