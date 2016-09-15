package View;

import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by Igor on 13.09.2016.
 */
public class Board {
    public static final int SIZE_FIELD = 64;
    public static final int SIZE_STRING = 8;
    private JPanel mainPanel;
    private JButton buttonInTheField;
    private List<Cell> buttons;

    public Board() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        this.getButtons();


    }

    public void getButtons() {
        buttons = new ArrayList<>();
        int numbString = 1;
        for (int i = 1; i <= SIZE_STRING; i++) {
            if (numbString % 2 == 0) {
                for (char j = 'b'; j <= 'h'; j++) {
                    Cell cell = new Cell(i, j);

                    buttons.add(cell);
                    j++;
                }
            } else {
                for (char j = 'a'; j <= 'h'; j++) {
                    Cell cell = new Cell(i, j);

                    buttons.add(cell);
                    j++;
                }

            }
            numbString++;
        }
        for (JPanel panel : buttons) {
            mainPanel.add(panel);
        }

    }


    public JPanel getMainPanel() {
        return mainPanel;
    }
}
