@User
Feature: Create users account
Scenario: User should be able to create an account
	Given: I have logged in as admin
	When I try to create a user with  userName: Name, firstName: FirstN, lastName: LastN, active: true, verified:true
	Then I should get response with the user’s id

	When I try to get user with id
	Then I should get user  with  userName: Name, firstName: FirstN, lastName: LastN, active: true, verified:true