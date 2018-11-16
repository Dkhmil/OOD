package visitor;

public class ComputerPartDisplayVisitor implements ComputerVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(ComputerMouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(KeyBoard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }

}
