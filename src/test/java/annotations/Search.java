package annotations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Ganna Alieksieienko on 03/03/2018.
 */
public class SearchForEnergy {
    @Given("I am on main page")
    public void openMainpage() {
        open("https://www.stibosystems.com/");
    }
    @When("I search for energy")
    public void searchForEnergy(){
        $(".search").click();
        $("#search-input").sendKeys("Energy");
    }
    @Then("12 results found")
    public void verifyNumberOfSerchResults() {
        $(".ais-stats--body").find("div").shouldHave(text("12"));
    }
}
