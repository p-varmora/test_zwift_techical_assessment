import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

/**
 * This the main class for page object model, where will
 * create Web-driver object
 * pass Zwift Home-page URL
 * initiate chrome browser (pre-req: chromedriver install in usr/local/bin)
 * terminate chrome browser
 * add generic methods like acceptCookiesPolicy(), clickOn()
 */

public class BaseTestSetup{
    public static WebDriver webDriver;
    public static String zwiftHomePageURL = "https://zwift.com";
    private static JavascriptExecutor javascriptExecutor;

    /**
     * This method will launch the chrome-browser,
     * maximize it and
     * delete all cookies
     */
    public static void initializingWebBrowser(){
        Reporter.log("chrome-browser started...", true);
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
    }

    /**
     * This method will navigate to Zwift Home-page,
     * and accept cookies policy
     */
    public static void navigatingToZwiftHomePage(){
        Reporter.log("navigated to Zwift home-page...", true);
        webDriver.navigate().to(zwiftHomePageURL);
        acceptCookiesPolicy();
    }

    /**
     * This method will terminate chrome-browser
     */
    public static void closeZwiftApp(){
        webDriver.quit();
        Reporter.log("Zwift-App Ended...", true);
    }

    /**
     * This method will hold off on responding to a webdriver.navigate().to() call
     * until the document ready state is complete
     * This will make selenium web-driver to wait for the entire page is loaded
     */
    public static boolean isPageLoaded() {
        javascriptExecutor = (JavascriptExecutor) webDriver;
        return (javascriptExecutor.executeScript("return document.readyState").toString().equals("complete"));
    }

    /**
     * This method will allow user to navigate to Zwift Home-page,
     * and accept cookies policy
     */
    private static void acceptCookiesPolicy() {
        clickOn( webDriver.findElement(By.xpath("//button[text()='Accept All']")), 5);
        webDriver.switchTo().defaultContent();
    }

    /**
     * This method will click on web-element as long as the condition returns a truthy value,
     * it will keep trying and waiting until the timeout of the wait is elapsed
     */
    public static void clickOn(WebElement webElement, int timeout){
        new WebDriverWait(webDriver, timeout).until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }
}