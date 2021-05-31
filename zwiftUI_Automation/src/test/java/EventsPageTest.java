import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import java.util.List;

/**
 * This the Zwift Events-Page Test-class, which extends main base-class
 * create and validate Events-page test scenarios here
 */
public class EventsPageTest extends BaseTestSetup{
    private EventsPageClass eventsPageClass ;
    private HomePageClass homePageClass ;

    //to invoke BaseTestSetup class constructor
    public EventsPageTest(){
        super();
    }

    @Test
    /*
    Test Scenario#1 : validate that Events-Page loads successfully

    Automation Steps :
    1.Launch the web-browser and navigate to home-page
    2.Click on top_nav button
    3.Click on Events
    4.Validate that Page url is "https://www.zwift.com/events" and entire-page is loaded successfully
    5.Terminate the web-browser
    */

    public void validate_zwiftEventsPageLoads(){
        initializingWebBrowser();
        navigatingToZwiftHomePage();

        homePageClass = new HomePageClass();

        Reporter.log("click on top_nav button", true);
        clickOn(homePageClass.top_nav, 30);

        Reporter.log("click on Events", true);
        clickOn(homePageClass.events_button, 30);
        eventsPageClass = new EventsPageClass();

        Assert.assertTrue(eventsPageClass.isEventsPageLoadedSuccessfully());

        closeZwiftApp();
    }

    @Test
     /*
    Test Scenario#2 : validate that Events have changed after populating fields and applying filters

    Automation Steps :
    1.Launch the web-browser and navigate to home-page
    2.Click on top_nav button
    3.Click on Events (user will navigate to Events Page)
    4.Store the List of events in eventLists
    5.Click on Filter-Events button
    6.Select sports : cycling
    7.Select event-type : fondo
    8.Select intensities : B
    9.Select start-time : Morning
    10.Apply filter
    11.Store the List of events in afterPopulatingFields_EventsList
    12.Validate that Zwift -Events have changed after populating fields and applying filters
    13.Terminate the web-browser
    */
    public void validate_zwiftEventsAfterPopulatingFilters_NoResults() {
        initializingWebBrowser();
        navigatingToZwiftHomePage();

        homePageClass = new HomePageClass();

        Reporter.log("click on top_nav button", true);
        clickOn(homePageClass.top_nav, 20);

        Reporter.log("click on Events", true);
        clickOn(homePageClass.events_button, 20);


        eventsPageClass = new EventsPageClass();
        List<String> eventLists = eventsPageClass.listOFEvents();
        Reporter.log("click on Filter-Events button", true);
        clickOn(eventsPageClass.filterEvents_button, 20);

        eventsPageClass.populateTheFieldsAndApplyFilters_NoResults();

        List<String> afterPopulatingFields_EventsList = eventsPageClass.listOFEvents();


        Reporter.log("validated that zwift events have changed after populating fields and applying filters", true);
        Assert.assertNotEquals(eventLists, afterPopulatingFields_EventsList);

        closeZwiftApp();
    }

    @Test
     /*
    Test Scenario#3 : validate that Events have changed after populating fields and applying filters

    Automation Steps :
    1.Launch the web-browser and navigate to home-page
    2.Click on top_nav button
    3.Click on Events (user will navigate to Events Page)
    4.Store the List of events in eventLists
    5.Click on Filter-Events button
    6.Select sports : Cycling
    7.Select event-type : Race
    8.Select intensities : D
    9.Select start-time : evening
    10.Apply filter
    11.Store the List of events in afterPopulatingFields_EventsList
    12.Validate that Zwift -Events have changed after populating fields and applying filters
    13.Terminate the web-browser
    */
    public void validate_zwiftEventsAfterPopulatingFilters_forCycling() {
        initializingWebBrowser();
        navigatingToZwiftHomePage();

        homePageClass = new HomePageClass();

        Reporter.log("click on top_nav button", true);
        clickOn(homePageClass.top_nav, 20);

        Reporter.log("click on Events", true);
        clickOn(homePageClass.events_button, 20);


        eventsPageClass = new EventsPageClass();
        List<String> eventLists = eventsPageClass.listOFEvents();
        Reporter.log("click on Filter-Events button", true);
        clickOn(eventsPageClass.filterEvents_button, 20);

        eventsPageClass.populateTheFieldsAndApplyFilters_eveningCycling();

        List<String> afterPopulatingFields_EventsList = eventsPageClass.listOFEvents();


        Reporter.log("validated that zwift events have changed after populating fields and applying filters", true);
        Assert.assertNotEquals(eventLists, afterPopulatingFields_EventsList);

        closeZwiftApp();
    }


}





