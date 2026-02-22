package creational.Singleton;

/**
 * Bill Pugh creational.Singleton: JAVA da tüm sınıflar lazy olarak yüklenir. Böylece voliatile ve lock kullanmadan inner class ile nesneyi lazy yükleyebiliriz.
 * Ayrıca JVM sınıfı yüklerken lock kullandığı için doğal olarak thread safe olur ve sınıfın içindeki static nesne oluşmadan başka bir thread araya giremez.
 * Ancak burada da bir problem var: Bir sınıfın constructoru private olsa bile reflection ile o metoda erişip yeni bir nesne oluşturulabilir.
 * Çözüm olarak enum kullanabiliriz, enumlar yapısı gereği reflection ile oluşturulamazlar.
 */
public class BillPughSingleton {

    private BillPughSingleton(){}

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}