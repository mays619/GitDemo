
Feature: Application Login
	##	Scenario: Home Page default login
	##	Given User is on Netbanking Landing Page
	##	When  User login into application with username and password
##		Then  Home Page is displayed
##		And   Cards are displayed 
	
	
	
		Scenario: Home Page default login
		Given User is on Netbanking Landing Page
		When  User login into application with username "jin" and password "1234"
		Then  Home Page is displayed
		And   Cards displayed are "true"
		
		

		Scenario: Home Page default login
		Given User is on Netbanking Landing Page
		When  User login into application with username "jack" and password "2341"
		Then  Home Page is displayed
		And   Cards displayed are "false"