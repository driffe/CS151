package CS151Hw03;

import javax.swing.*;
import java.awt.*;

/**
 * Class for drawing the graph, Three rectangles.
 */
public class BarGraph extends JComponent{
    private int redSize;
    private int greenSize;
    private int blueSize;

    public BarGraph(int redSize, int greenSize, int blueSize) {
        this.redSize = redSize;
        this.greenSize = greenSize;
        this.blueSize = blueSize;
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.red);
        g2.fillRect(150, 628 - redSize, 50, redSize);

        g2.setColor(Color.green);
        g2.fillRect(550, 628 - greenSize, 50, greenSize);

        g2.setColor(Color.blue);
        g2.fillRect(950, 628 - blueSize, 50, blueSize);
    }
    public void updateSize(int redSize, int greenSize, int blueSize) {
        this.redSize = redSize * 10;
        this.greenSize = greenSize * 10;
        this.blueSize = blueSize * 10;
    }
}
