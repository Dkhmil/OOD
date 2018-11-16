package visitor;

public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new ComputerMouse(), new KeyBoard(), new Monitor()};
    }

    @Override
    public void accept(ComputerVisitor computerVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerVisitor);
        }
        computerVisitor.visit(this);
    }

}
