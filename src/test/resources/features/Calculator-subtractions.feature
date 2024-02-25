Feature:  Sub numbers with a Calculator
  In order to not learn math
  As someone who is bad at math
  I want to be able to sub numbers using a Calculator

  Background: Start with a Calculator
    Given I have a Calculator

  Scenario:  Sub two positive numbers
    When I add 1 and 1
    Then the sub should be 0

  Scenario:  Sub two negative numbers
    When I add -1 and -1
    Then the sub should be 0

  Scenario:  Sub a positive number and negative number
    When I add 1 and -1
    Then the sub should be 2