package View;

import Controller.Controller;
import Model.Cell;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;


/**
 * Created by Igor on 14.09.2016.
 */
public class CellView extends JPanel {
    int yAdress;
    char xAdress;
    boolean border;
    boolean isEmpty;
    ChekersView chekersView;

    public void setColor(int color) {
        this.color = color;
    }

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
        JLabel label = new JLabel("<html>Text color: <font color='red'>red</font></html>");
        label.setText(String.valueOf(xAdress) + yAdress);
        this.add(label);
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
