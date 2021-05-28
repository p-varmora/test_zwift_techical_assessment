import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This the Zwift Home-Page Test-class, which extends main base-class
 * create and validate Home-page test scenarios here
 */
public class HomePageTest extends BaseTestSetup{

    //to invoke BaseTestSetup class constructor
    public HomePageTest(){ super();}

    @Test
    /*
    Test Scenario#1 : validate that Home-Page loads successfully

    Automation Steps :
    1.Launch the web-browser and navigate to home-page
    2.Validate that Page url is "https://www.zwift.com/" and entire-page is loaded successfully
    3.Terminate the web-browser
    */
    public void validate_zwiftHomePageLoads(){
        initializingWebBrowser();
        navigatingToZwiftHomePage();

        Assert.assertTrue(isHomePageLoadedSuccessfully());

        closeZwiftApp();

    }

    @Test
    /*
    Test Scenario#2 : validate that content of your choice is present in home-page

    Automation Steps :
    1.Launch the web-browser and navigate to home-page
    2.Validate that "Try free for 7 days" is present in page-source
    5.Terminate the web-browser
    */
    public void validate_contentOfYourChoicePresent(){
        initializingWebBrowser();
        navigatingToZwiftHomePage();

        Assert.assertTrue(isContentOfYourChoicePresent());

        closeZwiftApp();

    }

    /**
     * This method will return true if home-page loads successfully
     * and return false if not
     */

    private boolean isHomePageLoadedSuccessfully() {
        if (isPageLoaded() == true && webDriver.getCurrentUrl().equals("https://www.zwift.com/")) {
            System.out.println("Zwift home-page is Loaded successfully");
            return true;
        } else {
            System.out.println("Zwift home-page is not Loaded successfully");
            return false;
        }
    }

    /**
     * This method will return true if ContentOfYourChoice "Try free for 7 days" is
     * present in home-page and return false if not
     */
     private boolean isContentOfYourChoicePresent(){
            if (webDriver.getPageSource().contains("Try free for 7 days")){
                System.out.println("content of your choice is present in Zwift home-page");
                return true;
            } else {
                System.out.println("content of your choice is not present in Zwift home-page");
                return false;
            }
     }
}










