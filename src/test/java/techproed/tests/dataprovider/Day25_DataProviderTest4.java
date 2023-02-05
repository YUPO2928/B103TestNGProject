package techproed.tests.dataprovider;
import org.testng.annotations.Test;
import techproed.utilities.DataProviderUtils;
public class Day25_DataProviderTest4 {
    //    Bu ornekde, data provider metodumuz Util classdan gelecek

//    musteriVerileri
    @Test(priority = 1, dataProvider = "musteriVerileri",dataProviderClass = DataProviderUtils.class)
    public void musteriVerileriTest(String username,String password, String sube){
        System.out.println("Username : "+ username+". Password : "+password+" . Sube : "+sube);
    }

    //    musteriHizmetleriVerileri
    @Test(priority = 2,dataProvider = "musteriHizmetleriVerileri",dataProviderClass = DataProviderUtils.class)
    public void musteriHizmetleriVerileriTest(String username,String password){
        System.out.println(username+"  |  "+password);

    }
    //    personelVerileri
    @Test(priority = 3, dataProvider = "personelVerileri",dataProviderClass = DataProviderUtils.class)
    public void personelVerileriTest(String username,String password){
        System.out.println(username+"  |  "+password);
    }

   //customerData
   @Test (dataProvider = "customerData", dataProviderClass = DataProviderUtils.class)
   public void customerDataTest(String username, String password){
       System.out.println("EXCEL DATALARIM");
       System.out.println(username + " ||| "+password);



   }



}

// Testler NATURAL ORDER (harf sıralamsı) a göre çalışır. Priority vererek öncelik sırası belirleyebiliriz.