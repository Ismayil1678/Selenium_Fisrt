package AppTesting;

import AppCode.App_For_Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Junit_App_Test {
    App_For_Test app=new App_For_Test();

    @Test
    public  void Test1(){
        int index= app.SumNumber(1,2);
        Assertions.assertEquals(index,4,"sum mismatch");
        System.out.println("@Test1: first assertion complete");

    }
    @Test
    public  void Test2(){
        String text=app.AddString("HTML","Java");
        Assertions.assertEquals(text,"HTML"+"__"+"Java","Add String");
        System.out.println("@Test1: first assertion complete");
        Assertions.assertEquals(text ,"Selenium"+"__"+"Java","Add String");
        System.out.println("@Test1: second assertion complete  ");
    }
    @Test
    public  void Test3() {
        int arr[] = app.GetArray();
        Assertions.assertEquals(arr, new int[]{1, 2, 3}, "add Array");
        System.out.println("@Test1: first assertion complete");
        Assertions.assertEquals(arr, new int[]{4, 5, 6}, "Add String");
        System.out.println("@Test1: second assertion complete  ");
    }





}
