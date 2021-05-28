import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * This the Zwift-Home Page-class, which extends main base-class
 * store all necessary Home-Page web-elements here
 */
public class HomePageClass extends BaseTestSetup{

    WebElement top_nav = webDriver.findElement(By.xpath("//header/div[1]/nav[1]/ul[2]/li[4]/button[1]/*[1]"));
    WebElement events_button = webDriver.findElement(By.xpath("//span[@class='_2TTnY4YQX0BYPA64IEp4tW'][contains(.,'Events')]"));

    //to invoke BaseTestSetup class constructor
    public HomePageClass(){
        super();
    }
}
