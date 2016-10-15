package Contr;

import View.PlayerInterface;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Igor on 09.10.2016.
 */
public class Player implements Serializable {
    List<PlayerInterface> playerInterfaces;

    public int identifier;
    final boolean [] indetificators = new boolean[]{false,false};


    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public void setPlayerInterfaces(List<PlayerInterface> playerInterfaces, PlayerInterface playerNow) {
        this.playerInterfaces = playerInterfaces;
            if(playerNow == playerInterfaces.get(0)){
                identifier = 1;
            }


    }
    public List<PlayerInterface> getPlayerInter(){
        return playerInterfaces;
    }
    public Player(){


    }
    public int getOppositeNumerPlayer() {
        if (identifier == 1) {
            return identifier + 1;
        } else {
            return identifier - 1;
        }
    }
}
