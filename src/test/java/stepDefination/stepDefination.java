package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Then;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;

@RunWith(Cucumber.class)
public class stepDefination {
	
	@Given("^User must be on the netbanking login page$")
    public void user_must_be_on_the_netbanking_login_page() throws Throwable {
        System.out.println("I am inside Given");
    }

    @When("^User login to the application with username and password$")
    public void user_login_to_the_application_with_username_and_password() throws Throwable {
    	System.out.println("I am inside When");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("I am inside then");
    }

    @And("^Cards displays \"([^\"]*)\"$")
    public void cards_displays_something(String arg) throws Throwable {
        System.out.println("I am inside And");
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
    System.out.println("I am inside RE When");
    System.out.println(arg1);
    System.out.println(arg2);
    }

}
