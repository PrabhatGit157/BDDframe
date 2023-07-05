#Author: #nahi pata

Feature: Login to vtiger Application
  

 
  Scenario: Login to vtiger Application With Valid Credentials
    Given I want to launch the browser
    And I want to load the URL
    When Login page is displayed enter UserName and Password
    And Click On Login
    When homepage is displayed
    