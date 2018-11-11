package facade;

public class ShapeMaker {
    private Shape rectangle;
    private Shape square;
    private Shape circle;

    public ShapeMaker() {
        this.rectangle = new Rectangle();
        this.square = new Square();
        this.circle = new Circle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRactangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
