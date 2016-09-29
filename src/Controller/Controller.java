package Controller;

import Model.Cell;
import Model.ChekersAlgoritm;
import View.Board;
import View.MainFrame;

import java.util.List;

/**
 * Created by Igor on 20.09.2016.
 */
public class Controller {
    ChekersAlgoritm chekersAlgoritm;
    Board board;
    MainFrame mainFrame;

    public Controller() {
        chekersAlgoritm = new ChekersAlgoritm();
        board = new Board(this);
        mainFrame = new MainFrame(board);
        chekersAlgoritm.setEightWay();
        chekersAlgoritm.setSevenWay(1, chekersAlgoritm.getSevenWayG1A7());
        chekersAlgoritm.setSevenWay(2, chekersAlgoritm.getSevenWayH2B8());
        chekersAlgoritm.setSixWay(1, chekersAlgoritm.getSixWayC1H6());
        chekersAlgoritm.setSixWay(2, chekersAlgoritm.getSixWayA3F8());
        chekersAlgoritm.setFiveWay(1, chekersAlgoritm.getFiveWayE1A5());
        chekersAlgoritm.setFiveWay(2, chekersAlgoritm.getFiveWayH4D8());
        chekersAlgoritm.setFourWay(1, chekersAlgoritm.getFourWayE1H4());
        chekersAlgoritm.setFourWay(2, chekersAlgoritm.getFourWayA5D8());
        chekersAlgoritm.setFreeWay(1, chekersAlgoritm.getFreeWayC1A3());
        chekersAlgoritm.setFreeWay(2, chekersAlgoritm.getFreeWayH6F8());
        chekersAlgoritm.setTwoWay(1, chekersAlgoritm.getTwoWayG1H2());
        chekersAlgoritm.setTwoWay(2, chekersAlgoritm.getTwoWayA7B8());

    }

    public ChekersAlgoritm getChekersAlgoritm() {
        return chekersAlgoritm;
    }

    public void setAdressCell(int yAdress, char xadress) {
        chekersAlgoritm.addCells(xadress, yAdress);
    }

    public List<Cell> getBlackButtonsList() {
        return chekersAlgoritm.getBlackButtons();
    }

    public void setCurrentCellController(char xAdrss, int yAdress) {
        chekersAlgoritm.setCurrentCell(xAdrss, yAdress);
        chekersAlgoritm.setBorderCells();
    }

    public void clearCurrentController() {
        chekersAlgoritm.clearDiagonal();
    }

    public List<Cell> getBorderCellsForView() {
        return chekersAlgoritm.getBorderCells();
    }

}
