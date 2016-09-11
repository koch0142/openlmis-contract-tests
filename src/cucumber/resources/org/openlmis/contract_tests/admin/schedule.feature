Feature: Schedule
    Scenario: Admin should be able to get the list of schedules
        Given I have logged in as admin
        When I try to list the schedule
        Then I should get the empty list