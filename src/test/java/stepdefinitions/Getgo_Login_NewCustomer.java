package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.PropertyReader;
import pages.PageLogin;

public class Getgo_Login_NewCustomer
{

    private static PageLogin loginPage = new PageLogin();

    @When("^I enter password \"([^\"]*)\"$")
    public void i_enter_password(String password) throws Throwable
    {
        loginPage.enterPassword(PropertyReader.testDataOf(password));
    }

    @When("^I click login$")
    public void i_click_login() throws Throwable
    {
        loginPage.clickLogin();
    }

    @Then("^I should see my \"([^\"]*)\" account dashboard with my profile picture & my full name$")
    public void i_should_see_my_account_dashboard_with_my_profile_picture_my_full_name(String accountType) throws Throwable
    {
        loginPage.isLoginSuccess(PropertyReader.testDataOf(accountType + "_FullName"),accountType,false);
    }
}
