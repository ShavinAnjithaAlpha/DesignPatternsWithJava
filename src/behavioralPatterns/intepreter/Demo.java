package behavioralPatterns.intepreter;

public class Demo {
    public static void main(String[] args) {
        // create a abstract syntax tree using the expressions
        SequenceExpression sequenceExpression = new SequenceExpression(new LiteralExpression(),
                new AlternationExpression(new LiteralExpression(), new LiteralExpression()));
        sequenceExpression.interpret();
    }
}
