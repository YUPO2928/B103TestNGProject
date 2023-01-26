package techproed.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day20_SoftAssertion {

     @Test
    public void softAssertTest(){

         //1. SoftAssert objesi olustur.
         SoftAssert softAssert = new SoftAssert();

         System.out.println("Satır 14");
         softAssert.assertEquals(2,5); //FAIL

         System.out.println("Satır 16");
         softAssert.assertTrue("JAVA".contains("U")); //FAIL

         System.out.println("Satır 18");
         softAssert.assertTrue(true);//PASS

         System.out.println("Satır 20");
         softAssert.assertAll(); // PASS yada FAIL olarak assertıon ları işaretler.


     }
}
