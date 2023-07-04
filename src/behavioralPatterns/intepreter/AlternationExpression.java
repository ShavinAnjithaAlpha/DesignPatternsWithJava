package behavioralPatterns.intepreter;

public class AlternationExpression implements Expression{
    private Expression alter1;
    private Expression alter2;

    public AlternationExpression(Expression alter1, Expression alter2) {
        this.alter1 = alter1;
        this.alter2 = alter2;
    }

    @Override
    public void interpret() {
        // interpret logic;
    }
}
