package behavioralPatterns.chainOfResponsibility;

public class Request {

    private final String userName;
    private final String passWord;
    private final int count;
    private int itemCode;

    public Request(String userName, String passWord, int itemCode, int count) {
        this.userName = userName;
        this.passWord = passWord;
        this.itemCode = itemCode;
        this.count = count;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public int getCount() {
        return count;
    }
}
