Feature: To verify Dropdown
Background: 
When user selects "chrome" browser
And launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in url

@dd
 Scenario: 
 Then click on "Dropdown"link
 Then select  value by "index" with "1"
 
 @dd
 Scenario: 
 Then click on "Dropdown"link
 Then select  value by "value" with "2"
 
 @dd
 Scenario: 
 Then click on "Dropdown"link
 Then select  value by "text" with "3"
 