package Singleton.Logger;

public class AppLogger {

    private static int count = 0;
    private String name;
    private static AppLogger instance;

    private AppLogger(){
        this.name = "Logger" + count;
        count++;
    }

    public static AppLogger getInstance(){
        synchronized (AppLogger.class){
            if(instance == null){
                try{
                    Thread.sleep(10);
                } catch (InterruptedException _){

                }

                instance = new AppLogger();
            }
        }

        return instance;
    }

    public String getName(){
        return this.name;
    }
}