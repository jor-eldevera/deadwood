/**
 * Jorell de Vera
 * Zack Doll
 * Deadwood
 * Fall 2019
 */

 /**
  * Room
  */
public class Room {
    private String name;
    private Collection<Integer> players = new ArrayList<Integer>();
    private Collection<Room> neighbors = new ArrayList<Room>();

    /**
     * addPlayer
     * 
     * adds a player to the room
     */
    public void addPlayer() {

    }

    /**
     * removePlayer
     * 
     * removes a player from the room
     */
    public void removePlayer() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}