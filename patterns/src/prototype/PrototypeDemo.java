package prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        ShapeChashe.loadCache();

        Shape clonedShape = ShapeChashe.getShape("1");
        Shape clonedShape2 = ShapeChashe.getShape("2");
        Shape clonedShape3 = ShapeChashe.getShape("3");

        System.out.println(clonedShape.getType());
        System.out.println(clonedShape2.getType());
        System.out.println(clonedShape3.getType());
    }
}
