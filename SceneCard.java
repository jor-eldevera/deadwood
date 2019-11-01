/**
 * Jorell de Vera
 * Zack Doll
 * Deadwood
 * Fall 2019
 */

/**
 * Scene Card
 */
public class SceneCard {
    private String name;
    private String desc;
    private int budget;
    private Collection<RoleSpot> roles = new ArrayList<RoleSpot>();
	private boolean isFlipped;

	/**
	 * flip
	 * 
	 * flips the card
	 * @return state of the card AFTER the flip occurs
	 */
	public boolean flip() {
		return this.isFlipped;
	}

	public void setName(String name) {

	}

	public String getName() {
		return this.name;
	}

	public void setDesc(String desc) {

	}

	public String getDesc() {
		return this.getDesc();
	}

	public void setBudget(int budget) {

	}

	public int getBudget() {
		return this.budget();
	}

	public void setRoles(Rolespot[] roles) {

	}

	public ArrayList<RoleSpot> getRoles() {
		return this.roles;
	}
}
