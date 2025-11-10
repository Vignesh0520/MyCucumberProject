Feature: Register a user in demo automation testing website 

	Scenario: register a new user
	Given the user should be using browser "chrome" to navigate to url "https://demo.automationtesting.in/Register.html"
	When the user enters first name "Vignesh" and last name "Raja"
	And the user enters address, email address "vigneshraja0520@gmail.com" and phone number "7094772888"
	And the user select gender and hobbies
	And the user select the languages and skill
	And the user selects the country "India" and date of birth Year "2000" Month "May" Day "20"
	And the user sets the password "Vignes@0" and confirm password "Vignes@0"
	Then take screenshot after taking all input 
	