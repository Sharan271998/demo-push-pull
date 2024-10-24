
Feature: Testing the Banking login page

Scenario: Testing the login with valid credential
Given user is in bank login page
When user perform login using "dharshaG" and "dharshaG"
And user click login button
Then user validate the successful msg "<actual msg>" with "Welcome dharsha g"

Scenario Outline: Testing the login with invalid credential
Given user is in bank login page
When user perform login using "<username>" and "<password>"
And user click login button
Then user validate the "<actual msg>" with "Welcome dharsha g"
Examples:
|username|password|actual msg|
|dharshaG|dharshaG|Welcome dharsha g|


