package metodos;

import static org.junit.Assert.assertTrue;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import conexoes.DriversFactory;

public class Metodos extends DriversFactory {

	/**
	 * Metodo para digitar um texto no elemento passando o By
	 * 
	 * @param elemento
	 * @param texto
	 */
	public void escrever(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);
	}

	/**
	 * Metodo para clicar em um elemento passando um By
	 * 
	 * @param elemento
	 */

	public void clicar(By elemento) {

		driver.findElement(elemento).click();
	}

	/**
	 * Metodo para clicar em um elemento passando um WebElement
	 * @param elemento
	 */
	public void clicar(WebElement elemento) {
		elemento.click();

	}

	/**
	 * Valida se o texto capturado contém o texto esperado passando um By
	 * 
	 * @param elemento
	 * @param textoEsperado
	 */
	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(textoEsperado));
	}

	/**
	 * Tirar uma evidência do teste executado
	 * 
	 * @param nomeEvidencia
	 * @throws IOException
	 */
	public void screenShot(String nomeEvidencia) throws IOException {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
		FileUtils.copyFile(scrFile, destFile);
	}
	/**
	 * Pausar aplicação pelo tempo determinado em milisegundos
	 * @param tempo
	 * @throws InterruptedException
	 */
	public void pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}
}
