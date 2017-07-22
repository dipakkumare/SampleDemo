Feature: To verify Multiple Windows

Background: 
When user selects "chrome" browser
And launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in url
 
 @mw
 Scenario: 
 Then click on "Multiple Windows"link
 Then verify "windows" is present in url
 And click on "click here" link
 Then switch to anather window
 Then verify "windows/new" is present in url
 Then switch to anather window
 Then verify "windows" is present in url