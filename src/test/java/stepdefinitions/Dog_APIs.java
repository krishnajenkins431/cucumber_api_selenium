package stepdefinitions;

import com.qa.ui.base.TestBase;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import testcontextsetup.TestContextSetup;
import utils.listener.report.Report;

import static io.restassured.RestAssured.given;

@Slf4j
public class Dog_APIs extends TestBase {

    TestContextSetup testContextSetup;

    public Dog_APIs(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @Given("User should be able to Retreive List of all dog breeds")
    public void user_should_be_able_to_retreive_list_of_all_dog_breeds() {
        RestAssured.baseURI = "https://dog.ceo/api/breeds/list";
        Response Response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/all")
                .then()
                .extract().response();

        String body = String.valueOf(Response.getBody().asPrettyString());
        System.out.println("Response: " + body);
        Assertions.assertEquals(200, Response.statusCode());
        Report.log(scenario, "Retreived List of all dog breeds are : " + body);
    }

    @Given("User should be able to see Retreiver breed is within the list")
    public void user_should_be_able_to_see_retreiver_breed_is_within_the_list() {
        RestAssured.baseURI = "https://dog.ceo/api/breeds/list";
        Response Response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/all")
                .then()
                .extract().response();

        String body = String.valueOf(Response.getBody().asPrettyString());
        System.out.println("Response: " + body);
        Assertions.assertTrue(body.contains("retriever"));
        Report.log(scenario, "Retreiver breed is within the list");
    }

    @Given("User should be able to see Retreive list of sub breeds for Retreiver")
    public void user_should_be_able_to_see_retreive_list_of_sub_breeds_for_retreiver() {
        RestAssured.baseURI = "https://dog.ceo/api/breed/retriever";
        Response Response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/list")
                .then()
                .extract().response();

        String body = String.valueOf(Response.getBody().asPrettyString());
        System.out.println("Retreive list of sub breeds for Retreiver Response is : " + body);
        Assertions.assertEquals(200, Response.statusCode());
        Report.log(scenario, "Retreive list of sub breeds for Retreiver Response is : " + body);
    }

    @Given("User should be able to get random image link for sub breed golden")
    public void user_should_be_able_to_get_random_image_link_for_sub_breed_golden() {
        RestAssured.baseURI = "https://dog.ceo/api/breed/retriever/golden/images";
        Response Response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/random")
                .then()
                .extract().response();

        String body = String.valueOf(Response.getBody().asPrettyString());
        System.out.println("Retriever Golden Sub Breed Image is : " + body);
        Assertions.assertEquals(200, Response.statusCode());
        Report.log(scenario, "Retriever Golden Sub Breed Image is : " + body);
    }
}
