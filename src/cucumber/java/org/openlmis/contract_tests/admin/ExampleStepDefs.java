package org.openlmis.contract_tests.admin;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class ExampleStepDefs {

    private int x;
    private int y;

    @When("^(\\d+)\\+(\\d+)$")
    public void asdfgh(int arg1, int arg2) throws Throwable {
        x=arg1;
        y=arg2;
    }

    @Then("^equals (\\d+)$")
    public void equals(int arg1) throws Throwable {
        Assert.assertEquals(x+y, arg1);
    }

}
