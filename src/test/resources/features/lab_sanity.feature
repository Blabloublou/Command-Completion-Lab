Feature: Lab sanity check
  Minimal Cucumber smoke test tied to list-style fixtures in the lab sources.

  Scenario: List fixture has expected size
    Given a list with elements "a" and "b"
    When I ask for the size
    Then the size should be 2
