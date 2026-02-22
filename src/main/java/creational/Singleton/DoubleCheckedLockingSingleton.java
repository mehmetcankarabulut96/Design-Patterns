package creational.Singleton;

/**
 * Double-checked locking singleton, INSTANCE null olmadığı zamanlarda gelen tüm threadlar ilk null kontrolünden geçemeyecek ve return edecektir.
 * Bu yapı thread güvenliği sağlar ancak kurması karmaşıktır. Volatile,synchronized veya if yapılarından biri yanlış kullanılırsa sistem sağlıklı çalışmaz.
 * Çözüm olarak thread-safe lazy load yapısını manuel kurmak yerine private static inner class kullanabiliriz (Bill Pugh creational.Singleton)
 */
public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton INSTANCE;

    private DoubleCheckedLockingSingleton(){};

    public static DoubleCheckedLockingSingleton getInstance(){
        if(INSTANCE == null){
            synchronized (DoubleCheckedLockingSingleton.class){
                if(INSTANCE == null){
                    INSTANCE = new DoubleCheckedLockingSingleton();
                }
            }
        }

        return INSTANCE;
    }
}