package View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Igor on 13.09.2016.
 */
public class MainFrame {
    private JFrame mainFrame;

    public MainFrame(JPanel panel) {
        mainFrame = new JFrame();


        mainFrame.add(panel);

        mainFrame.setPreferredSize(new Dimension(1000,800));

       mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

    }
}
