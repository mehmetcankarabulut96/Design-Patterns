package Singleton;

public class Test extends Thread{
    static void main() {
        /*
        // eager
        for (int i = 0; i < 100; i++) {
            EagerInitializationSingleton instance = EagerInitializationSingleton.getInstance();
            System.out.println(instance.hashCode());
        }*/

        /*
        // lazy
        for (int i = 0; i < 300; i++) {
            new Test().start();
        }*/

        /*
        // bill pugh
        for (int i = 0; i < 45; i++) {
            BillPughSingleton instance = BillPughSingleton.getInstance();
            System.out.println(instance.hashCode());
        }*/
    }

    public void run(){
        LazyInitializationSingleton instance = LazyInitializationSingleton.getInstance();
        System.out.println(instance.hashCode());
    }
}