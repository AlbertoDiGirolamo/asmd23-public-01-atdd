package calculator;

import io.cucumber.java.en.*;

public class CalculatorSteps {
    private int res = 0;
    private Calculator calculator;

    @Given("I have a Calculator")
    public void iHaveACalculator() {
        this.calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int arg0, int arg1) {
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
    }

    @Then("the sum should be {int}")
    public void theSumShouldBe(int arg0) {
        this.calculator.add();
        if (arg0 != this.calculator.getResult()) { // or using Junit's asserts
            throw new IllegalStateException();
        }
    }

    @Then("the sub should be {int}")
    public void theSubShouldBe(int arg0) {
        this.calculator.subtraction();
        if (arg0 != this.calculator.getResult()) { // or using Junit's asserts
            throw new IllegalStateException();
        }
    }

    @Then("the multiply should be {int}")
    public void the_multiply_should_be(int arg0) {
        this.calculator.multiply();
        if (arg0 != this.calculator.getResult()) { // or using Junit's asserts
            throw new IllegalStateException();
        }
    }


    @When("I press divide")
    public void iPressDivide() {
        res = calculator.divide();
    }

    @Then("the result should be {int} on the screen")
    public void theResultShouldBeIntOnTheScreen(int expectedResult) {
        assert res == expectedResult;
    }

    @Given("I have entered the first number {int} into the calculator")
    public void iHaveEnteredTheFirstNumberIntoTheCalculator(int arg0) {
        calculator = new Calculator();
        calculator.enter(arg0);
    }
    @And("I have entered the second number {int} into the calculator")
    public void iHaveEnteredTheSecondNumberIntIntoTheCalculator(int arg0) {
        calculator.enter(arg0);
    }
}
