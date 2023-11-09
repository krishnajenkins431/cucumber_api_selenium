package stepdefinitions;

import com.qa.pages.AddUserFormPage;
import com.qa.pages.AddUserPage;
import com.qa.ui.base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import testcontextsetup.TestContextSetup;
import utils.listener.report.Report;

@Slf4j
public class AddUserTest extends TestBase {

    TestContextSetup testContextSetup;
    AddUserPage addUserPage;
    AddUserFormPage addUserFormPage;

    public AddUserTest(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
    }

    @Given("^User should be navigated to Add User Page$")
    public void user_should_be_navigated_to_add_user_page() {
        Report.log(scenario,"User is on Add User Page");
        Report.screenshot(scenario);
    }
    @When("^User should be click on Add user$")
    public void user_should_be_click_on_add_user() {
        addUserPage = testContextSetup.pageObjectManager.addUserPage();
        addUserPage.clickAdduser();
        Report.log(scenario,"User is on Add User Form");
        Report.screenshot(scenario);
    }
    @And("^User can be able to Add users with the given details as FirstName(.+), LastName(.+), UserName(.+), Password(.+), Role(.+), Email(.+), Cell(.+)$")
    public void user_can_be_able_to_add_users_with_the_given_details(String FirstName, String LastName, String UserName, String Password, String Role, String Email, String Cell) {
        addUserFormPage = testContextSetup.pageObjectManager.addUserFormPage();
        addUserFormPage.fillAllFields(FirstName, LastName, UserName, Password, Role, Email, Cell);
        Report.screenshot(scenario);
    }

    @Then("User should be close the browser")
    public void user_should_be_close_the_browser() {
       driver.close();
    }
}
