package com.company;

import View.Board;
import View.MainFrame;

public class Main {

    public static void main(String[] args) {
        Board board= new Board();
        MainFrame mainFrame = new MainFrame(board.getMainPanel());
    }
}
