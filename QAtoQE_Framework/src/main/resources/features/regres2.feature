Feature: Creating smoke test for regres.in API call2

@smokeap
Scenario: Creating POST Call for Single User
Given I am baseURI of the regres application
When I passing endpoints for create user
Then I validate the Status code as 201
And I validate the name as morpheus