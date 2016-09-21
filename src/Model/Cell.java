package Model;

import java.util.List;

/**
 * Created by Igor on 20.09.2016.
 */
public class Cell {
    int yAdress;
    char xAdress;
    boolean empty;
    boolean border;
    public Cell(char xAdress,int yAdress){
        this.xAdress = xAdress;
        this.yAdress = yAdress;
    }
    public char getXAdress(){
        return xAdress;
    }
    public int getYAdress(){return yAdress;}
}
