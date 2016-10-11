package Controller;

import Model.Cell;
import Model.ChekersAlgoritm;
import Model.Player;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Igor on 10.10.2016.
 */
public interface ClientInterface extends Remote {
    public ChekersAlgoritm getChekers() throws RemoteException;
    public void setCurrentCell(char xAdress, int yAdress) throws RemoteException;

    public void setBorderCells() throws RemoteException;

    public void setBeat(boolean beat) throws RemoteException;

    public List<Cell> getBearCell() throws RemoteException;

    public List<Cell> getBorderCells() throws RemoteException;

    public void changeDiagonalPlayer1(char countX, int countY, char oldCountX, int oldCountY) throws RemoteException;

    public Player getPlayer() throws RemoteException;

    public boolean isBeat() throws RemoteException;

    public int getNumberPlayer() throws RemoteException;
}
