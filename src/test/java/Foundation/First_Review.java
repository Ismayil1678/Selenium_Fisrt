package Foundation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * In this class I will demo how to execute/run Selenium  test
 * without using WebDriverManager  and using  java main method;
 * @Autohor  ismayil Eyvazov
 */


public class First_Review {
    public static void main(String[] args) {

        //Tells the  system where the chromedriver executable is located;
        System.setProperty("webdriver.chrome.driver","C:\\DriversSelenium LB\\chromedriver.exe");

        //Create a Webdriver object;
        WebDriver driver=new ChromeDriver();

        //Open the website or go to the Url page
       // driver.get("https://the-internet.herokuapp.com/");

         /*driver.get() is used  to navigate particular Url (website) and wait till page load

           driver.navigate().to is used navigate particular Url and does not wait until to load page.
           It ,maintains browser  history or cookies to navigate  back or forward*/
           //driver.navigate().to("https://the-internet.herokuapp.com/");
           //driver.navigate().back();
           //driver.navigate().forward();




       //At the end of the test kill the browser;
         driver.quit();




    }

}
