Feature: Application login

Scenario: Home page default Login
Given User must be on the netbanking login page
When User login to the application with "Krishna" and "Agrawal"
Then Home page is populated
And Cards displays "true"

Scenario: Home page default Login
Given User must be on the netbanking login page
When User login to the application with "Krishna" and "upadhyay"
Then Home page is populated
And Cards displays "false"




