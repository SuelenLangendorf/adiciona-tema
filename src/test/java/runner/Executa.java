package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import conexoes.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "steps", tags = "@regressivo", dryRun = false, monochrome = true, plugin = {
		"pretty", "html:target/report.html" }, snippets = SnippetType.CAMELCASE)

public class Executa extends DriversFactory {

	@BeforeClass
	public static void iniciarTeste() {
		String url = "https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap";

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		// driver.manage().timeouts().getPageLoadTimeout();
		System.out.println("----------------- TESTE INICIADO -------------------");

	}
	@AfterClass
	public static void finalizarTeste() {
		driver.quit();
		System.out.println("----------------- TESTE FINALIZADO -------------------");
	}

}
