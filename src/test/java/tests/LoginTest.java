package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
@Given("^enter the url$")
	public void entertheurl() {
	System.out.println("---enter the url---");	
	}
	@When("^enter username$")
public void enterusername() {
	System.out.println("---enter username---");	
	}
	@And("^enter password$")
public void enterpassword() {
	System.out.println("---enter password---");	
	}
	@When("^click login button$")
public void clickloginbutton() {
	System.out.println("---click login button---");	
	}
	@Then("^verify the welcome page$")
public void verifythewelcomepage() {
	System.out.println("---verify the welcome page---");	
	}
	@But("^dont click remember password$")
public void dontclickrememberpassword() {
	System.out.println("---dont click remember password---");	
	}
	
	
}





