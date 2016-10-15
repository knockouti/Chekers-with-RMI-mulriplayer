package View;

import Contr.Cell;
import Contr.ControllerServerInterface;
import View.CellView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Igor on 12.10.2016.
 */
public interface PlayerInterface extends Remote  {
    public  List<CellView> getBlackButtons() throws RemoteException;
    public CellView getCellView() throws RemoteException;
    public void setCellViewOld(CellView cellViewOld) throws RemoteException;
    public CellView getCellViewOld() throws RemoteException;
    public void setListenerForCells() throws RemoteException;
    public char getXNowAdress() throws RemoteException;
    public int getYNowAdress() throws RemoteException;
    public char getXOldAdress()throws RemoteException;
    public int getYOldAdress() throws RemoteException;
    public void setChekersView(char xAdress, int yAdress, char xOldAdress, int yOldAdress,char x, int y) throws RemoteException;

    public void setPositionButtons() throws RemoteException;
    public char getCellView1X()throws RemoteException;
    public int getCellView1Y() throws RemoteException;
    public void setChekers() throws RemoteException ;



    public  void getButtons() throws RemoteException;

    public JPanel getVerticalNubmPanel() throws RemoteException;
    public JPanel getHorizontalNumbPanel()throws RemoteException;


    public JPanel getMainPanel()throws RemoteException;
}
