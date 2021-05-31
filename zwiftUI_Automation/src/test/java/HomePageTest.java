import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This the Zwift Home-Page Test-class, which extends main base-class
 * create and validate Home-page test scenarios here
 */
public class HomePageTest extends BaseTestSetup{
    private HomePageClass homePageClass ;
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

        homePageClass = new HomePageClass();
        Assert.assertTrue(homePageClass.isHomePageLoadedSuccessfully());

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

        homePageClass = new HomePageClass();
        Assert.assertTrue(homePageClass.isContentOfYourChoicePresent());

        closeZwiftApp();

    }

}










