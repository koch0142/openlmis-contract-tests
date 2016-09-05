package org.openlmis.contract_tests.admin;

import io.restassured.response.Response;


        import cucumber.api.java.en.Given;
        import io.restassured.http.ContentType;
        import io.restassured.response.Response;
        import java.io.IOException;
        import java.util.Properties;
        import static io.restassured.RestAssured.given;
        import static org.jglue.fluentjson.JsonBuilderFactory.buildObject;
        import static org.openlmis.contract_tests.common.LoginStepDefs.ACCESS_TOKEN;
        import static org.openlmis.contract_tests.common.TestVariableReader.baseUrlOfService;
/**
 * Created by serwis on 05.09.16.
 */

    public class CreateFacilityType {
        private Response createFacilityType;
        @Given("^I try to create a facilityType with code: (.*)$")
        public void ITryToCreateAFacilityTypeWith(String code) throws Throwable {
            createFacilityType = given()
                    .contentType(ContentType.JSON)
                    .queryParam("access_token", ACCESS_TOKEN)
                    .body(buildObject()
                            .add("code", code)
                            .getJson().toString())
                    .when()
                    .post(baseUrlOfService("requisition") + "facilityTypes");
        }
    }

