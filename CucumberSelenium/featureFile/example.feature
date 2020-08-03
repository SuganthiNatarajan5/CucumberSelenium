Feature: Login feature fro Orange HRM.
Scenario Outline:: here login scenario
   Given : He is on login page
   When : He enters the username "Admin" and password "admin"
   And : He Clicks on the submit button
   Examples:
   |userName|password|
   |Admin   |admin123|