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
1. HomePageTest Class -> 
    1. validate_zwiftHomePageLoads() 
    2. validate_contentOfYourChoicePresent()  
2. EventsPageTest Class -> 
    1. validate_zwiftEventsPageLoads() 
    2. validate_zwiftEventsAfterPopulatingFilters_NoResults() 
    3. validate_zwiftEventsAfterPopulatingFilters_forCycling()

3. BaseTestSetup -> This the main class - for intializing web-driver object, chrome-browser and  all the possible functionalities
4. HomePageClass -> This the home-page class with constructor - for home-page related web-elements and methods 
5. EventsPageClass -> This the events-page class with constructor - for events-page related web-elements and methods. 

Build-SUCCESS Logs: 
--
/Users/p_varmora/Library/Java/JavaVirtualMachines/openjdk-15.0.1/Contents/Home/bin/java -Dmaven.multiModuleProjectDirectory=/Users/p_varmora/IdeaProjects/zwift_technicalAssessment/zwiftUI_Automation "-Dmaven.home=/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven3" "-Dclassworlds.conf=/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven3/bin/m2.conf" "-Dmaven.ext.class.path=/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven-event-listener.jar" "-javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=51040:/Applications/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath "/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven3/boot/plexus-classworlds.license:/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven3/boot/plexus-classworlds-2.6.0.jar" org.codehaus.classworlds.Launcher -Didea.version=2020.2.4 test
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------------< Zwift:zwiftUI_Automation >----------------------
[INFO] Building zwiftUI_Automation 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ zwiftUI_Automation ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/p_varmora/IdeaProjects/zwift_technicalAssessment/zwiftUI_Automation/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ zwiftUI_Automation ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ zwiftUI_Automation ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/p_varmora/IdeaProjects/zwift_technicalAssessment/zwiftUI_Automation/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ zwiftUI_Automation ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ zwiftUI_Automation ---
[INFO] Surefire report directory: /Users/p_varmora/IdeaProjects/zwift_technicalAssessment/zwiftUI_Automation/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running TestSuite
Configuring TestNG with: org.apache.maven.surefire.testng.conf.TestNG652Configurator@7bfcd12c
chrome-browser started...
Starting ChromeDriver 90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}) on port 46839
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
[1622432282.556][WARNING]: This version of ChromeDriver has not been tested with Chrome version 91.
May 30, 2021 8:38:03 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
navigated to Zwift home-page...
click on top_nav button
click on Events
[INC Steady State, Cycle Nation Joburg Coffee Ride, Team Italy Morning Early Ride, EVO CC Sprint Race Series, Vikings Valhalla Monday Magic, 3R Watopia Flat Route Race - 4 Laps (40.5km/25.1mi 216m), Lactate Shuttle, EVO CC Vortex Interval Ride [~3-3.8w/kg avg], EVO CC Core Interval Ride [2.5-3.2w/kg avg], EVO CC Flux Ride [1.5 - 2.0w/kg avg], 3R SPARK Steady State Ride [~2.0-2.2 w/kg avg], 3R Octane Interval Ride [~3.2-3.6 w/kg avg], 3R VOLT Interval Ride [~2.6-3.2 w/kg avg], adidas X Parley RFTO: group run, Ride On for Zachary Tour, 3R Watopia - Volcano CCW - 5 Laps, 3R Racing, Macro to Micro, INC HIIT - 30min High Intensity Interval Training, Zwift Time Trial Tuesday: Tempus Fugit, ZZRC Breakfast Club - Ride with Mates, Orange Unicorn, ZSUN RNR, Team Italy PISSEI Race, Monday Run Club, ZLDR Easy 30, adidas X Parley RFTO: group run, 3R Watopia Flat Route Race - 3 Laps (30.3km/18.8mi 162m), Amalgam, ZHQ Steering Race // FutureWorks - Crit City, Flanders Endurance Series, Fearless Ladder for a Faster 5k, ZESP "Topillos", SAS- Pi & Sauce, The Stampede (ITT) by Herd Racing League, 3R Sand & Sequoias - 1 Lap (20km/12.5mi 173m), Lonely Goat Running Club 5K Recovery Run, TBR Knights of Suburbia, Anaerobic Capacity into VO2, PACK SUB2 Down Under, ZHQ Steering Race // FutureWorks - Volcano Circuit, EVO CC Sweet Sirocco Interval Ride [~3.0-3.5w/kg avg], Monday Run Club, Crit City Race, MET-5 Race, HWC Pedal Mafia Social Ride, DIRT Monday Endurance Ride, 3R Watopia Flat Route Race - 4 Laps (41km/25.5mi 216m), DIRTy Dozen Sprint League, Let's Get AERO, EVO CC Sprint Race Series, GRIT Easy Ride, KISS at Base Training Ride, The HERD M2C2, Epictour - Structured Workout, EVR Asia Race, adidas X Parley RFTO: group run, DIRT Monday Morning Blues Ride, 3R Volcano Flat Race - 3 Laps (36.6km/22.7mi 138m), Arise, ZLDR AYOP Hour Run, DIRT Run Club, European Lunch Ride, ZWC Hill Climb Battle, Monday Run Club, Epictour - Structured Workout, British Triathlon Summer Series - Group Ride, MHG Run Club, Slowtwitch Indoors: Group Run, Happy 100k p/b TeamODZ, Fearless Recovery Ride, CHINA ZCRC and TEAM G7 Spicy 100K, Monday DIRT Endurance Ride, Crit City Race, SAZ speed race, Escalation, 3R Innsbruckring Flat Race - 3 Laps (26.4km/16.4mi 231m), Fearless Ladder for a Faster 5k, TTR mini chase, JETT Base Ride (2.7~3.8w/kg), Frenchy Fuzion Recovery Ride with Adrien Vuillier, Epictour - Structured Workout, TTR Steady State 3.6-4.6, Monday News Time Ride, Magnum mOnDayZ RACE presented by Team ODZ, Ascenders Team Monday Slow Roll, Velocity - Dig the Bike Fantastic, ZHQ FutureWorks Crit City Race - Anti-sandbagging, Mindset Monday with Natalia Franco, 3R Volcano Climb Race - 1 Lap (22.4km/14mi 204m), Team Sportslab UK Hard Riders, USMES Back to Work Ride, 3R Ride in support of World Bicycle Relief - Women on Wheels [~2.5 – 3.2 w/kg avg], Epictour - Structured Workout, Ascenders Team Recovery Monday, ZER I'd Rather be Easy Riding with Ray (Est. Av. 1.2 - 1.5 w/kg), Canyon Ranch Group Ride p/b Pinarello, ZHQ FutureWorks Circuit Race - Anti-sandbagging, Ham Sandwich, Crit City Race, 3R Richmond UCI Hilly Race - 1 Lap (16.2km/10.1mi 142m), Monday Run Club, BC Bike Race Social Ride, adidas X Parley RFTO: group run, Fearless Cruisers, MAAP In The Field: USA Group Ride, Lactate Shuttle, 3R Classique Reverse Flat Race - 5 Laps (32km/20.1mi 76m), Group Run 5k, EVO CC Sprint Race Series, Liv Kick Off The Week Ride, Group Run 10k, 3R Volcano Circuit Sprint Flat Race - 1 Lap (6.6km/4.1mi 20m), FZR Segment Killer Race, INC Relentless Steady State, EVO CC Flux Ride [1.5 - 2.0w/kg avg], EVO CC Vamos! 90min Ride [3.5-4w/kg avg], adidas X Parley RFTO: group run, 3R Classique Reverse Flat Race - 4 Laps (26.9km/16.7mi 57m), ZZRC Wrecked Legs - Recovery Ride, Macro to Micro, PETA-Z Social Ride, ZHQ FutureWorks Crit City Race - Anti-sandbagging, EVO CC Sprint Race Series, ZHR Cassie's Race Prep Training Ride, 3R Impact Interval Ride [~3.5-4.0w/kg avg], Men in Glaz - Social Ride, Monday Run Club, Crit City Race, Cocorico Workouts – Bikes France, SZR Evening Joyride, Tullio Zwift Ride-Out (Open), Monday's Mountain Massif TT, Swift Carbon Pro Cycling ride, ZHQ Steering Race // FutureWorks - Crit City, 3R Queens Highway Race - 6 Laps, dPAC Team Recovery for Gavia/Stelvio/Mortirolo (Climbers Epic), Le Col Social Sessions, ZESP "Chinchillas", DBR Monday Race, ZTPL.CC Girls Ride, Rowe & King - Monday Mixer, Kiss Racing Team / FastFitnessTips iTT series, KIRCHMAIR Honeypot Ride, Herd of Mountain Goats, ZHCC Ladies Only 1.5, ZHQ FutureWorks Circuit Race - Anti-sandbagging, ZLDR Recovery 10k, Flanders Monday Blues Ride, Zwift Riders Germany - Afterwork Ride to ZRG-CC - Afterwork Ride, ZZRC SUB 2.0 Ride, KATT Race by WKG, The HERD Kickstart, Team KST "Le Puncheur" Race, Vikings Valhalla Ride with the Valkyries, TugaZ Epic Recovery Ride, Ascenders Team Social Monday, Sledgehammer Inbetweeners Races, The Cyclists' Alliance Community Ride, 3R Bologna Race - 2 Laps, Orange Unicorn, Ventouro Social Group Ride, adidas X Parley RFTO: group run, The Stampede (ITT) by Herd Racing League, TRI247 Manic Monday Time Trial, PACK Social + KOM After Party, TBR HIIT race, Forte Race Series, Bolt Race Team presents BRT Masters Training RACE., ZZRC Happy Hour, Team RWB - Monday Social - Led by Tri Talking Sport & PARC Tri, TEAM VEGAN Rice 'n' Easy, British Triathlon Summer Series - Handicap (Hare & Hounds) Race, 3R Launchpad Ride [~1.0-1.5w/kg avg], XRS Races: Monday's blues, PACK Beginners Step-by-Step, EVR Europe Race, KISS Monday Crit Race Series, GGCC Glasgow Green Cycle Club Race Series, 3R True2 Steady Ride [2.0w/kg avg], Spaded Sweetie, EVO CC Sprint Race Series, Monday Run Club, TBR Sub 2.5 Tuesday, AHDR Bacon Rolls, Team Zwift Tri Oz - Battle Ride AM, Chicks Who Ride Bikes Group Ride, Crit City Race, adidas X Parley RFTO: group run, ZMCC EyeballZ, The Kraken by TeamODZ, WMZ Crit Racing, Tri Aus TT, Bonbon, Fearless Ladder for a Faster 5k, 3R London Loop Hilly Race - 2 Laps (29km/18mi 440m), TTR Party Animal Race, AEO Vamos Amigos - Social Spin, 3R Watopia Flat Route Race - 3 Laps (30.8km/19.1mi 162m), The Grind Finale]
click on Filter-Events button
select sports : cycling
select event-type : fondo
select intensities : B 
select start-time : Morning
apply filter
[No results.]
validated that zwift events have changed after populating fields and applying filters
Zwift-App Ended...
chrome-browser started...
Starting ChromeDriver 90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}) on port 21291
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
[1622432309.913][WARNING]: This version of ChromeDriver has not been tested with Chrome version 91.
May 30, 2021 8:38:30 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
navigated to Zwift home-page...
click on top_nav button
click on Events
[INC Steady State, Cycle Nation Joburg Coffee Ride, Team Italy Morning Early Ride, EVO CC Sprint Race Series, Vikings Valhalla Monday Magic, 3R Watopia Flat Route Race - 4 Laps (40.5km/25.1mi 216m), Lactate Shuttle, EVO CC Vortex Interval Ride [~3-3.8w/kg avg], EVO CC Core Interval Ride [2.5-3.2w/kg avg], EVO CC Flux Ride [1.5 - 2.0w/kg avg], 3R SPARK Steady State Ride [~2.0-2.2 w/kg avg], 3R Octane Interval Ride [~3.2-3.6 w/kg avg], 3R VOLT Interval Ride [~2.6-3.2 w/kg avg], adidas X Parley RFTO: group run, Ride On for Zachary Tour, 3R Watopia - Volcano CCW - 5 Laps, 3R Racing, Macro to Micro, INC HIIT - 30min High Intensity Interval Training, Zwift Time Trial Tuesday: Tempus Fugit, ZZRC Breakfast Club - Ride with Mates, Orange Unicorn, ZSUN RNR, Team Italy PISSEI Race, Monday Run Club, ZLDR Easy 30, adidas X Parley RFTO: group run, 3R Watopia Flat Route Race - 3 Laps (30.3km/18.8mi 162m), Amalgam, ZHQ Steering Race // FutureWorks - Crit City, Flanders Endurance Series, Fearless Ladder for a Faster 5k, ZESP "Topillos", SAS- Pi & Sauce, The Stampede (ITT) by Herd Racing League, 3R Sand & Sequoias - 1 Lap (20km/12.5mi 173m), Lonely Goat Running Club 5K Recovery Run, TBR Knights of Suburbia, Anaerobic Capacity into VO2, PACK SUB2 Down Under, ZHQ Steering Race // FutureWorks - Volcano Circuit, EVO CC Sweet Sirocco Interval Ride [~3.0-3.5w/kg avg], Monday Run Club, Crit City Race, MET-5 Race, HWC Pedal Mafia Social Ride, DIRT Monday Endurance Ride, 3R Watopia Flat Route Race - 4 Laps (41km/25.5mi 216m), DIRTy Dozen Sprint League, Let's Get AERO, EVO CC Sprint Race Series, GRIT Easy Ride, KISS at Base Training Ride, The HERD M2C2, Epictour - Structured Workout, EVR Asia Race, adidas X Parley RFTO: group run, DIRT Monday Morning Blues Ride, 3R Volcano Flat Race - 3 Laps (36.6km/22.7mi 138m), Arise, ZLDR AYOP Hour Run, DIRT Run Club, European Lunch Ride, ZWC Hill Climb Battle, Monday Run Club, Epictour - Structured Workout, British Triathlon Summer Series - Group Ride, MHG Run Club, Slowtwitch Indoors: Group Run, Happy 100k p/b TeamODZ, Fearless Recovery Ride, CHINA ZCRC and TEAM G7 Spicy 100K, Monday DIRT Endurance Ride, Crit City Race, SAZ speed race, Escalation, 3R Innsbruckring Flat Race - 3 Laps (26.4km/16.4mi 231m), Fearless Ladder for a Faster 5k, TTR mini chase, JETT Base Ride (2.7~3.8w/kg), Frenchy Fuzion Recovery Ride with Adrien Vuillier, Epictour - Structured Workout, TTR Steady State 3.6-4.6, Monday News Time Ride, Magnum mOnDayZ RACE presented by Team ODZ, Ascenders Team Monday Slow Roll, Velocity - Dig the Bike Fantastic, ZHQ FutureWorks Crit City Race - Anti-sandbagging, Mindset Monday with Natalia Franco, 3R Volcano Climb Race - 1 Lap (22.4km/14mi 204m), Team Sportslab UK Hard Riders, USMES Back to Work Ride, 3R Ride in support of World Bicycle Relief - Women on Wheels [~2.5 – 3.2 w/kg avg], Epictour - Structured Workout, Ascenders Team Recovery Monday, ZER I'd Rather be Easy Riding with Ray (Est. Av. 1.2 - 1.5 w/kg), Canyon Ranch Group Ride p/b Pinarello, ZHQ FutureWorks Circuit Race - Anti-sandbagging, Ham Sandwich, Crit City Race, 3R Richmond UCI Hilly Race - 1 Lap (16.2km/10.1mi 142m), Monday Run Club, BC Bike Race Social Ride, adidas X Parley RFTO: group run, Fearless Cruisers, MAAP In The Field: USA Group Ride, Lactate Shuttle, 3R Classique Reverse Flat Race - 5 Laps (32km/20.1mi 76m), Group Run 5k, EVO CC Sprint Race Series, Liv Kick Off The Week Ride, Group Run 10k, 3R Volcano Circuit Sprint Flat Race - 1 Lap (6.6km/4.1mi 20m), FZR Segment Killer Race, INC Relentless Steady State, EVO CC Flux Ride [1.5 - 2.0w/kg avg], EVO CC Vamos! 90min Ride [3.5-4w/kg avg], adidas X Parley RFTO: group run, 3R Classique Reverse Flat Race - 4 Laps (26.9km/16.7mi 57m), ZZRC Wrecked Legs - Recovery Ride, Macro to Micro, PETA-Z Social Ride, ZHQ FutureWorks Crit City Race - Anti-sandbagging, EVO CC Sprint Race Series, ZHR Cassie's Race Prep Training Ride, 3R Impact Interval Ride [~3.5-4.0w/kg avg], Men in Glaz - Social Ride, Monday Run Club, Crit City Race, Cocorico Workouts – Bikes France, SZR Evening Joyride, Tullio Zwift Ride-Out (Open), Monday's Mountain Massif TT, Swift Carbon Pro Cycling ride, ZHQ Steering Race // FutureWorks - Crit City, 3R Queens Highway Race - 6 Laps, dPAC Team Recovery for Gavia/Stelvio/Mortirolo (Climbers Epic), Le Col Social Sessions, ZESP "Chinchillas", DBR Monday Race, ZTPL.CC Girls Ride, Rowe & King - Monday Mixer, Kiss Racing Team / FastFitnessTips iTT series, KIRCHMAIR Honeypot Ride, Herd of Mountain Goats, ZHCC Ladies Only 1.5, ZHQ FutureWorks Circuit Race - Anti-sandbagging, ZLDR Recovery 10k, Flanders Monday Blues Ride, Zwift Riders Germany - Afterwork Ride to ZRG-CC - Afterwork Ride, ZZRC SUB 2.0 Ride, KATT Race by WKG, The HERD Kickstart, Team KST "Le Puncheur" Race, Vikings Valhalla Ride with the Valkyries, TugaZ Epic Recovery Ride, Ascenders Team Social Monday, Sledgehammer Inbetweeners Races, The Cyclists' Alliance Community Ride, 3R Bologna Race - 2 Laps, Orange Unicorn, Ventouro Social Group Ride, adidas X Parley RFTO: group run, The Stampede (ITT) by Herd Racing League, TRI247 Manic Monday Time Trial, PACK Social + KOM After Party, TBR HIIT race, Forte Race Series, Bolt Race Team presents BRT Masters Training RACE., ZZRC Happy Hour, Team RWB - Monday Social - Led by Tri Talking Sport & PARC Tri, TEAM VEGAN Rice 'n' Easy, British Triathlon Summer Series - Handicap (Hare & Hounds) Race, 3R Launchpad Ride [~1.0-1.5w/kg avg], XRS Races: Monday's blues, PACK Beginners Step-by-Step, EVR Europe Race, KISS Monday Crit Race Series, GGCC Glasgow Green Cycle Club Race Series, 3R True2 Steady Ride [2.0w/kg avg], Spaded Sweetie, EVO CC Sprint Race Series, Monday Run Club, TBR Sub 2.5 Tuesday, AHDR Bacon Rolls, Team Zwift Tri Oz - Battle Ride AM, Chicks Who Ride Bikes Group Ride, Crit City Race, adidas X Parley RFTO: group run, ZMCC EyeballZ, The Kraken by TeamODZ, WMZ Crit Racing, Tri Aus TT, Bonbon, Fearless Ladder for a Faster 5k, 3R London Loop Hilly Race - 2 Laps (29km/18mi 440m), TTR Party Animal Race, AEO Vamos Amigos - Social Spin, 3R Watopia Flat Route Race - 3 Laps (30.8km/19.1mi 162m), The Grind Finale]
click on Filter-Events button
select sports : cycling
select event-type : Race
select intensities : D 
select start-time : evening
apply filter
[No results.]
validated that zwift events have changed after populating fields and applying filters
Zwift-App Ended...
chrome-browser started...
Starting ChromeDriver 90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}) on port 4031
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
[1622432337.123][WARNING]: This version of ChromeDriver has not been tested with Chrome version 91.
May 30, 2021 8:38:57 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
navigated to Zwift home-page...
click on top_nav button
click on Events
Zwift Events-page is Loaded successfully
Zwift-App Ended...
chrome-browser started...
Starting ChromeDriver 90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}) on port 24132
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
[1622432358.914][WARNING]: This version of ChromeDriver has not been tested with Chrome version 91.
May 30, 2021 8:39:19 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
navigated to Zwift home-page...
content of your choice is present in Zwift home-page
Zwift-App Ended...
chrome-browser started...
Starting ChromeDriver 90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}) on port 22081
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
[1622432372.087][WARNING]: This version of ChromeDriver has not been tested with Chrome version 91.
May 30, 2021 8:39:32 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
navigated to Zwift home-page...
Zwift home-page is Loaded successfully
Zwift-App Ended...
Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 106.422 sec

Results :

Tests run: 5, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  01:50 min
[INFO] Finished at: 2021-05-30T20:39:45-07:00
[INFO] ------------------------------------------------------------------------

