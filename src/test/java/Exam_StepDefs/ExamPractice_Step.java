package Exam_StepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class ExamPractice_Step {

    @When( "^First I read parameter \"(.*)\"$")
    public  void I_Read_Para(String para){
        System.out.println("Parameter is: "+para);

    }

    @When("I put login with \"(.*)\" Id and \"(.*)\" password$")
    public  void MultiPara(String UserId,String password){
        System.out.println("UserId: " + UserId);
        System.out.println("Password is: "+password);
    }

    @When( "^I put login with (\\w+) Id and (\\w+) password")
    public  void WordParam(String id,String password){
        System.out.println("User ID"+id);
        System.out.println("Password is: "+password);
    }


    @When("^Int parameter (\\d+)$")
    public  void IntParameter(int parameter){
        System.out.println("int parameter is: "+parameter);
    }

    @When("^Double parameter (\\d+.\\d+)$")
    public  void DoubleParameter(double parameter){
        System.out.println("double parameter is: "+parameter);
    }
     @When("^I select (BWN|Honda|Mercedes) button$")
    public  void Limitpara(String parameter){
         System.out.println("Parameter is: "+parameter);

     }
     @When("^I read (\\w+) book$")
    public  void I_ReadBook(String param,Map<String,String>MapList){
         System.out.println("\t\nParam is: "+param);
         for (Map.Entry<String,String>list:MapList.entrySet()){
             System.out.println("Key is"+list.getKey());
             System.out.println("Value is: "+list.getValue());
         }
     }

     @When("^I  print all Book$")
    public  void PrintAllBook(DataTable book){
       List<Map<String,String>>MapList=book.asMaps(String.class,String.class);
        for (Map<String,String>list1:MapList){
            System.out.println("\r\n");
            for (Map.Entry<String,String>AllList:list1.entrySet()){
                System.out.println("Key List: "+AllList.getKey()+":"+AllList.getValue());
            }
        }
     }



}
