package steps;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import pages.AdicionarCustomerPage;
import pages.Formulario;
import pages.ValidarMensagem;

public class AdicionarCustomer {

	AdicionarCustomerPage addPage = new AdicionarCustomerPage();
	Formulario form = new Formulario();
	Elementos elementos = new Elementos();
	ValidarMensagem validar = new ValidarMensagem();

	@Dado("que esteja na versao 4")
	public void que_esteja_na_versao_4() {
		addPage.selecionarTema("Bootstrap V4 Theme");
	}

	@Dado("iniciar o cadastro do novo customer")
	public void iniciar_o_cadastro_do_novo_customer() {
		form.preencherDados(elementos.getName(), "Teste Sicredi");
		form.preencherDados(elementos.getLastname(), "Teste");
		form.preencherDados(elementos.getFirstname(), "Suelen Xavier Langendorf");
		form.preencherDados(elementos.getPhone(), "51 9999-9999");
		form.preencherDados(elementos.getAddressline1(), "Av Assis Brasil, 3970");
		form.preencherDados(elementos.getAdressline2(), "Torre D");
		form.preencherDados(elementos.getCity(), "Porto Alegre");
		form.preencherDados(elementos.getState(), "RS");
		form.preencherDados(elementos.getPostalcode(), "91000-000");
		form.preencherDados(elementos.getCountry(), "Brasil");
		form.preencherDados(elementos.getEmployeer(), "Fixter");
		form.preencherDados(elementos.getCreditlimit(), "200");

	}

	@Quando("enviar todos os dados do formulario")
	public void enviar_todos_os_dados_do_formulario() {
		form.salvar();
	}

	@Então("validamos a mensagem de sucesso")
	public void validamos_a_mensagem_de_sucesso() throws IOException, InterruptedException {

		validar.validarMensagem("Your data has been successfully stored into the database. ", elementos.getValidar());
		
	}

}
