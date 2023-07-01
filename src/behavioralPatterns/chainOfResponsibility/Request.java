package behavioralPatterns.chainOfResponsibility;

public class Request {

    private final String userName;
    private final String passWord;
    private int itemCode;
    private final int count;

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

    public int getCount() {
        return count;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }
}
