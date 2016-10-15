package Contr;

import View.PlayerInterface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by Igor on 09.10.2016.
 */
public interface ControllerServerInterface extends Remote{
    public List<PlayerInterface> getPlayerInterfacesList() throws RemoteException;
    public PlayerInterface getPlayerINterfaceNow() throws RemoteException;
    public void setCurrentCellController(char xAdrss, int yAdress) throws RemoteException;
    public List<Cell> getBlackButtonsList() throws RemoteException;
    public void setAdressCell(int yAdress, char xadress)throws RemoteException;
    public void setBooleanBear(boolean booleanBear) throws RemoteException;
    public void go1() throws RemoteException;
public void go() throws RemoteException;
public void register(PlayerInterface playerInterface)throws RemoteException;

    public List<Cell> getBearCellsController() throws RemoteException;

    public List<Cell> getBorderCellsForView() throws RemoteException;

    public void changeDiagonalPlayer1(char countX, int countY, char oldCountX, int oldCountY) throws RemoteException;


    public int getOppositeNumberPlayerForView() throws RemoteException;

    public boolean getBooleanBear() throws RemoteException;
    public int getNumberPlayerInModel() throws RemoteException;
}
