import java.util.*;

public class Board {
    /**** FIELDS ****/
    private Collection<Room> rooms = new ArrayList<Room>();
    
    
    /**** BEHAVIORS/MODIFIERS ****/
    /*
    pMoveOpts. Take a Player and use its curRoom to find the Room's
    neighbors. Print these neighbors to the user.
    */
    public void pMoveOpts(Player p) {
    }


    /**
     * 
     * @param p player
     * @param newRoom
     */
    public void movePlayer(Player p, Room newRoom) {        
    }
    
    /*
    addRoom. Add newRoom to rooms Collection (ArrayList)
    */
    public void addRoom(Room newRoom) {
    }


    /*
    placeScene. Place newScene in a Set (extends room) that has no SceneCard.
    */
    public void placeScene(SceneCard newScene) {
    }


    /*
    rmvScene. Remove SceneCard from set
    */
    public void rmvScene(Set set) {
    }


    /*
    flipScene. Flip over SceneCard of set.
    */
    public void flipScene(Set set) {
    }

    
    /*
    placeShotCounter. Add shot counter to Set.
    */
    public void placeShotCounter(Set set) {
    }

    /*
    rmvShotCounter. Remove a shot counter from set.
    */
    public void rmvShotCounter(Set set) {

    }
}