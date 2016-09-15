package View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Igor on 14.09.2016.
 */
public class Cell extends JPanel {
    int yAdress;
    char xAdress;

    boolean isEmpty;
    public Cell(int yAdress, char xAdress){
        super();
        this.xAdress = xAdress;
        this.yAdress = yAdress;
        this.setBackground(Color.black);
        this.setPreferredSize(new Dimension(100,100));

    }

    public void setEmpty(boolean isEmpty){
        this.isEmpty = isEmpty;
    }


}
