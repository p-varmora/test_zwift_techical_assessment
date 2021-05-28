import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

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

        Assert.assertTrue(isEventsPageLoadedSuccessfully());

        closeZwiftApp();
    }

    @Test
     /*
    Test Scenario#2 : validate that Events have changed after populating fields and applying filters

    Automation Steps :
    1.Launch the web-browser and navigate to home-page
    2.Click on top_nav button
    3.Click on Events (user will navigate to Events Page)
    4.Store the page source in zwiftEvents string-variable which will contains events
    5.Click on Filter-Events button
    6.Select sports : cycling
    7.Select event-type : fondo
    8.Select intensities : cycling
    9.Select start-time : cycling
    10.Apply filter
    11.Store the page-source in zwiftEvents_applyingFilter string-variable
    12.Validate that Zwift -Events have changed after populating fields and applying filters
    5.Terminate the web-browser
    */
    public void validate_zwiftEventsAfterPopulatingFilters(){
        initializingWebBrowser();
        navigatingToZwiftHomePage();

        homePageClass = new HomePageClass();

        Reporter.log("click on top_nav button", true);
        clickOn(homePageClass.top_nav, 20);

        Reporter.log("click on Events", true);
        clickOn(homePageClass.events_button, 20);

        //storing events page-source in zwiftEvents before populateTheFieldsAndApplyFilters
        String zwiftEvents = null;
        if (webDriver.getCurrentUrl().contains("https://www.zwift.com/events")) {
            zwiftEvents = webDriver.getPageSource();
        } else {
            closeZwiftApp();
        }

        eventsPageClass = new EventsPageClass();

        Reporter.log("click on Filter-Events button", true);
        clickOn(eventsPageClass.filterEvents_button, 20);

        populateTheFieldsAndApplyFilters();

        //storing events page-source in zwiftEvents_applyingFilter after populateTheFieldsAndApplyFilters
        String zwiftEvents_applyingFilter = webDriver.getPageSource();

        Reporter.log("validated that zwift events have changed after populating fields and applying filters", true);
        Assert.assertNotEquals(zwiftEvents, zwiftEvents_applyingFilter);

        closeZwiftApp();
    }

    /**
     * This method will return true if Events-page loads successfully
     * and return false if not
     */
    private boolean isEventsPageLoadedSuccessfully() {
        if (isPageLoaded() == true && webDriver.getCurrentUrl().equals("https://www.zwift.com/events")) {
            System.out.println("Zwift Events-page is Loaded successfully");
            return true;
        } else {
            System.out.println("Zwift Events-page is not Loaded successfully");
            return false;
        }
    }

    /**
     * This method will populate the Sports, Event-type, Intensities,
     * and Start Times fields and apply the filter
     */
    private void populateTheFieldsAndApplyFilters(){
        Reporter.log("select sports : cycling", true);
        clickOn(eventsPageClass.sports_Cycling, 5);
        Reporter.log("select event-type : fondo", true);
        clickOn(eventsPageClass.eventsType_Fondo, 5);
        Reporter.log("select intensities : B ", true);
        clickOn(eventsPageClass.intensities_B, 5);
        Reporter.log("select start-time : Morning", true);
        clickOn(eventsPageClass.startTimes_Morning, 5);
        Reporter.log("apply filter", true);
        clickOn(eventsPageClass.applyFilters, 5);
    }
}
