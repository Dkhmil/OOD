package proxy;

public class RealImage implements Image {
    private String fileName;

    @Override
    public String toString() {
        return "RealImage{" +
                "fileName='" + fileName + '\'' +
                '}';
    }

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadDisc(fileName);
    }

    private void loadDisc(String fileName) {
        System.out.println("Loading" + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying" + fileName);

    }
}
