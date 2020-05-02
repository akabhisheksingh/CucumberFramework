Feature: Banking application signupTest

Scenario: Home page default login signup
Given User is landing on application page
When User sign up with following details
|Abhishek|Singh|Singhabhi031994@gmail.com|323537|India|
Then Signup button enabled
And able to complete the registration