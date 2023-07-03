package behavioralPatterns.chainOfResponsibility;

public class Demo {

    public static void main(String[] args) {
        // create command pipeline Authenticator -> Logger -> Encrypter -> Analyzer
        Handler analyzer = new Analyzer(null);
        Handler encrypter = new Encrypter(analyzer);
        Handler logger = new Logger(encrypter);
        Handler authenticator = new Authenticator(logger);

        // create a server instance
        Server server = new Server(authenticator);
        server.handle(new Request("admin", "123", 45, 100));

    }
}
