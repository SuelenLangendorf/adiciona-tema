package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By switchtheme = By.id("switch-version-select");

	private By addrecord = By.xpath("//i[@class='el el-plus']");

	private By name = By.name("customerName");

	private By lastname = By.name("contactLastName");

	private By firstname = By.name("contactFirstName");

	private By phone = By.name("phone");

	private By addressline1 = By.name("addressLine1");

	private By adressline2 = By.name("addressLine2");

	private By city = By.name("city");

	private By state = By.name("state");

	private By postalcode = By.name("postalCode");

	private By country = By.name("country");

	private By employeer = By.xpath("//input[@class='numeric form-control']");

	private By creditlimit = By.name("creditLimit");

	private By save = By.id("form-button-save");

	private By validar = By.xpath("//div[@id='report-sucess']/p");

	public By getSwitchtheme() {
		return switchtheme;
	}

	public By getAddrecord() {
		return addrecord;
	}

	public By getName() {
		return name;
	}

	public By getLastname() {
		return lastname;
	}

	public By getFirstname() {
		return firstname;
	}

	public By getPhone() {
		return phone;
	}

	public By getAddressline1() {
		return addressline1;
	}

	public By getAdressline2() {
		return adressline2;
	}

	public By getCity() {
		return city;
	}

	public By getState() {
		return state;
	}

	public By getPostalcode() {
		return postalcode;
	}

	public By getCountry() {
		return country;
	}

	public By getEmployeer() {
		return employeer;
	}

	public By getCreditlimit() {
		return creditlimit;
	}

	public By getSave() {
		return save;
	}

	public By getValidar() {
		return validar;
	}
	
	

}