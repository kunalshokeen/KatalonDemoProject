# Project Title

Demonstration of how Katalon works

### Prerequisites

Katalon studio should be installed on the user machine. Link to down load:
https://www.katalon.com/


### Installing

Navigate to https://www.katalon.com.

1. Click on the Download Now button on the page.
2. Wait till the file is downloaded.
3. Navigate tot he file downloaded and extract the file.
4. Move to the folder where it is saved after extracting file.
5. Search for the Katalon exe file. Double click on it to launch Katalon studio.

## Running the tests

Multiple ways of running test cases are:

1. User could directly move to the test case and click on the run button while selecting the browser.
2. User could create a test suite. Move to the test suite folder and select the test suite to be executed. Click on the run button while selecting the browser.
3. User could run the test cases by clicking on Build cmd. Click on build cmd, Selct the test suite and also the browser. Click on generate command and copy the command. Move to the folder where user has saved the katalon studio. Open the command prompt there and paste the command copied and press enter. 

### Break down into end to end tests

Two test cases are being created under the folder main test cases under test cases tag.Another test case is created under common test cases folder un test cases tags.
1. Login  (Reusable test case).
2. TC1_Verify successful Login.
3. TC2_Verify successful Appointment.


### And coding style tests

TC1_Verify successful Login :  This test case is to login in the application using the Login test case which holds reusable steps to be used for login into application.

TC2_Verify successful Appointment :  This test case is for complete flow of appointment booking. Again common test case Login is called to complete the flow.


Futher we have created custom keywords under the Keywords tag. We are making use of Data files in this to make the test cases as data driven.

In the end Test suite is being created to excute the complete suite at once.


## Built With

* http://demoaut.katalon.com - Website used.
* Katalon studio version 5.0.1


