package Controller;

import Model.Cell;
import Model.Cheker;
import Model.ChekersAlgoritm;
import View.Board;
import View.CellView;
import View.MainFrame;
import com.company.Main;

import java.util.List;

/**
 * Created by Igor on 20.09.2016.
 */
public class Controller {
    ChekersAlgoritm chekersAlgoritm;
    Board board;
    MainFrame mainFrame;
    public Controller(){
        chekersAlgoritm = new ChekersAlgoritm();
        board =  new Board(this);
        mainFrame =  new MainFrame(board);
        chekersAlgoritm.setGoldWay();
        chekersAlgoritm.setDoubleWay(1,chekersAlgoritm.getDoubleWayG1A7());
        chekersAlgoritm.setDoubleWay(2,chekersAlgoritm.getDoubleWayH2B8());


    }

    public ChekersAlgoritm getChekersAlgoritm(){
        return chekersAlgoritm;
    }
    public void setAdressCell(int yAdress, char xadress){
        chekersAlgoritm.addCells(xadress,yAdress);
    }

    public void setAdressCheker(int yAdress, char xadress){
        Cheker cheker = new Cheker(xadress,yAdress);

    }
}
