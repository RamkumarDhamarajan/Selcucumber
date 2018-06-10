Feature: Login to leafTap
Scenario Outline: Login into leafTap (positive)
Given Invoke LeafTap Application
And Enter the UserName as <UserName>
And Enter the Password as <password>
Examples:
|UserName|Password|
|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|
#And Click on Login Button
#Then Verify the Login is Success
#And Click on Crm/Sfa 
#And Click on Create Lead
#And Enter the FirstName
#And Enter the LastName
#And Enter the CompanyName
#When Click on CreateLead Button 
#Then Verify the CreateLead is Success