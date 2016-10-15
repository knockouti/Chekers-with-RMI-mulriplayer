package View;

import Contr.Controller;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;
import java.rmi.RemoteException;

/**
 * Created by Igor on 13.09.2016.
 */
public class MainFrame implements Serializable{
    private JFrame mainFrame;
    private Board board;
    Controller controller;

    public MainFrame(Board board) throws RemoteException {
        mainFrame = new JFrame();
        this.board = board;
        mainFrame.setPreferredSize(new Dimension(800, 800));
        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(board.getMainPanel(), BorderLayout.CENTER);
        mainFrame.add(board.getHorizontalNumbPanel(), BorderLayout.PAGE_END);
        mainFrame.add(board.getHorizontalNumbPanel(), BorderLayout.PAGE_START);
        mainFrame.add(board.getVerticalNubmPanel(), BorderLayout.LINE_END);
        mainFrame.add(board.getVerticalNubmPanel(), BorderLayout.LINE_START);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

    }
}
