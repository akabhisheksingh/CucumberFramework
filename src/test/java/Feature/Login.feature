Feature: Banking application login 

Background:
Given Validate the browser
When Browser is launched
Then Able to enter url
@SmokeTest
Scenario: Home page default login signup
Given User is landing on application page
When User sign up with following details "ABHI1" and "12458"
Then Signup button enabled
And able to complete the registration


@RegTest
Scenario Outline: Login into app with different username and password
Given User is on login page 
When User can enter username <username> and password <password>
Then click on login in button
And user should be able to login to banking website or app
Examples: 
|username |password |
|Abhi     |1234     |
|Ansh     |56789    |
|test1    |1879     |
|test2    |6589     |
 
