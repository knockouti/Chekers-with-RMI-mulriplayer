package Model;

import java.io.Serializable;

/**
 * Created by Igor on 09.10.2016.
 */
public class Player implements Serializable {
    final String name;

    public String getName() {
        return name;
    }

    public int getIdentifier() {
        return identifier;
    }

    final int identifier;
    public Player(String name , int identifier){
        this.identifier = identifier;
        this.name = name;
    }
    public int getOppositeNumerPlayer() {
        if (identifier == 1) {
            return identifier + 1;
        } else {
            return identifier - 1;
        }
    }
}
