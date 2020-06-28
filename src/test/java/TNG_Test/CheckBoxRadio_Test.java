package TNG_Test;

import PageObjects.DatePickerPage;
import PageObjects.JQueryHPage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBoxRadio_Test {

   WebDriver driver;
     String baseUrl;
     JQueryHPage jQueryHPage;
     DatePickerPage datePickerPage;


     @BeforeClass
      public  void SetUp(){
         System.setProperty("webdriver.chrome.driver","C:\\DriversSelenium LB\\chromedriver.exe");
         baseUrl="https://jqueryui.com/";
         driver=new ChromeDriver();
         jQueryHPage=new JQueryHPage(driver);
         datePickerPage=new DatePickerPage(driver);
         driver.manage().window().maximize();
         driver.get(baseUrl);

      }


     @AfterClass
     public  void tearDown(){
         driver.quit();
     }

     @Test
    public  void SelectDateTest() throws InterruptedException {
         jQueryHPage.clickDatePicker();
         jQueryHPage.switchFrame();
         datePickerPage.clickDatePick();
        // System.setProperty("date","5");
        // datePickerPage.GetAllDates("4");
         datePickerPage.getAllDates(System.getProperty("date"));
         Thread.sleep(5000);

     }


}
