Feature: Ebay Home Page Scenarios

  @P1
  Scenario: Advanced Search Link
    
      Given: I am on Ebay Home Page
      When: I click on Advanced Link
      Then: I navigate to Advanced Search Page


  @P32
  Scenario: Search items count
    Given: I am on Ebay Home Page
    When: I search for 'iphone11'
    Then: I validate atleast 1000 items are present


  @P35
  Scenario Outline: HomePage Links
    Given: I am on Ebay Home Page
    When: I click on '<link>'
    Then: I validate that page navigates to '<url>' and title contains '<title>'
    
    Examples:
    |link|url|title|
    |Motors|https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334|eBay Motors|
    |Electronics|https://www.ebay.com/b/Electronics/bn_7000259124|Electronics|
    |Home & Garden|https://www.ebay.com/b/Home-Garden/11700/bn_1853126|Home & Garden|

