package stepDefs;

import Managers.DriverMgr;
import PageObjects.CheckBoxPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;


public class CheckBoxRadioDefs {
    CheckBoxPage checkBoxRadioPage = new CheckBoxPage(DriverMgr.getDriver());


    @And("^I validate number of (\\w+) is (\\d+)$")
    public void validate_radios_number(String type, int radios) {
        Assertions.assertEquals(radios,checkBoxRadioPage.elementSize(type));
        System.out.println("completed number of elements validation");
    }

    @And("^I select \"(.*)\" radio button$")
    public void select_radio(String city) throws Throwable {
        Assertions.assertTrue(checkBoxRadioPage.selectRadio(city));
        System.out.println("completed selecting radio");

    }

}