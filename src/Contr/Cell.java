package Contr;

import java.io.Serializable;

/**
 * Created by Igor on 20.09.2016.
 */
public class Cell implements Serializable{
    int yAdress;
    char xAdress;
    int color;

    public void setColorCell(int color) {
        this.color = color;
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
