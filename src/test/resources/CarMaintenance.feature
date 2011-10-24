Feature: Daily car maintenance
  In order to avoid silly mistakes
  As a math idiot 
  I want to be told the sum of two numbers

  Scenario Outline: Fuelling
    Given a car with <input_1> litres of fuel in the tank
    When you fill it with <input_2> litres of fuel
    Then the tank contains <output> litres
    
  Examples:
    | input_1 | input_2 | output |
    | 10      | 50      | 60     |
    | 2       | 5       | 7      |
    | 0       | 40      | 40     |