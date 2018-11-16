package strategy;

public class OperationSubstruct implements Strategy {
    @Override
    public int doOperation(int x, int y) {
        return x - y;
    }
}
