package Singleton;

/**
 * Thread safe singleton,synchronized kullanılarak null kontrolü ve nesne oluşturma satırları locklanmıştır.
 * Böylece bu kod satırları aynı anda sadece bir thread tarafından çalıştırılabilir.
 * Ancak burada bir performans eksiği vardır: INSTANCE null değilse bile tüm threadlar senkron olarak null check yapar.
 * Eğer INSTANCE null değilse thread lock yapmamalıdır, bunun için bir if kontrolü daha ekleyebiliriz (double-checked locking)
 */
public class ThreadSafeLazySingleton {
    private static ThreadSafeLazySingleton INSTANCE;

    private ThreadSafeLazySingleton(){};

    public static ThreadSafeLazySingleton getInstance(){
        synchronized (ThreadSafeLazySingleton.class){
            if(INSTANCE == null){
                INSTANCE = new ThreadSafeLazySingleton();
            }
        }

        return INSTANCE;
    }
}