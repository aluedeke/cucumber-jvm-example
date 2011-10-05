package net.ludeke.example;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.junit.Cucumber;
import cucumber.junit.Feature;
import net.ludeke.example.Car;

import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(Cucumber.class)
@Feature(value = "CarMaintenance.feature")
public class FuelCarTest {
    private Car car;

    @Given("^a car with (\\d*) litres of fuel in the tank$")
    public void createCar(int initialFuelLevel) {
        car = new Car(initialFuelLevel);
    }

    @When("^you fill it with (\\d*) litres of fuel$")
    public void addFuel(int addedFuel) {
        car.addFuel(addedFuel);
    }

    @Then("^the tank contains (\\d*) litres$")
    public void checkBalance(int expectedFuelLevel) {
        int actualFuelLevel = car.getFuelLevel();
        assertThat(actualFuelLevel, is(expectedFuelLevel));
    }
}