package Controller;

import Model.Cell;
import Model.ChekersAlgoritm;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by Igor on 09.10.2016.
 */
public interface ControllerServerInterface extends Remote{

    public void setCHekersAlghoritm(ChekersAlgoritm cHekersAlghoritm) throws RemoteException;
    public void setCurrentCellController(char xAdrss, int yAdress) throws RemoteException;


    public void setBooleanBear(boolean booleanBear) throws RemoteException;


    public List<Cell> getBearCellsController() throws RemoteException;

    public List<Cell> getBorderCellsForView() throws RemoteException;

    public void changeDiagonalPlayer1(char countX, int countY, char oldCountX, int oldCountY) throws RemoteException;

    public void registPalayer(ClientInterface clientInterface) throws RemoteException;

    public int getOppositeNumberPlayerForView() throws RemoteException;

    public boolean getBooleanBear() throws RemoteException;
    public int getNumberPlayerInModel() throws RemoteException;
}
