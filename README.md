
# Urban Sports Test Automation Framework README.md

**Prerequisites**

1) Access to Git repository
2) Java (jdk) : http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
3) Maven : https://maven.apache.org/download.cgi
4) IntelliJ (or any other IDE) : https://www.jetbrains.com/idea/download/

**Installation Details of IntelliJ:**

1) IntelliJ installation Guide ( Windows) : https://www.youtube.com/watch?v=m2BYGocvows
2) IntelliJ installation Guide ( Mac) : https://www.youtube.com/watch?v=4ej49_eEOcM



**Steps to get the Test Automation Framework Template:**

1) Clone the project from https://github.com/omfasom/UrbanSports.git
2) Launch and open the project 'UrbanSports' in IntelliJ editor


**Install Lombok Plugin:**

1) Help > Find Action >Search for "Plugins"
2) Search for "lombok" in the plugins popup
3) Click search in repository(In case it is not listed)
4) Search and select "Lombok Plugin" in the results
5) Click Install and click accept in the popup
6) Click Restart IntelliJ and click OK


**Create maven run configuration:**

1) Click run -> Edit configuration
2) Create/add configuration
3) Name the configuration
4) Click apply and save it
5) Repeat above steps to create another maven configuration with command line as 'clean install site -DsuiteFile=api_regression.xml'


**Test Framework Structure:**

1) Created requests, tests, helpers in Java8 and RestAssured Library
2) Java file in main file divided into 3 file Backend, FrontEnd and Common
3) Backend main file consist of request, resource, helpers
4) Backend test file consist of APITest class
5) Frontend main file consist of HomePage, LoginPage, SportsOfferPage classes
6) Frontend test file consist of BaseTests, LoginTests, SportsOfferTests


**How to run tests:**

1) src->test->java->BackEnd_test_suite.xml right click run button
2) src->test->java->FrontEnd_test_suite.xml right click run button   
3) In order to do maven run -> choose working directory, enter "clean install" to command line
