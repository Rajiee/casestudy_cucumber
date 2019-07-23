Feature: Registration to TestMe app
Scenario: User registration
Given User must not be logged in 
When user clicks on the signup button
And User enters the username as "raji1234"
And user enters the firstname as "Raji"
And user enters the lastname as "A"
And user enters the password as "aju"
And user enters the confirm password as "aju"
And user enters the gender as "female"
And user enters the emailid as "aju@gmail.com"
And user enters the phoneno as "9876543210"
And user enters the dob as "10/09/1997"
And user enters the address as "Tambaram, Chennai"
And user selects the security question "What is your pet name?"
And user enters the answer as "Cat"
Then Thus user has registered successfully