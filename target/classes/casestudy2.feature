Feature: Login Functionality

Scenario: Login to TestMe app
Given User must be registered
When User enters the below credentials
 |username||password|
 |AlexUser||Alex@123|
 |raji123||aju|
Then User must be in the home page


