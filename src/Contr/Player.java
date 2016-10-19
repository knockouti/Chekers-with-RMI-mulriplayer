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


    public Player(){

    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Player player1, Player player2) {
        if(this == player1){
            identifier = 1;
        }
        else if(this == player2) {
            identifier = 2;
        }
    }

    public void setPlayerInterfaces(List<PlayerInterface> playerInterfaces, PlayerInterface playerNow) {
        this.playerInterfaces = playerInterfaces;
            if(playerNow == playerInterfaces.get(0)){
                identifier = 1;
            }


    }

    public int getOppositeNumerPlayer() {
        if (identifier == 1) {
            return identifier + 1;
        } else {
            return identifier - 1;
        }
    }
}
