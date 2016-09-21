package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Igor on 20.09.2016.
 */
public class ChekersAlgoritm {
    private List<Cell> blackButtons;
    public static final int SIZE_STRING = 8;
    public static final int SIZE_BUTTONS = 32;
    public static final char START_STRING = 'a';
    public static final char END_STRING = 'h';
    private List<Cell> goldWay; //a1, b2, c3, d4, e5, f6, g7, h8 //«Большая дорога»
    private List<Cell> doubleWayG1A7; // g1, f2, e3, d4, c5, b6, a7 //Двойники
    private List<Cell> doubleWayH2B8; //h2, g3, f4, e5, d6, c7, b8
    private List<Cell> TripleWayC1A3; //c1, b2, a3 //Тройники
    private List<Cell> TripleWayC1H6; //c1, d2, e3, f4, g5, h6
    private List<Cell> TripleWayH6F8; //h6, g7, f8
    private List<Cell> TripleWayA3F8; //a3, b4, c5, d6, e7, f8
    private List<Cell> UltraWayA5D8 ;// a5, b6, c7, d8 //Косяки
    private List<Cell> UltraWayH4D8;// h4, g5, f6, e7, d8
    private List<Cell> UltraWayE1A5; //e1, d2, c3, b4, a5
    private List<Cell> UltraWayE1H4; //e1, f2, g3, h4
   public ChekersAlgoritm(){
       blackButtons = new ArrayList<>();
       goldWay = new ArrayList<>();
       doubleWayG1A7 = new ArrayList<>();
       doubleWayH2B8 = new ArrayList<>();

   }
    public List<Cell> getBlackButtons(){
        return blackButtons;
    }

    public List<Cell> getDoubleWayG1A7(){
        return doubleWayG1A7;
    }
    public List<Cell> getDoubleWayH2B8(){
        return doubleWayH2B8;
    }
    public void addCells(char xAdress, int yAdress ){
        Cell cell = new Cell(xAdress,yAdress);
        blackButtons.add(cell);
    }

    public void setGoldWay(){
        int countY = 0;
        int countX =0;
        while(countX<SIZE_STRING-1){
            while(countY<SIZE_BUTTONS){
                if(countX%2 == 0) {

                    goldWay.add(blackButtons.get(countY));
                    countY = countY + 4;

                }
                else {
                    goldWay.add(blackButtons.get(countY));
                    countY = countY + 3;
                }
                break;
            }
            countX++;
        }
    }
    public void setDoubleWay(int chooseList,List<Cell> list){
        int countY = 0;
        int countX  = 0;
        int size =0;
        if(chooseList==1) {
             countX = 0;
            countY = 3;
            size=SIZE_STRING-1;


        }
        if(chooseList == 2) {
            countY = 7;
            countX = 1;
            size=SIZE_STRING;
        }
        while(countX<size){
            while(countY<SIZE_BUTTONS){
                if(countX%2 == 0) {

                    list.add(blackButtons.get(countY));
                    countY = countY + 3;

                }
                else {

                    list.add(blackButtons.get(countY));
                    countY = countY + 4;
                }
                break;
            }
            countX++;
        }


    }
}
