package Model;

import java.util.List;

/**
 * Created by Igor on 21.09.2016.
 */
public class Diagonal {

    private List<Cell> GoldWay; //a1, b2, c3, d4, e5, f6, g7, h8 //«Большая дорога»
    private List<Cell> DoubleWayG1A7; // g1, f2, e3, d4, c5, b6, a7 //Двойники
    private List<Cell> DoubleWayH2B8; //h2, g3, f4, e5, d6, c7, b8
    private List<Cell> TripleWayC1A3; //c1, b2, a3 //Тройники
    private List<Cell> TripleWayC1H6; //c1, d2, e3, f4, g5, h6
    private List<Cell> TripleWayH6F8; //h6, g7, f8
    private List<Cell> TripleWayA3F8; //a3, b4, c5, d6, e7, f8
    private List<Cell> UltraWayA5D8 ;// a5, b6, c7, d8 //Косяки
    private List<Cell> UltraWayH4D8;// h4, g5, f6, e7, d8
    private List<Cell> UltraWayE1A5; //e1, d2, c3, b4, a5
    private List<Cell> UltraWayE1H4; //e1, f2, g3, h4

}
