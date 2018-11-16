package visitor;

public interface ComputerPart {
    void accept(ComputerVisitor computerVisitor);
}
