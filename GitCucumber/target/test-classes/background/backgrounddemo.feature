Feature: This is background demo
Background: User is logged in to saucedemo app 
Given User is accessing saucedemo login page
When User enters valid username and password
Then User should be able to navigated to Home page  

Scenario: Test Menu Items

And click on breadcrumb icon
Then User should be able to see the menu item 

Scenario: verify add to cart functionality 
And Clicks on Add to button 
Then Item should be added to the cart