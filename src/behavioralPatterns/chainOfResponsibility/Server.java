package behavioralPatterns.chainOfResponsibility;

public class Server {

    private final Handler handler;

    public Server(Handler handler) {
        this.handler = handler;
    }

    public void handle(Request request) {
        handler.handle(request);
    }
}
