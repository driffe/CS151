package CS151Hw03;

import javax.swing.*;
import java.awt.*;

public class BarGraph extends JComponent{
    private int redSize;
    private int greenSize;
    private int blueSize;

    public BarGraph(int redSize, int greenSize, int blueSize) {
        this.redSize = redSize;
        this.greenSize = greenSize;
        this.blueSize = blueSize;
    }
    public void drawBar(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.red);
        g2.fillRect(100, 10, 100, redSize);

        g2.setColor(Color.green);
        g2.fillRect(500, 10, 100, greenSize);

        g2.setColor(Color.blue);
        g2.drawRect(900, 10, 100, blueSize);
    }
}
