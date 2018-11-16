package flyweight;

import java.awt.*;

public class TreeType {
    private String name;
    private Color color;
    private String otherTreedata;

    public TreeType(String name, Color color, String otherTreedata) {
        this.name = name;
        this.color = color;
        this.otherTreedata = otherTreedata;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}
