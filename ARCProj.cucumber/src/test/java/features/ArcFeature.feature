Feature: Arc login and navigate to linchpin and logout

Scenario: Verify linchip course assigned and logout
Given User has logged in to ARC Application using valid data
And Get user rank and user points 
When User click on First course present under linchpin 
Then User Navigate to main page
And User log out from the application