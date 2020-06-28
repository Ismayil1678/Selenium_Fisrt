package stepDefs;

import Managers.DriverMgr;
import PageObjects.DatePickerPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class DatePickerDefs {

    @When("I validate date selection")
    public void date_selection(){
        WebDriver driver = DriverMgr.getDriver();
        DatePickerPage datepickerPage = new DatePickerPage(driver);
        System.out.println("inside date selection");
        datepickerPage.clickDatePick();
        datepickerPage.getAllDates("15");
    }
}