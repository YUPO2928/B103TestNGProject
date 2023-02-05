
package techproed.utilities;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class ListenersRetry implements IRetryAnalyzer {
    //    BU SINIF SADECE FAIL OLAN TEST CASELERE TEKRAR CALISTIRIR
    private int retryCount = 0;
    private static final int maxRetryCount = 3;
    //    maxRetryCount EK OLARAK CALISMA SAYISI. BU ORNEKDE FAIL OLNA TESTLER EXTRA 1 KEZ DAHA CALISIR
    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}
// 1. Util Class olustur : ListenersRetry
// 2. Test sinifi olustur : ListenersTest3.  Listeners Retry i iliskilendir : @Test(retryAnalyzer = techproed.utilities.ListenersRetry.class)
// 3. Sonuc : Eger herhangi bir test case FAIL olursa, bu test case 3 kez data run edilecektir.
