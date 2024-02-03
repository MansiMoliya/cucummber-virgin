@regression
Feature: Home Page Test

  Background: User is on HomePage
    Given I am on HomePage

  @author_Mansi_Moliya
  Scenario Outline: Verify that User should navigate to the clickable menu
    And I am accept the cookies
    When I click On the "<menuName>" menu
    Then Verify that redirect page URL: "<url>"
    Examples:
      | menuName     | url                                          |
      | Online Slots | https://www.virgingames.com/uk/slots         |
      | Live Casino  | https://www.virgingames.com/uk/live-casino   |
      | Casino       | https://www.virgingames.com/uk/online-casino |
      | Slingo       | https://www.virgingames.com/uk/slingo        |
      | Online Bingo | https://www.virgingames.com/uk/online-bingo  |
      | Free Games   | https://www.virgingames.com/uk/free-games    |
      | Poker        | https://www.virgingames.com/uk/online-poker  |
      | All Games    | https://www.virgingames.com/uk/all-games     |
      | Blog         | https://www.virgingames.com/uk/blog          |
