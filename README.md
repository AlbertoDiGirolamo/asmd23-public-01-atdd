# Task 1: CALCULATOR

I have experimented with Gherkin functionalities by implementing some mathematical operations applying ATDD (Acceptance Test-Driven Development) approach.

* Subtractions operations is implement using Background.
* Multiplication operations is implement using Scenario Outline to test the scenarios with different parameters.


# Task 5: ATDD-LLM
## LLMs/ChatGPT can arguably help in write/improve/complete/implement/reverse-engineer a Gherkin specification. Experiment with this, based on the above tasks or in other cases. Is ChatGPT useful for all that?

**Discussion**

### First request:

* For the first step i ask to ChatGPT this request:
> i want implement Gherkin specification in my application written in java. 
  My application is a simple calculator. i want add division operation where i add two number and then i obtain the result of the division. 
  I want that my calculator is capable to calculate the division between two positive number, 
  two negative number and a positive number with a negative number.

* The answer is:
```
Feature: Division Operation

Scenario: Divide two positive numbers
  Given I have entered {int} into the calculator
  And I have entered {int} into the calculator
  When I press divide
  Then the result should be {int} on the screen
  
# Similar scenarios for other cases (e.g., dividing two negative numbers, dividing positive by negative, etc.)
```
```
import io.cucumber.java.en.*;

public class DivisionSteps {
    private Calculator calculator;
    private int result;

    @Given("I have entered {int} into the calculator")
    public void i_have_entered_number_into_the_calculator(int number) {
        calculator = new Calculator();
        calculator.enter(number);
    }

    @When("I press divide")
    public void i_press_divide() {
        result = calculator.divide();
    }

    @Then("the result should be {int} on the screen")
    public void the_result_should_be_on_the_screen(int expectedResult) {
        assert result == expectedResult;
    }
}
```
Compilator not recognized the definition step so I have to change the scenario in:
```
Scenario: Divide two positive numbers
    Given I have entered the first number 1 into the calculator
    And I have entered the second number 1 into the calculator
    When I press divide
    Then the result should be 1 on the screen
```
### Second request:
* I upload the correct template to ChatGPT and I ask to realize other operations (dividing two negative numbers and dividing positive by negative).
>Using the follow template, write scenarios about dividing two negative numbers and dividing positive by negative:
```
Feature: Division Operation
Scenario: Divide two positive numbers
    Given I have entered the first number 1 into the calculator
    And I have entered the second number 1 into the calculator
    When I press divide
    Then the result should be 1 on the screen write the
```
* The answer is the following: 
```
Feature: Division Operation

Scenario: Divide two negative numbers
    Given I have entered the first number -10 into the calculator
    And I have entered the second number -2 into the calculator
    When I press divide
    Then the result should be 5 on the screen

Scenario: Divide positive by negative
    Given I have entered the first number 20 into the calculator
    And I have entered the second number -5 into the calculator
    When I press divide
    Then the result should be -4 on the screen
```



