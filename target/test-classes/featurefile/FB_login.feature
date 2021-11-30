Feature: To validate login functionality of facebook
Scenario: validate with invalid username and invalid password
Given user should launch the chrome browser
When user should type the url
And user should maximise the window
And user should type the invalid username and invalid password
And user should click the login button
And user should get the title of the incorrect credential page

