package Singleton.Logger;

public class Test extends Thread{
    static void main() {
        for (int i = 0; i < 1000; i++) {
            new Test().start();
        }
    }

    public void run(){
        AppLogger instance = AppLogger.getInstance();
        System.out.println(instance.getName());
    }
}