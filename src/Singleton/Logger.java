package Singleton;

public class Logger {

    private static Logger soleInstance;
    private String fileName;

    private Logger(String fileName) {
        this.fileName = fileName;
        System.out.println("Logger Created");
    }

    public static Logger getLogger() {
        if (soleInstance == null) {
            soleInstance = new Logger("file.txt");
            System.out.println("Create new Logger");
        } else {
            System.out.println("You already have a logger");
        }
        return soleInstance;
//        return soleInstance;
    }
}
