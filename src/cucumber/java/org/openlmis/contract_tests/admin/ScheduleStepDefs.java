package org.openlmis.contract_tests.admin;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;


import static io.restassured.RestAssured.given;
import static org.openlmis.contract_tests.common.LoginStepDefs.ACCESS_TOKEN;
import static org.openlmis.contract_tests.common.TestVariableReader.baseUrlOfService;

public class ScheduleStepDefs {

    private Response createScheduleResponse;

    @When("^I try to list the schedule$")
    public void i_try_to_list_the_schedule() throws Throwable {
        createScheduleResponse = given()
                .contentType(ContentType.JSON)
                .param("access_token", ACCESS_TOKEN)
                .when()
                .get(baseUrlOfService("requisition") + "processingSchedules");
    }

    @Then("^I should get the empty list$")
    public void i_should_get_the_empty_list() throws Throwable {
        Assert.assertEquals("[ ]", createScheduleResponse.body().print());
    }

}
