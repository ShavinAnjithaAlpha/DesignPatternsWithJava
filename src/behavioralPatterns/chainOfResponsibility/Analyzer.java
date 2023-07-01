package behavioralPatterns.chainOfResponsibility;

public class Analyzer extends Handler {
    protected Analyzer(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean doHandle(Request request) {
        System.out.println("Analyze the request...");
        return false;
    }
}
