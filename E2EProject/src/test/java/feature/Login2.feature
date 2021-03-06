Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initalize the browser with chrome
And Navigate to "http://qaclickacademy.com" site
And Click on Login link in home page to land on secure sign in Page
When User enters <username> and <password> and logs in
Then close the browser

Examples:
|username   			|		|password |
|test99@gmail.com	|		|123456		|
|test100@gmail.com|		|12345		|