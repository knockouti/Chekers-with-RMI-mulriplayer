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
    public int countX = 0;
    public int countY = 0;
    public int size = 0;
    private List<Cell> eightWay; //a1, b2, c3, d4, e5, f6, g7, h8 //«Большая дорога»
    private List<Cell> sevenWayG1A7; // g1, f2, e3, d4, c5, b6, a7 //Двойники
    private List<Cell> sevenWayH2B8; //h2, g3, f4, e5, d6, c7, b8
    private List<Cell> freeWayC1A3; //c1, b2, a3 //Тройники
    private List<Cell> sixWayC1H6; //c1, d2, e3, f4, g5, h6
    private List<Cell> freeWayH6F8; //h6, g7, f8
    private List<Cell> sixWayA3F8; //a3, b4, c5, d6, e7, f8
    private List<Cell> fourWayA5D8;// a5, b6, c7, d8 //Косяки
    private List<Cell> fiveWayH4D8;// h4, g5, f6, e7, d8
    private List<Cell> fiveWayE1A5; //e1, d2, c3, b4, a5
    private List<Cell> fourWayE1H4; //e1, f2, g3, h4
    private List<Cell> twoWayG1H2; //g1, h2
    private List<Cell> twoWayA7B8; //g1, h2

    public ChekersAlgoritm() {
        blackButtons = new ArrayList<>();
        eightWay = new ArrayList<>();
        sevenWayG1A7 = new ArrayList<>();
        sevenWayH2B8 = new ArrayList<>();
        sixWayC1H6 = new ArrayList<>();
        sixWayA3F8 = new ArrayList<>();
        fiveWayE1A5 = new ArrayList<>();
        fiveWayH4D8 = new ArrayList<>();
        fourWayE1H4 = new ArrayList<>();
        fourWayA5D8 = new ArrayList<>();
        freeWayC1A3 = new ArrayList<>();
        freeWayH6F8 = new ArrayList<>();
        twoWayG1H2 = new ArrayList<>();
        twoWayA7B8 = new ArrayList<>();
    }

    public List<Cell> getBlackButtons() {
        return blackButtons;
    }

    public List<Cell> getSevenWayG1A7() {
        return sevenWayG1A7;
    }

    public List<Cell> getSevenWayH2B8() {
        return sevenWayH2B8;
    }

    public List<Cell> getSixWayA3F8() {
        return sixWayA3F8;
    }

    public List<Cell> getSixWayC1H6() {
        return sixWayC1H6;
    }

    public List<Cell> getFiveWayH4D8() {
        return fiveWayH4D8;
    }

    public List<Cell> getFiveWayE1A5() {
        return fiveWayE1A5;
    }

    public List<Cell> getFourWayE1H4() {
        return fourWayE1H4;
    }

    public List<Cell> getFourWayA5D8() {
        return fourWayA5D8;
    }

    public List<Cell> getFreeWayC1A3() {
        return freeWayC1A3;
    }

    public List<Cell> getFreeWayH6F8() {
        return freeWayH6F8;
    }

    public List<Cell> getTwoWayG1H2() {
        return twoWayG1H2;
    }

    public List<Cell> getTwoWayA7B8() {
        return twoWayA7B8;
    }

    public void addCells(char xAdress, int yAdress) {
        Cell cell = new Cell(xAdress, yAdress);
        blackButtons.add(cell);
    }

    public void setEightWay() {
        while (countX < SIZE_STRING) {
            while (countY < SIZE_BUTTONS) {
                if (countX % 2 == 0) {

                    eightWay.add(blackButtons.get(countY));
                    countY = countY + 4;

                } else {
                    eightWay.add(blackButtons.get(countY));
                    countY = countY + 5;
                }
                break;
            }
            countX++;
        }
    }

    public void addWayToList(List<Cell> list, int sizeDifferenceEven, int sizeDifferenceOdd) {
        while (countX < size) {
            while (countY < SIZE_BUTTONS) {
                if (countX % 2 == 0) {
                    list.add(blackButtons.get(countY));
                    countY = countY + sizeDifferenceEven;
                } else {
                    list.add(blackButtons.get(countY));
                    countY = countY + sizeDifferenceOdd;
                }
                break;
            }
            countX++;

        }
    }

    public void setBaseValues(int countX, int countY, int size) {
        this.countX = countX;
        this.countY = countY;
        this.size = size;
    }

    public void setSevenWay(int chooseList, List<Cell> list) {
        if (chooseList == 1) {
            this.setBaseValues(0, 3, SIZE_STRING - 1);
        }
        if (chooseList == 2) {

            this.setBaseValues(1, 7, SIZE_STRING);
        }
        this.addWayToList(list, 3, 4);

    }

    public void setSixWay(int chooseList, List<Cell> list) {
        if (chooseList == 1) {
            this.setBaseValues(0, 1, SIZE_STRING - 2);
            this.addWayToList(list, 4, 5);
        }
        if (chooseList == 2) {
            this.setBaseValues(3, 8, SIZE_STRING + 1);
            this.addWayToList(list, 5, 4);
        }
    }

    public void setFiveWay(int chooseList, List<Cell> list) {
        if (chooseList == 1) {
            this.setBaseValues(0, 2, SIZE_STRING - 3);

        }
        if (chooseList == 2) {
            this.setBaseValues(3, 15, SIZE_STRING);
        }
        this.addWayToList(list, 3, 4);
    }

    public void setFourWay(int chooseList, List<Cell> list) {
        if (chooseList == 1) {
            this.setBaseValues(0, 2, SIZE_STRING - 4);

        }
        if (chooseList == 2) {
            this.setBaseValues(4, 16, SIZE_STRING);
        }
        this.addWayToList(list, 4, 5);
    }

    public void setFreeWay(int chooseList, List<Cell> list) {
        if (chooseList == 1) {
            this.setBaseValues(0, 1, SIZE_STRING - 5);

        }
        if (chooseList == 2) {
            this.setBaseValues(5, 23, SIZE_STRING);
        }
        this.addWayToList(list, 3, 4);
    }

    public void setTwoWay(int chooseList, List<Cell> list) {
        if (chooseList == 1) {
            this.setBaseValues(0, 3, SIZE_STRING - 6);

        }
        if (chooseList == 2) {
            this.setBaseValues(6, 24, SIZE_STRING);
        }
        this.addWayToList(list, 4, 4);
    }

}
