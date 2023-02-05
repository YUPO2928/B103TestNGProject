package techproed.utilities;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ListenersRetryAnalyzer implements IAnnotationTransformer {
    //BU SINIFIN AMACI : TUM FAILE TEST CASE LERI BİR KEZ DAHA OTOMATIK OLARAK XML FILE ILE RUN ETMEK.
    //BU SINIF ListenersRetry sınıfını XML de kullanabilmek için oluşturuldu.
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
    // Bu sınıf ListenersRetry  util classına baglıdır.
        annotation.setRetryAnalyzer(ListenersRetry.class);
    }
}
