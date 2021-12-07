package CS151Hw03;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.BlockingQueue;

public class BarView extends JComponent{

    BlockingQueue<Message> message;
    JFrame frame;

    JTextField redSize;
    JTextField greenSize;
    JTextField blueSize;

    JButton update;
    JButton reset;

    JLabel l1,l2,l3;

    BarGraph bar;

    int red;
    int green;
    int blue;

    public void view () {
        frame = new JFrame("Bar Graph");
        frame.setSize(1280, 828);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        l1 = new JLabel("Red");
//        redSize = new JTextField(8);
//
//        l2 = new JLabel("Green");
//        greenSize = new JTextField(8);
//
//        l3 = new JLabel("Blue");
//        blueSize = new JTextField(8);
//
//        update = new JButton("update");
//        reset = new JButton("reset");
//
//        JPanel container = new JPanel();
//        container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
//
//        JPanel p1 = new JPanel();
//        p1.add(l1);
//        p1.add(redSize);
//        p1.add(l2);
//        p1.add(greenSize);
//        p1.add(l3);
//        p1.add(blueSize);
//        p1.add(update);
//        p1.add(reset);
//
//        update.addActionListener(e -> {
//            red = Integer.parseInt(redSize.getText());
//            green = Integer.parseInt(greenSize.getText());
//            blue = Integer.parseInt(blueSize.getText());
//        });
//
//        reset.addActionListener(e -> {
//            red = 0;
//            green = 0;
//            blue = 0;
//        });

        JPanel p2 = new JPanel();
        p2.add(new BarView());


        frame.add(p2);
        frame.setVisible(true);
        p2.setVisible(true);
    }
}
