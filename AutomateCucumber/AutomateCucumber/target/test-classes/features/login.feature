Feature: Product Verify

Scenario: Verifying Products
Given Initialize the browser
And User will land to Home page "https://tide.com/en-us" and need to hover on Shop Products

Scenario: Searching Products
Given Initialize the browser
Then User will land to Home page "https://tide.com/en-us"
And Enter "“Antibacteria" in Search Tab and Verify it

Scenario: Loundary Module
Given Initialize the browser
Then User will land to Home page given "https://tide.com/en-us" 
And Click on How to do loundary then verify if How to Read Laundry Symbol is present



