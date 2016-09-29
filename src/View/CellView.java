package View;

import Controller.Controller;
import Model.Cell;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;


/**
 * Created by Igor on 14.09.2016.
 */
public class CellView extends JPanel  {
    int yAdress;
    char xAdress;
    boolean border;
    boolean isEmpty;
    ChekersView chekersView;
    public void setColor(int color) {
        this.color = color;
    }

    int color;
    int numberPlayer=1;
    Controller controller;
    List<Cell> borderCells;

    public ChekersView getChekersView() {
        return chekersView;
    }

    public void setChekersView(ChekersView chekersView) {
        this.chekersView = chekersView;
        this.setLayout(new GridBagLayout());
        this.add(chekersView);
    }

    public int getColor() {
        return color;
    }

    public void setColorCell(int color) {
        this.color = color;
    }
    public void setBooleanBorder(boolean border){
        this.border = border;
        setOrDeleteBorder(border);

    }
    public void setOrDeleteBorder(boolean bool){
        if(bool){
            this.setBorder(BorderFactory.createLineBorder(Color.red, 5));
        }
        else {
            this.setBorder(null);
        }
    }

    public CellView() {
        super();

    }
    public void setController(Controller controller){
        this.controller = controller;
    }

    public CellView(int yAdress, char xAdress) {
        super();
        this.xAdress = xAdress;
        this.yAdress = yAdress;
        JLabel label = new JLabel("<html>Text color: <font color='red'>red</font></html>");
        label.setText(String.valueOf(xAdress) + yAdress);
        this.add(label);
        this.setBackground(Color.black);
        this.setPreferredSize(new Dimension(100, 100));

    }
//    public void setBOrderForPanel(CellView cell){
//        cell.setBorder(BorderFactory.createLineBorder(Color.red, 5));
//
//    }
    public void setEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }
    public char getXAdress(){
        return xAdress;
    }
    public int getYAdress(){return yAdress;}
//    public void searchBorderCellsinTheBlackButtons(int numberEl){
//        for(CellView cellView : Board.blackButtons){
//            if(cellView.getXAdress() == borderCells.get(numberEl).getXAdress() && cellView.getYAdress() == borderCells.get(numberEl).getYAdress()){
//                cellView.setBooleanBorder(true);
//                cellView.setBOrderForPanel(cellView);
//
//            }
//        }
//    }
//
//
//
//    @Override
//    public void mouseClicked(MouseEvent e) {
//
//        if(numberTIck == 2){
//            if(e.getButton() == MouseEvent.BUTTON2 && this.border){
//                for(CellView cellView : Board.blackButtons){
//                    if(cellView.border){
//                               controller.clearCurrentController();
//                    }
//                }
//            }
//        }
//    }
//
//    public int getNumberPlayer() {
//        return numberTIck;
//    }
//
//    @Override
//    public void mousePressed(MouseEvent e) {
//        this.controller = Board.controller;
//        for(CellView cell : Board.blackButtons){
//            cell.setBorder(null);
//            cell.setBooleanBorder(false);
//
//        }
//        if (e.getButton() == MouseEvent.BUTTON1) {
//            if (this.getColor() == 1) {
//                //controller.setColorController(this.getColor());
//                controller.setCurrentCellController(this.getXAdress(), this.getYAdress());
//                borderCells = controller.getBorderCellsForView();
//
//
//                for(int i = 0; i<borderCells.size();i++){
//                    this.searchBorderCellsinTheBlackButtons(i);
//
//                }
//                numberTIck++;
//            } else if(this.getColor() == 2) {
//                System.out.println("Это не ваша шашка!");
//            }
//            else {
//                System.out.println("Это gустое поле!");
//            }
//
////            numberTIck = 1;
////            if(e.getButton() == MouseEvent.BUTTON2 && numberTIck ==1){
////
////            }
////            numberTIck = 2;
////            if(e.getButton() == MouseEvent.BUTTON2){
////
////            }
//
//        }
//
//    }
//
//    @Override
//    public void mouseReleased(MouseEvent e) {
//
//    }
//
//    @Override
//    public void mouseEntered(MouseEvent e) {
//
//    }
//
//    @Override
//    public void mouseExited(MouseEvent e) {
//
//    }
}
