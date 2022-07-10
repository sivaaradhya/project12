#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: login module
  I want to use this template for my feature file

  @tag1
  Scenario: verify the login page With vaild credentials
    Given Lunch the Chrome Browser
    When open url"https://demo.guru99.com/V4/index.php"
    And enter user name "mngr412387"
    And enter password "myvYvyr"
    And click login button
    Then verify the Title "Guru99 Bank Manager HomePage"
   