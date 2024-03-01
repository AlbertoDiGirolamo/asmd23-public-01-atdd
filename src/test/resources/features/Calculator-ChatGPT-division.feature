Feature: Division Operation

  Scenario: Divide two positive numbers
    Given I have entered the first number 1 into the calculator
    And I have entered the second number 1 into the calculator
    When I press divide
    Then the result should be 1 on the screen

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

# Similar scenarios for other cases (e.g., dividing two negative numbers, dividing positive by negative, etc.)
