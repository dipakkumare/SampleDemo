Feature: To verify form Authintication Functionality

Background: 
When user selects "chrome" browser
And launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in url

@fa
Scenario: Verify with current credentials
Then click on "Form Authentication"link
Then verify "login" is present in url
Then enter username as "tomsmith"
And enter password as "SuperSecretPassword!"
And click on login button
Then verify "secure" is present in url
And click on logout button
Then verify "login" is present in url


