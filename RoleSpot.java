/**
 * Jorell de Vera
 * Zack Doll
 * Deadwood
 * Fall 2019
 */

public class RoleSpot {
	private String spotID;
	private int rank;
	private boolean occupied;

	/**
	 * isOccupied
	 * 
	 * @return whether the Role Spot is occupied
	 */
	public boolean isOccupied() {
		return this.occupied;
	}

	/**
	 * flipOccupied
	 * 
	 * switches the state of occupied
	 * @return the state of occupied AFTER the flip occurs
	 */
	public boolean flipOccupied() {
		return isOccupied();
	}

	public void setRank(int rank) {

	}

	public int getRank() {
		return this.rank;
	}

	public void setID(String id) {

	}

	public String getID() {
		return this.spotID;
	}
}