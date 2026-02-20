package Singleton.Logger;

public class Test extends Thread{
    static void main() {
        for (int i = 0; i < 1000; i++) {
            new Test().start();
        }
    }

    public void run(){
        BillPughLogger instance = BillPughLogger.getInstance();
        System.out.println(instance.getName());
    }
}