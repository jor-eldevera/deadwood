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


    /**
     * setScene. Set scene.
     * @param scene          
     */
    public void setScene(SceneCard scene) {

    }

    /**
     * getScene
     * 
     * @return scene card on this set
     */
    public SceneCard getScene() {
      return this.sceneCard;
    }

    /**
     * setRoles
     * 
     * @param roles group of roles to place in the Set
     */
    public void setRoles(Collection<RoleSpot> roles) {

    }

    /**
     * getRoles
     * 
     * @return roles on this Set
     */
    public Collection<RoleSpot> getRoles() {
      return this.roles
    }

    /**
     * getShots
     * 
     * @return number of shot counters on this Set
     */
    public int getShots() {
      return this.shots;
    }
}