package Contr;

import View.Board;
import View.MainFrame;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 * Created by Igor on 20.09.2016.
 */
public class Controller implements ControllerServerInterface {
    ChekersAlgoritm chekersAlgoritm;
    boolean player;
public void setPlayer(boolean player){
    this.player = player;
}
   public void go(){
       chekersAlgoritm = new ChekersAlgoritm();


       }

public void go1(){
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
//    public void startSearch () {
//        while (true) {
//            try {
//                final PrimeChecker checker = availableCheckers.take();
//                final BigDecimal numberToCkeck = increment();
//
//                new Thread(new Runnable () {
//                    public void run () {
//                        try {
//                            if (checker.check(numberToCkeck)) {
//                                System.out.println (numberToCkeck);
//                            }
//                            availableCheckers.add (checker);
//                        } catch (RemoteException e) {
//                            System.out.println ("Client disconnected or unknown error occured");
//                        }
//                    }
//                }).start();
//
//            } catch (InterruptedException e) {
//
//            }
//        }
//    }
    public void setBooleanBear(boolean booleanBear) {
        chekersAlgoritm.setBeat(booleanBear);
    }

    public List<Cell> getBearCellsController() {
        return chekersAlgoritm.getBearCell();
    }

    public List<Cell> getBorderCellsForView() {
        return chekersAlgoritm.getBorderCells();
    }

    public void changeDiagonalPlayer1(char countX, int countY, char oldCountX, int oldCountY) {
        chekersAlgoritm.changeDiagonalPlayer1(countX, countY, oldCountX, oldCountY);
    }


    public int getOppositeNumberPlayerForView() {
        return chekersAlgoritm.getPlayer().getOppositeNumerPlayer();
    }

    public boolean getBooleanBear() {
        return chekersAlgoritm.isBeat();
    }

    public int getNumberPlayerInModel() {
        return chekersAlgoritm.getNumberPlayer();
    }

    public static void main(String[] args) {

        try {
            Controller controllerServer = new Controller();
            final ControllerServerInterface stub = (ControllerServerInterface) UnicastRemoteObject.exportObject(controllerServer, 0);
            final Registry registry = LocateRegistry.createRegistry(12345);
            registry.bind("Server", stub);
            System.out.print("Binding service...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
