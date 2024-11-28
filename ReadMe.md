Here are the steps i have followed in order to complete this assessment:
-----------------------------------------------------------------------
Step-1 : Setup
-----------------------------------------------------------------------
Install Visual studio
Selenium setup with java and maven

You can follow following tutorial to complete the setup: 
https://www.youtube.com/watch?v=y23ZlIooChQ

-----------------------------------------------------------------------
Step-2 : Coding
-----------------------------------------------------------------------
Therr are 2 files in the project which contains the Assessment code 
->Test1And2.java
->Test3And4.java


Test1And2.java Contains:
1. Confirm accessibility of the top-level menus: Home, Our Story, Our Solution, and Why
Tendable. [Here the elements visible and provided in assesments were diff hence i followed the element list as : About,Products,Sectors,Content Hub,Contact]
2. Verify that the "Request a Demo" button is present and active on each of the
aforementioned top-level menu pages.

Test3And4.java Contains:
3. Navigate to the "Contact Us" section, choose "Marketing", and complete the form—
excluding the "Message" field. On submission, an error should arise. Ensure your script
confirms the error message's appearance. If the error is displayed, mark the test as PASS. If
absent, it's a FAIL.
4. In the event the test for point 3 fails (meaning no error message is displayed when the
"Message" field is empty)->If there is no error message displayed on screen, the test will fail

-----------------------------------------------------------------------
Step-3 : Test Spec Execution
-----------------------------------------------------------------------
->On next line of @Test in each file you will get button to execute your test


Following are the test results for Test1And2.java:

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running test.Test1And2

Results:

The Test starts here
Nov 29, 2024 2:32:51 AM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch

The 'About' element is visible and accessible.
The 'DemoElement' ButtonButton is visible and accessible on Contact page
The 'Products' element is visible and accessible.
The 'DemoElement' ButtonButton is visible and accessible on Products page
The 'Sectors' element is visible and accessible.
The 'DemoElement' ButtonButton is visible and accessible on Sectors page
The 'Content Hub' element is visible and accessible.
The 'DemoElement' ButtonButton is visible and accessible on Content Hub page
The 'Contact' element is visible and accessible.
The 'DemoElement' ButtonButton is visible and accessible on Contact page
The Test Ends here

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  30.590 s
Finished at: 2024-11-29T02:33:12+05:30
------------------------------------------------------------------------

Following are the test results for Test3And4.java:

------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running test.Test3And4

Results:


The Test starts here
Form Submission Failed error is visible as expected on webpage
The Test Ends here

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  39.656 s
Finished at: 2024-11-29T02:40:06+05:30
------------------------------------------------------------------------