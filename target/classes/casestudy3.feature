Feature: Search functionality
@login
 Scenario Outline: login
Given User must goto login
When User enters the valid login credentials "<username>" and "<password>"
And user enters into the home page
And user enters product to be bought in search tab as "Headphone"
Then user purchases the product
Examples:
|username||password|
|Lalitha||Password123|

