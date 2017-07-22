
Feature: To verify home page links ar working
Background: 
When user selects "firefox" browser
And launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in url

@link
Scenario Outline: To verify home page links ar working
Then click on <linkname>link
Then verify <url> is present in url
Examples:
    |linkname 						|url																									|
    |"A/B Testing"				|  "https://the-internet.herokuapp.com/abtest"					|
   
   
   
   
@allLink   
Scenario: get all link present on home page and verify linktext

Then get all links present on home page

