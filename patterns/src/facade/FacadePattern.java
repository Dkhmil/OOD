package facade;

public class FacadePattern {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRactangle();
        shapeMaker.drawSquare();
    }
}
