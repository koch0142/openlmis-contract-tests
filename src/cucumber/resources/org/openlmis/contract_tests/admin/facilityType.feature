@facilityType
Feature: facilityType
  Scenario: Admin should be able to create faciltyType
    Given I have logged in as admin
    When I try to create a facilityType with name: code: code
    Then I should get response with the created facilityType's id