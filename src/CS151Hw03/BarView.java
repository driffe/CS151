package CS151Hw03;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.BlockingQueue;

/**
 * Class that display to the user
 */
public class BarView extends JComponent{

    BlockingQueue<Message> queue;
    JFrame frame;

    JTextField redText;
    JTextField greenText;
    JTextField blueText;

    JButton update;
    JButton reset;

    JLabel l1,l2,l3;

    BarGraph bar;

    int red;
    int green;
    int blue;

    /**
     * constructor of BarView class
     * @param queue BlockingQueue of message
     */
    public BarView (BlockingQueue<Message> queue) {
        this.frame = new JFrame("Bar Graph");
        this.frame.setSize(1280, 828);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
        this.l1 = new JLabel("Red");
        this.redText = new JTextField(8);

        this.l2 = new JLabel("Green");
        this.greenText = new JTextField(8);

        this.l3 = new JLabel("Blue");
        this.blueText = new JTextField(8);

        this.update = new JButton("update");
        this.reset = new JButton("reset");

        JPanel p1 = new JPanel();
        p1.add(l1);
        p1.add(redText);
        p1.add(l2);
        p1.add(greenText);
        p1.add(l3);
        p1.add(blueText);
        p1.add(update);
        p1.add(reset);

        //event for clicking the update button
        update.addActionListener(e -> {
            try {
                red = Integer.parseInt(redText.getText());
                green = Integer.parseInt(greenText.getText());
                blue = Integer.parseInt(blueText.getText());
                queue.put(new UpdateMessage(red, green, blue));
            } catch (InterruptedException exception) {

            }
            resetText();
            update(red, green, blue);
        });
        //event for clicking the reset button
        reset.addActionListener(e -> {
            try {
                red = 0;
                green = 0;
                blue = 0;
                queue.put(new ResetMessage());
            } catch (InterruptedException exception) {
            }
            resetText();
            update(red, green, blue);
        });
        bar = new BarGraph(10, 10, 10);
        frame.add(p1, BorderLayout.NORTH);
        frame.add(bar);
    }

    /**
     * class for update value
     * @param red red size
     * @param green green size
     * @param blue blue size
     */
    public void update(int red, int green, int blue) {
        String redValue = String.valueOf(red);
        String greenValue = String.valueOf(green);
        String blueValue = String.valueOf(blue);
        bar.updateSize(red, green, blue);
        bar.repaint();
        JOptionPane.showMessageDialog(null,"Red: " + redValue + ", Green: " + greenValue + ", Blue: " + blueValue);
    }
    /**
     * class for reset the text on JTextField
     */
    public void resetText() {
        redText.setText("");
        blueText.setText("");
        greenText.setText("");
    }
}
