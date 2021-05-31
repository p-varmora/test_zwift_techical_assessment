import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import java.util.ArrayList;
import java.util.List;

/**
 * This the Zwift-Events Page-class, which extends main base-class
 * store all necessary Events-Page web-elements and its functions here
 */
public class EventsPageClass extends BaseTestSetup {

    WebElement filterEvents_button = webDriver.findElement(By.xpath("//button[@type='button'][contains(.,'Filter events')]"));
    WebElement sports_Cycling = webDriver.findElement(By.xpath("//button[@type='button'][contains(.,'Cycling')]"));
    WebElement eventsType_Fondo = webDriver.findElement(By.xpath("//button[@type='button'][contains(.,'Fondo')]"));
    WebElement eventsType_Race = webDriver.findElement(By.xpath("//button[@type='button'][contains(.,'Race')]"));

    WebElement intensities_B = webDriver.findElement(By.xpath("//button[@type='button'][contains(.,'B')]"));
    WebElement intensities_D = webDriver.findElement(By.xpath("//button[@type='button'][contains(.,'D')]"));
    WebElement startTimes_Morning = webDriver.findElement(By.xpath("//button[@type='button'][contains(.,'Morning')]"));
    WebElement startTimes_Evening = webDriver.findElement(By.xpath("//button[@type='button'][contains(.,'Evening')]"));

    WebElement applyFilters = webDriver.findElement(By.xpath("//span[@class='button-label'][contains(.,'apply filters')]"));
    List<WebElement> eventsList = webDriver.findElements(By.className("header-title"));


    //to invoke BaseTestSetup class constructor
    public EventsPageClass() {
        super();
    }


    /**
     * This method will return true if Events-page loads successfully
     * and return false if not
     */
    public boolean isEventsPageLoadedSuccessfully() {
        if (isPageLoaded() == true && webDriver.getCurrentUrl().equals("https://www.zwift.com/events")) {
            System.out.println("Zwift Events-page is Loaded successfully");
            return true;
        } else {
            System.out.println("Zwift Events-page is not Loaded successfully");
            return false;
        }
    }

    /**
     * This method will populate the Cycling Sports, Event-type = fondo, Intensities =B,
     * and Start Times = Norning,  fields and apply the filter
     */
    public void populateTheFieldsAndApplyFilters_NoResults() {
        Reporter.log("select sports : cycling", true);
        clickOn(sports_Cycling, 10);
        Reporter.log("select event-type : fondo", true);
        clickOn(eventsType_Fondo, 10);
        Reporter.log("select intensities : B ", true);
        clickOn(intensities_B, 5);
        Reporter.log("select start-time : Morning", true);
        clickOn(startTimes_Morning, 5);
        Reporter.log("apply filter", true);
        clickOn(applyFilters, 5);
    }

    /**
     * This method will populate the Cycling Sports, Event-type = Race, Intensities =D,
     * and Start Times = evening fields and apply the filter
     */
    public void populateTheFieldsAndApplyFilters_eveningCycling() {
        Reporter.log("select sports : cycling", true);
        clickOn(sports_Cycling, 10);
        Reporter.log("select event-type : Race", true);
        clickOn(eventsType_Race, 10);
        Reporter.log("select intensities : D ", true);
        clickOn(intensities_D, 5);
        Reporter.log("select start-time : evening", true);
        clickOn(startTimes_Evening, 5);
        Reporter.log("apply filter", true);
        clickOn(applyFilters, 5);
    }



    /**
     * This method will return list of events
     */
    public List<String> listOFEvents() {
        List<String> eventList = new ArrayList<>();
        try {
            if (webDriver.findElement(By.xpath("//div[@class='header-title'][contains(.,'No results.')]"))
                    .isDisplayed() == true) {
                WebElement eventListNoResults = webDriver.findElement(By
                        .xpath("//div[@class='header-title'][contains(.,'No results.')]"));
                eventList.add(eventListNoResults.getText());
            }
        } catch (NoSuchElementException elementDoesNotExist) {
            List<WebElement> eventsList = webDriver.findElements(By.className("header-title"));
            for (WebElement webElement : eventsList) {
                eventList.add(webElement.getText());
            }
        }
        System.out.println(eventList.toString());
        return eventList;
    }


}

