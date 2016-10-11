package Controller;

import Model.Cell;
import Model.ChekersAlgoritm;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Igor on 10.10.2016.
 */
public class ControllerServerImpl implements ControllerServerInterface {
    List<ClientInterface> playerList = new ArrayList<>(2);
    ChekersAlgoritm chekersAlgoritm;

    protected ControllerServerImpl() throws RemoteException {
    }

    public void registPalayer(ClientInterface clientInterface){
playerList.add(clientInterface);
}

    public void setCHekersAlghoritm(ChekersAlgoritm cHekersAlghoritm) throws RemoteException {
        this.chekersAlgoritm = playerList.get(0).getChekers();
    }

    public void setCurrentCellController(char xAdrss, int yAdress) {
        chekersAlgoritm.setCurrentCell(xAdrss, yAdress);
        chekersAlgoritm.setBorderCells();

    }

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
    public static void main(String [] args){

        try {

            final Registry registry = LocateRegistry.createRegistry(2099);
            System.out.println(" OK");
            ControllerServerImpl controllerServer = new ControllerServerImpl();
            System.out.printf("123123");
            final Remote stub =  UnicastRemoteObject.exportObject(controllerServer, 0);



        System.out.print("Binding service...");


            registry.bind("Server", stub);
            while (true) {
                Thread.sleep(Integer.MAX_VALUE);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
