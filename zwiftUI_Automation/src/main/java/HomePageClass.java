import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * This the Zwift-Home Page-class, which extends main base-class
 * store all necessary Home-Page web-elements and its functions here
 */
public class HomePageClass extends BaseTestSetup{

    WebElement top_nav = webDriver.findElement(By.xpath("//header/div[1]/nav[1]/ul[2]/li[4]/button[1]/*[1]"));
    WebElement events_button = webDriver.findElement(By.xpath("//span[@class='_2TTnY4YQX0BYPA64IEp4tW'][contains(.,'Events')]"));

    //to invoke BaseTestSetup class constructor
    public HomePageClass(){
        super();
    }

    /**
     * This method will return true if home-page loads successfully
     * and return false if not
     */
    public boolean isHomePageLoadedSuccessfully() {
        if (isPageLoaded() == true && webDriver.getCurrentUrl().equals("https://www.zwift.com/")) {
            System.out.println("Zwift home-page is Loaded successfully");
            return true;
        } else {
            System.out.println("Zwift home-page is not Loaded successfully");
            return false;
        }
    }

    /**
     * This method will return true if ContentOfYourChoice = "Try free for 7 days"
     * is present in home-page and return false if not
     */
    public boolean isContentOfYourChoicePresent(){
        if (webDriver.getPageSource().contains("Try free for 7 days")){
            System.out.println("content of your choice is present in Zwift home-page");
            return true;
        } else {
            System.out.println("content of your choice is not present in Zwift home-page");
            return false;
        }
    }
}
