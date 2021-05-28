import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * This the Zwift-Events Page-class, which extends main base-class
 * store all necessary Events-Page web-elements here
 */
public class EventsPageClass extends BaseTestSetup {

    WebElement filterEvents_button = webDriver.findElement(By.xpath("//button[@type='button'][contains(.,'Filter events')]"));
    WebElement sports_Cycling = webDriver.findElement(By.xpath("//button[@type='button'][contains(.,'Cycling')]"));
    WebElement eventsType_Fondo = webDriver.findElement(By.xpath("//button[@type='button'][contains(.,'Fondo')]"));
    WebElement intensities_B = webDriver.findElement(By.xpath("//button[@type='button'][contains(.,'B')]"));
    WebElement startTimes_Morning = webDriver.findElement(By.xpath("//button[@type='button'][contains(.,'Morning')]"));
    WebElement applyFilters = webDriver.findElement(By.xpath("//span[@class='button-label'][contains(.,'apply filters')]"));

    //to invoke BaseTestSetup class constructor
    public EventsPageClass(){
        super();
    }
}
