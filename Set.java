/**
 * Jorell de Vera
 * Zack Doll
 * Deadwood
 * Fall 2019
 */

 /**
  * Set
  */
public class Set extends Room {
    private Collection<RoleSpot> roles = new ArrayList<RoleSpot>();
    private int shots;
    private SceneCard sceneCard;

    /**
     * isCardFlipped
     * 
     * @return true if the card is flipped, false otherwise
     */
    private boolean isCardFlipped() {
      return sceneCard.isFlipped();
    }

    /**
     * flipCard
     * 
     * flips the scene card
     */
    private void flipCard() {

    }

    /**
     * removeShot
     * 
     * removes one shot counter
     */
    public void removeShot() {

    }

    /**
     * replaceShots
     * 
     * replaces all the shot counters in this room
     */
    public void replaceShots() {

    }
}