package View;

import javax.swing.*;
import java.awt.*;


/**
 * Created by Igor on 14.09.2016.
 */
public class CellView extends JPanel {
    int yAdress;
    char xAdress;

    boolean isEmpty;

    public CellView() {
        super();

    }

    public CellView(int yAdress, char xAdress) {
        super();
        this.xAdress = xAdress;
        this.yAdress = yAdress;
        JLabel label = new JLabel("<html>Text color: <font color='red'>red</font></html>");
        label.setText(String.valueOf(xAdress) + yAdress);
        this.add(label);
        this.setBackground(Color.black);
        this.setPreferredSize(new Dimension(100, 100));

    }

    public void setEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }
    public char getXAdress(){
        return xAdress;
    }
    public int getYAdress(){return yAdress;}

}
