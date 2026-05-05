package com.example.lab.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class LabSanitySteps {

    private List<String> list;
    private int size;

    @Given("a list with elements {string} and {string}")
    public void aListWithElementsAnd(String first, String second) {
        list = List.of(first, second);
    }

    @When("I ask for the size")
    public void iAskForTheSize() {
        size = list.size();
    }

    @Then("the size should be {int}")
    public void theSizeShouldBe(int expected) {
        assertEquals(expected, size);
    }
}
