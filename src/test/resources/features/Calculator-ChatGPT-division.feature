Feature: Division Operation

  Scenario: Divide two positive numbers
    Given I have entered the first number 1 into the calculator
    And I have entered the second number 1 into the calculator
    When I press divide
    Then the result should be 1 on the screen

# Similar scenarios for other cases (e.g., dividing two negative numbers, dividing positive by negative, etc.)
