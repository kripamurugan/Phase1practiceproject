# In BDD, the test data will be put in the feature file
# Username : demouser1@gmail1.com
# Password : 12345
# If you have a small test data to be passed to the feature step, then use:
# Examples keyword
# '<EmailId>' is a placeholder, it is like an object or variable which will store the test data for the step
Feature: Enter login Credentials on tutorialsNinja Page

  Scenario Outline: Test username and password for login page
    Given I am on the tutorialsNinja HomePage
    Then I am click on my account link
    When I am click on login link
    Then I am  will be on the login page and I capture the title of the page
    And I am enter email id as '<EmailId>' on the page
    And I am enter password as '<password>' on the page
    Then I am click login button

    Examples: 
      | EmailId              | password |
      | demouser1@gmail1.com |    12345 |