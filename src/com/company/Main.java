package com.company;

import Contr.*;
import View.Board;
import View.MainFrame;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {

    public static void main(String[] args) throws RemoteException {


        try {
            Registry registry = LocateRegistry.getRegistry(12345);
            ControllerServerInterface stub = (ControllerServerInterface) registry.lookup("Server");
            registry.bind("ClientRegister", stub);

            Board board = new Board(stub);
            MainFrame mainFrame = new MainFrame(board);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }

