package Singleton.Logger;

public class Test {
    static void main() {
        AppLogger instance1 = AppLogger.getInstance();
        AppLogger instance2 = AppLogger.getInstance();

        System.out.println(instance1 == instance2);
    }
}