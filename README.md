# Hooloovoo



- Main programming language is Java.
- The automation tool is Selenium WebDriver.
- The built automation tool is Maven. 
- The assertion tool is JUnit. 
- The design pattern in the framework is the Page Object Model design pattern.
- Testing website is "http:hooloovoo.rs"

Task: User aplies for job in Hooloovoo 

Given User is navigated to Hooloovoo home page
When User clicks on "Posao" button
And User clicks on "Pridruzi se" button
And User clicks on "Prijavi se" button
Then User is redirected to "General Application" screen and verifies application title
And User enters firstname
And User enters lastname
And User enters email 
And User upload cv from hard disk
And User enters link to cv from google drive (just in case :) ) 
Then User is successfully aplied for the job for Automation Test 
