package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {
	
	@Given("^User must be on the netbanking login page$")
    public void user_must_be_on_the_netbanking_login_page() throws Throwable {
        System.out.println("Running Given");
    }

    @When("^User login to the application with username and password$")
    public void user_login_to_the_application_with_username_and_password() throws Throwable {
    	System.out.println("Running When");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Running then");
    }

    @And("^Cards displays \"([^\"]*)\"$")
    public void cards_displays_something(String arg) throws Throwable {
        System.out.println("Running And");
        if(arg.equalsIgnoreCase("true"))
        {
        	System.out.println("Scenario 1 is running");
        }
        else
        {
        	System.out.println("Scenario 2 is running");
        }
    }

    @When("^User login to the application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_to_the_application_with_and(String arg1, String arg2) throws Throwable {
    System.out.println("Running RE When");
    System.out.println(arg1);
    System.out.println(arg2);
    }

}
