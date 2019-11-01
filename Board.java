import java.util.*;

public class Board {
    
    private Collection<Room> rooms = new ArrayList<Room>(); //is this a useful abstraction? Not sure where the actual implementation would happen
    
    /*
    pMoveOpts. Take a Player and use its curRoom to find the Room's
    neighbors. Print these neighbors to the user.
    */
    public void pMoveOpts(Player p) {
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


    
}