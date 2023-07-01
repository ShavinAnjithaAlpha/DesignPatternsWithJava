package behavioralPatterns.chainOfResponsibility;

public class Encrypter extends Handler {
    protected Encrypter(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean doHandle(Request request) {
        System.out.println("Encrypt the request...");
        request.setItemCode(request.getItemCode() + 5);

        return false;
    }
}
