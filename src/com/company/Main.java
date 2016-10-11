package com.company;

import Controller.Controller;
import View.Board;
import View.MainFrame;

import java.rmi.Naming;

public class Main {

    public static void main(String[] args) {
        try {
            Controller controller = new Controller();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
