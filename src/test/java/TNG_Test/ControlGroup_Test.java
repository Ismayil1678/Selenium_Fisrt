package TNG_Test;

import PageObjects.ControlGroupPage;
import PageObjects.JQueryHPage;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ControlGroup_Test {

     WebDriver driver;
     String baseUrl;
     JQueryHPage jQueryHPage;
     ControlGroupPage controlGroupPage;


     @BeforeClass
      public  void SetUp(){
         System.setProperty("webdriver.chrome.driver","C:\\DriversSelenium LB\\chromedriver.exe");
         baseUrl="https://jqueryui.com/";
         driver=new ChromeDriver();
         jQueryHPage=new JQueryHPage(driver);
         controlGroupPage=new ControlGroupPage(driver);
         driver.manage().window().maximize();
         driver.get(baseUrl);

      }


     @AfterClass
     public  void tearDown(){
         driver.quit();
     }

     @Test
    public  void ClickControlGroup(){
         jQueryHPage.clickCtrlGroup();
         jQueryHPage.switchFrame();
         Assert.assertEquals( controlGroupPage.headerText(),"Controlgroup");

     }



}
