Zwift_technicalAssessment Pre-Requisite : 
--

1. java --version : 
openjdk 15.0.1 2020-10-20
OpenJDK Runtime Environment (build 15.0.1+9-18)
OpenJDK 64-Bit Server VM (build 15.0.1+9-18, mixed mode, sharing)

2. mvn --version : 
Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: /Users/p_varmora/apache-maven-3.6.3
Java version: 15.0.1, vendor: Oracle Corporation, runtime: /Users/p_varmora/Library/Java/JavaVirtualMachines/openjdk-15.0.1/Contents/Home
Default locale: en_US, platform encoding: UTF-8
OS name: "mac os x", version: "10.16", arch: "x86_64", family: "mac"

3. chromedriver version: (install in /usr/local/bin)
https://chromedriver.storage.googleapis.com/index.html?path=91.0.4472.19/
chromedriver_mac64_m1.zip

4. Google chrome-browser version : 90.0.4430.212

5. TestNG version: 6.14.3

6. Selenium version: 3.141.59

7. IntelliJ IDEA Community Edition 2020.2.4


Automation-framework walk-through: (included java-doc in each class for better understanding)
--
1. HomePageTest Class -> 1.validate_zwiftHomePageLoads() test 2. validate_contentOfYourChoicePresent() test 
2. EventsPageTest Class -> 1. validate_zwiftEventsPageLoads() test 2. validate_zwiftEventsAfterPopulatingFilters() test 

3. BaseTestSetup -> This the main class for intializing web-driver object, chrome-browser and  all the possible functionalities
4. HomePageClass -> This the home-page class with constructor for home-page related web-elements and methods 
5. EventsPageClass -> This the events-page class with constructor events-page related web-elements and methods. 

Build-Sucess Logs: 
--
/Users/p_varmora/Library/Java/JavaVirtualMachines/openjdk-15.0.1/Contents/Home/bin/java -Dmaven.multiModuleProjectDirectory=/Users/p_varmora/IdeaProjects/zwift_technicalAssessment/zwiftUI_Automation "-Dmaven.home=/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven3" "-Dclassworlds.conf=/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven3/bin/m2.conf" "-Dmaven.ext.class.path=/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven-event-listener.jar" "-javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=52132:/Applications/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath "/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven3/boot/plexus-classworlds.license:/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven3/boot/plexus-classworlds-2.6.0.jar" org.codehaus.classworlds.Launcher -Didea.version=2020.2.4 test
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------------< Zwift:zwiftUI_Automation >----------------------
[INFO] Building zwiftUI_Automation 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ zwiftUI_Automation ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ zwiftUI_Automation ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ zwiftUI_Automation ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/p_varmora/IdeaProjects/zwift_technicalAssessment/zwiftUI_Automation/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ zwiftUI_Automation ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /Users/p_varmora/IdeaProjects/zwift_technicalAssessment/zwiftUI_Automation/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ zwiftUI_Automation ---
[INFO] Surefire report directory: /Users/p_varmora/IdeaProjects/zwift_technicalAssessment/zwiftUI_Automation/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running TestSuite
Configuring TestNG with: org.apache.maven.surefire.testng.conf.TestNG652Configurator@7bfcd12c
chrome-browser started...
Starting ChromeDriver 90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}) on port 35873
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
[1622180191.654][WARNING]: This version of ChromeDriver has not been tested with Chrome version 91.
May 27, 2021 10:36:32 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C

navigated to Zwift home-page...
click on top_nav button
click on Events
click on Filter-Events button
select sports : cycling
select event-type : fondo
select intensities : B 
select start-time : Morning
apply filter
validated that zwift events have changed after populating fields and applying filters
Zwift-App Ended...

chrome-browser started...
Starting ChromeDriver 90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}) on port 39411
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
[1622180214.255][WARNING]: This version of ChromeDriver has not been tested with Chrome version 91.
May 27, 2021 10:36:54 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C

navigated to Zwift home-page...
click on top_nav button
click on Events
Zwift Events-page is Loaded successfully
Zwift-App Ended...

chrome-browser started...
Starting ChromeDriver 90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}) on port 38873
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
[1622180233.519][WARNING]: This version of ChromeDriver has not been tested with Chrome version 91.
May 27, 2021 10:37:13 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C

navigated to Zwift home-page...
content of your choice is present in Zwift home-page
Zwift-App Ended...

chrome-browser started...
Starting ChromeDriver 90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}) on port 23263
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
[1622180246.744][WARNING]: This version of ChromeDriver has not been tested with Chrome version 91.
May 27, 2021 10:37:26 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C

navigated to Zwift home-page...
Zwift home-page is Loaded successfully
Zwift-App Ended...

Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 69.887 sec

Results :

Tests run: 4, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  01:14 min
[INFO] Finished at: 2021-05-27T22:37:37-07:00
[INFO] ------------------------------------------------------------------------


