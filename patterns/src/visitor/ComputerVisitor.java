package visitor;

public interface ComputerVisitor {
    void visit(Computer computer);

    void visit(ComputerMouse mouse);

    void visit(Monitor monitor);

    void visit(KeyBoard keyBoard);
}
