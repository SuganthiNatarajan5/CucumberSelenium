Feature: This is to do google search
Scenario: open google and search
 Given User is entering Url
 When user is typeing the search term "click"
 And enters the return key
 Then user should see the result