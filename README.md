<h1>Flight Management System</h1>
This project is a Spring Boot 3.x RESTful web microservice that implements the following business requirements for a flight management system:

A flight as an entity has the following properties:

<ol>Id
<li>Flight Code (alphanumeric/String e.g., AN458)</li>
<li>Origin (city/String)</li>
<li>Destination (city/String)</li>
<li>Date and time of flight (LocalDateTime)</li>
<li>Capacity (int)<li></li>
</ol>
A passenger as an entity has the following properties:

Id
First Name
Last Name
Mobile Number
Email
A flight has multiple passengers and each passenger has one flight

Implement the RESTful webservice for:

Adding new flights
Getting the flights
Getting a particular flight by flight code or id
Getting flight by origin city
Getting flight by destination city
Getting flights by minimum capacity
Implement the RESTful webservice for adding passengers

Ensure that the passenger create view model also takes the flight code so that the passenger is added to that flight

In point 4, when we get a particular flight (either by id or by flight code), the flight information should have the list of passengers of that flight

Stretch goals (good to have features)
Swagger or Spring API documentation
Validation (email, mobile number, etc)
Please note that this is just a sample README.md file. You can modify it as per your project requirements.

To convert this README.md file to HTML, you can use any of the following tools:

Pandoc
Marked 2
Dillinger
StackEdit
