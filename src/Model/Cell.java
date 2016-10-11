package Model;

import java.awt.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Igor on 20.09.2016.
 */
public class Cell implements Serializable{
    int yAdress;
    char xAdress;
    int color;
    boolean queen;
    boolean empty;
    boolean border;

    public void setColorCell(int color) {
        this.color = color;
    }

    public void setQueen(boolean queen) {
        this.queen = queen;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public void setBorder(boolean border) {
        this.border = border;
    }


    public Cell(char xAdress, int yAdress) {
        this.xAdress = xAdress;
        this.yAdress = yAdress;
    }

    public char getXAdress() {
        return xAdress;
    }

    public int getYAdress() {
        return yAdress;
    }
}
