package Singleton;

/**
 * Eager initialization singleton, uygulama çalıştığı zaman bir kez bellekte oluşturulur, getInstance ile aynı nesne verilir.
 * Ancak bu nesneyi oluşturmak pahalı ise veya hiç kullanılmayacak bir nesne ise bellek israfı yapılmış olur.
 * Buna çözüm olarak nesneyi ilk istendiği zaman oluşturabiliriz (lazy).
 */
public class EagerInitializationSingleton {
    private static final EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton();

    private EagerInitializationSingleton(){};

    public static EagerInitializationSingleton getInstance(){
        return INSTANCE;
    }
}