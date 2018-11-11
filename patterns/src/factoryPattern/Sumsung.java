package factoryPattern;

public class Sumsung implements Mobile {
    private String processor;
    private int ramSize;
    private String name;

    @Override
    public String toString() {
        return "Sumsung{" +
                "processor='" + processor + '\'' +
                ", ramSize=" + ramSize +
                ", name='" + name + '\'' +
                '}';
    }

    public Sumsung(int ramSize) {
        this.ramSize = ramSize;
    }

    public Sumsung(String processor) {
        this.processor = processor;
        this.ramSize = 2;
    }
}
