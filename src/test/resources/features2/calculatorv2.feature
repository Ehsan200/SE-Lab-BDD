@tag
Feature: CalculatorV2

  Scenario: multiplying two numbers
    Given Two input values, 50 and 2
    When I * the two values
    Then I expect the result 100

  Scenario: multiplying two numbers
    Given Two input values, 5 and -6
    When I * the two values
    Then I expect the result -30

  Scenario: dividing two numbers
    Given Two input values, 10 and -2
    When I / the two values
    Then I expect the result -5

  Scenario: dividing two numbers
    Given Two input values, 40 and -20
    When I / the two values
    Then I expect the result -2

  Scenario: powering two numbers
    Given Two input values, 3 and 0
    When I ^ the two values
    Then I expect the result 1

  Scenario: powering two numbers
    Given Two input values, 10 and 2
    When I ^ the two values
    Then I expect the result 100

  Scenario Outline: operation on two numbers
    Given Two input values, <first> and <second>
    When I <opt> the two values
    Then I expect the result <result>

    Examples:
      | first | second | opt | result |
      | 6     | 2      | *   | 12     |
      | 6     | 2      | /   | 3      |
      | 6     | 2      | ^   | 36     |