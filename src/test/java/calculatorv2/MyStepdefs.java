package calculatorv2;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private CalculatorV2 calculator;
    private int value1;
    private int value2;
    private int result;

    @Before
    public void before() {
        calculator = new CalculatorV2();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I ([*/^]) the two values$")
    public void iAddTheTwoValues(String arg0) {
        result = calculator.calculate(value1, value2, arg0);
        System.out.print(result);
    }

    @Then("^I expect the result (-?\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}
