@Smoke
Feature: SkyBlue Background Validation Test
Background:
Given User is on the Automation Project website page 

@Scenario1
Scenario: User should be able to change the background to skyblue 
And Skyblue Button exists 
When User clicks on the set sky blue background button
Then The background color should change to sky blue

@Scenario2
Scenario: User should be able to change the background to White
Given White Button exists
When User clicks on the set white background button
Then The background color should change to white



