package stepDefinition;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClasses.RediffPage;
import utility.Base;

@SuppressWarnings("unused")
public class RediffAccntPage {
	
	private Base base;
	RediffPage rediffPage;
	
	public RediffAccntPage(Base base) {
		this.base = base;
		rediffPage = PageFactory.initElements(base.driver, RediffPage.class);
	}
	
	@Given("I navigate to {string} Page")
	public void setURL(String url) {
		base.driver.get(url);
	}
	
	@When("I click on signIn")
	public void signIn() {
		rediffPage.signIn();
	}
	
	@And("Click on create a new account")
	public void createAccount() {
		rediffPage.createAccount();
	}

	@Then("Fill all the details in the page")
	public void enterDetails() {
		rediffPage.enterDetails();
//		Assert.assertTrue(false);
	}

}
