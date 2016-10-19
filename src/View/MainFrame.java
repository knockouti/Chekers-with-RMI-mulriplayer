package View;

import Contr.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Serializable;
import java.rmi.RemoteException;

/**
 * Created by Igor on 13.09.2016.
 */
public class MainFrame implements Serializable{
    private JFrame mainFrame;
    private Board board;


    public MainFrame(Board board) throws RemoteException {
        mainFrame = new JFrame();
        this.board = board;
        mainFrame.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                try {
                    board.deleteBoard();
                } catch (RemoteException e1) {
                    e1.printStackTrace();
                }
            }
        });
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
