@login
Feature: user buy a book from bookcart website

  #@emp
  #Scenario Outline: User login check
  #Given user navigate to the login page
  #When enter the "<username>" and "<password>"
  #Then user click the login button
  #
  #Examples:
  #| username | password |
  #| Admin    | admin12 |
  @book
  Scenario Outline: user login to the bookcart
    Given user should perform login with "<username>" and "<password>"
    And user search the "<book>" and add to cart
    Then user verify the cart

    Examples: 
      | username | password    | book            |
      | jhonwick | Jhonwick@19 | The Simple Wild |
      | batman   | Batman@1    | Catching Fire   |
