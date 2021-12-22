package Steps;

import org.openqa.selenium.By;

import Pages.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SiCredi {
	
	Metodos metodo = new Metodos();
	
	
	@Given("que esteja no site {string}")
	public void que_esteja_no_site(String site) {

		metodo.abrirNavegador(site);
		
	}

	@Given("altere o combo select version")
	public void altere_o_combo_select_version() {
		
		metodo.clicar(By.id("switch-version-select"));
	metodo.clicar(By.xpath("//*[@id=\"switch-version-select\"]/option[4]"));	
	}

	@When("clico em Add costumer")
	public void clico_em_add_costumer() {
		
		metodo.clicar(By.xpath("//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a"));
	}

	@When("preencho name {string}")
	public void preencho_name (String name) {
		
		metodo.escrever(By.id("field-customerName"), name);
	}

	@When("preencho Last name {string}")
	public void preencho_last_name(String lastName) {
		metodo.escrever(By.id("field-contactLastName"), lastName);
	}

	@When("preencho ContacFirstName {string}")
	public void preencho_contac_first_name(String firstName) {
		metodo.escrever(By.id("field-contactFirstName"), firstName);
	}

	@When("preencho Phone {string}")
	public void preencho_phone(String phone) {
		
		metodo.escrever(By.id("field-phone"), phone);
	}

	@When("preencho AddressLine1 {string}")
	public void preencho_address_line1(String line1) {
		metodo.escrever(By.id("field-addressLine1"), line1);
	}

	@When("preencho AddressLine2 {string}")
	public void preencho_address_line2(String line2) {
		
		metodo.escrever(By.id("field-addressLine2"), line2);
	}

	@When("preencho City {string}")
	public void preencho_city(String city) {
		
		metodo.escrever(By.id("field-city"), city);
		
	}

	@When("preencho State {string}")
	public void preencho_state(String state) {
		
		metodo.escrever(By.id("field-state"), state);
	}

	
	@When("preencho Postal Code {string}")
	public void preencho_postal_code(String cep) {
		
		metodo.escrever(By.id("field-postalCode"), cep);
	}

	@When("preencho Country {string}")
	public void preencho_country(String pais) {
		
		metodo.escrever(By.id("field-country"), pais);
	}

	@When("preencho from employeer {string}")
	public void preencho_from_employeer(String employeer) {
		
		metodo.escrever(By.id("field-salesRepEmployeeNumber"), employeer);;
	}

	@When("preencho CreditLimit {string}")
	public void preencho_credit_limit(String credito) {
		
		metodo.escrever(By.id("field-creditLimit"), credito);
		
	}

	@When("Clico em Save")
	public void clico_em_save() {
		
		metodo.clicar(By.id("form-button-save"));
	}

	@Then("Validamos a mensagem {string}")
	public void validamos_a_mensagem(String string) {
	
		metodo.fechar();
		
	}
	
	
}
