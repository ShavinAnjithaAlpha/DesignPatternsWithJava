package behavioralPatterns.chainOfResponsibility;

public class Logger extends Handler {
    protected Logger(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean doHandle(Request request) {
        System.out.printf("Logged: request from %s -> itemCode: %d, Count: %d%n%n",
                request.getUserName(), request.getItemCode(), request.getCount());
        return false;
    }
}
