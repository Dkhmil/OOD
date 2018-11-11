package factoryPattern;

public class Iphone implements Mobile{
    private int ramSize;
    private String processor;
    private String gpu;

    public Iphone(int ramSize, String processor, String gpu) {
        this.ramSize = ramSize;
        this.processor = processor;
        this.gpu = gpu;
    }
}
