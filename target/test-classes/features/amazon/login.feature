@login
Feature: Amazon login
  I want to use this template for my feature file

  Background: 
    Given I want to navigate to amazon home page

  @logintest
  Scenario Outline: login functionality for AMAZON
    When click hello sign in button
    And enter "<username>" username
    Then click continue button
    And enter "<password>" password
    Then sign in button
    Then user should navigate to amazon home screen after login

    Examples: 
      | username     | password    |
      | mdurgaprasad | 65768879797 |
      | jhjgchhgvjjj |  9581225566 |