package View;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;


/**
 * Created by Igor on 14.09.2016.
 */
public class CellView extends JPanel implements Serializable {
    int yAdress;
    char xAdress;
    boolean border;
    ChekersView chekersView;
    int color;


    public ChekersView getChekersView() {
        return chekersView;
    }

    public void setChekersView(ChekersView chekersView) {
        this.chekersView = chekersView;
        this.setLayout(new GridBagLayout());
        this.add(chekersView);
    }

    public int getColor() {
        return color;
    }

    public void setColorCell(int color) {
        this.color = color;
    }

    public void setBooleanBorder(boolean border, CellView cellView) {
        this.border = border;
        setOrDeleteBorder(border, cellView);

    }

    public void setOrDeleteBorder(boolean bool, CellView cellView) {
        if (bool) {
            if (cellView.getColor() == 1) {
                this.setBorder(BorderFactory.createLineBorder(Color.red, 5));
            } else {
                this.setBorder(BorderFactory.createLineBorder(Color.GRAY, 5));
            }
        } else {
            this.setBorder(null);
        }
    }

    public CellView() {
        super();

    }


    public CellView(int yAdress, char xAdress) {
        super();
        this.xAdress = xAdress;
        this.yAdress = yAdress;
        this.setBackground(Color.black);
        this.setPreferredSize(new Dimension(100, 100));

    }


    public char getXAdress() {
        return xAdress;
    }

    public int getYAdress() {
        return yAdress;
    }


}
