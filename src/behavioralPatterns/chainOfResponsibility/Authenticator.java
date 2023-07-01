package behavioralPatterns.chainOfResponsibility;

public class Authenticator extends Handler {

    private final String ADMIN_USERNAME = "admin";
    private final String ADMIN_PW = "123";

    protected Authenticator(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean doHandle(Request request) {
        if (request.getUserName().equals(ADMIN_USERNAME) && request.getPassWord().equals(ADMIN_PW)) {
            System.out.println("authenticate successfully");
            return false;
        }
        System.out.println("authentication failed!");
        return true;
    }
}
