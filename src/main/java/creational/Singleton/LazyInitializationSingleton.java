package creational.Singleton;

/**
 * Lazy initialization singleton, INSTANCE == null ile nesne ilk ihtiyaç duyulduğu anda oluşturulur, ondan sonraki isteklere aynı nesne verilir.
 * Buradaki problem birden fazla thread aynı anda INSTANCE nesnesini null olarak görebilir, böylece birden fazla nesne oluşma ihtimali vardır.
 * Çözüm olarak null kontrolü ve nesne oluşturma kodlarının locklanarak aynı anda sadece bir thread tarafından çalıştırılmasını sağlayabiliriz (thread safe)
 */
public class LazyInitializationSingleton {
    private static LazyInitializationSingleton INSTANCE;

    private LazyInitializationSingleton(){};

    public static LazyInitializationSingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new LazyInitializationSingleton();
        }

        return INSTANCE;
    }
}