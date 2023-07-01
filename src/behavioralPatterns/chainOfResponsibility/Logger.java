package behavioralPatterns.chainOfResponsibility;

public class Logger extends Handler {
    protected Logger(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean doHandle(Request request) {
        System.out.println(String.format("Logged: request from %s -> itemCode: %d, Count: %d%n",
                request.getUserName(), request.getItemCode(), request.getCount()));
        return false;
    }
}
