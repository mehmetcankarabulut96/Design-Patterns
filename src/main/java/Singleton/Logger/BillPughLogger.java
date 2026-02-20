package Singleton.Logger;

public class BillPughLogger {

    private String name;
    private static int count = 0;

    private BillPughLogger(){
        count++;
        this.name = "Logger" + count;
    }

    private static class Helper{
        private static final BillPughLogger INSTANCE = new BillPughLogger();
    }

    public static BillPughLogger getInstance(){
        return Helper.INSTANCE;
    }

    public String getName(){
        return this.name;
    }
}