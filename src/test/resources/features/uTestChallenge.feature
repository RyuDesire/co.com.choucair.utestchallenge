# Autor: Steven Giraldo

  @stories
  Feature: Utest Challenge
    As a user, I want to register a new user at Utest.com
  @scenario1
  Scenario Outline: Register a new user
    Given than Jeanne wants to register herself at the Utest website
    When she fulfills all the information in the registration form at the Utest platform
  | strFirstName   | strLastName   | strEmail   | strBirthMonth   | strBirthDay   | strBirthYear   | strInputLanguage   | strCity   | strZip   | strComputerOS   | strComputerOSVersion   | strComputerOSLanguage   | strMobileBrand   | strMobileModel   | strMobileOS   | strPassword   |
  | <strFirstName> | <strLastName> | <strEmail> | <strBirthMonth> | <strBirthDay> | <strBirthYear> | <strInputLanguage> | <strCity> | <strZip> | <strComputerOS> | <strComputerOSVersion> | <strComputerOSLanguage> | <strMobileBrand> | <strMobileModel> | <strMobileOS> | <strPassword> |
    Then she creates her new user at Utest platform

    Examples:
      | strFirstName | strLastName | strEmail                 | strBirthMonth | strBirthDay | strBirthYear | strInputLanguage | strCity | strZip | strComputerOS | strComputerOSVersion | strComputerOSLanguage | strMobileBrand | strMobileModel | strMobileOS | strPassword  |
      | Fake         | Account     |fakeaccount2021@email.com | January       | 1           | 2000         | French           | Toronto | 056987 | Ubuntu         | Ubuntu 20.04         | English               | Samsung        | Galaxy J7      | Android 8.0 | aA123456789! |