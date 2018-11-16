package strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(5, 10));

        Context context1 = new Context(new OperationSubstruct());
        System.out.println(context1.executeStrategy(5,10));

        Context context2 = new Context(new OperationMultiply());
        System.out.println(context2.executeStrategy(5,10));
    }
}
