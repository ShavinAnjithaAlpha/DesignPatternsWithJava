package behavioralPatterns.chainOfResponsibility;

public abstract class Handler {

    private final Handler nextHandler;

    protected Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if (doHandle(request))
            return;

        if (nextHandler != null)
            nextHandler.handle(request);
    }

    protected abstract boolean doHandle(Request request);
}
