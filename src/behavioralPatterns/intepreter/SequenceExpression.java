package behavioralPatterns.intepreter;

public class SequenceExpression implements Expression{
    private Expression leftExpression;
    private Expression rightExpression;

    public SequenceExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public void interpret() {
        // interpret logic
    }
}
