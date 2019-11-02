public class Player {
    
    /**** FIELDS ****/
    private int ID;
    private Die rank;
    private int money = 0;
    private int credits = 0;
    private int practice = 0;
    private RoleSpot role;
    private Boolean isTurn;
    private Room curRoom;

    
    /**** GETTERS ****/
    public int getID() { return ID; }
    public boolean isTurn() { return isTurn; }

    
    /**** SETTERS ****/
    /*
    setMoney. Sets the money field to change.
    */
    public void setMoney (int change) {
    
    }
    
    
    /*
    setID. Set the ID field.
    */
    public void setID(int ID) {

    }


    /*
    setCredits. Sets the credit field to change.
    */
    public void setCredits(int change) {

    }

    
    /*
    setPractice. Sets the practice field to change.
    */
    public void setPractice(int change) {

    }
    
    
    /*
    changeTurn. Flips the boolean value of isTurn. 
    */
    public void changeTurn() {
        isTurn = !isTurn;
    }


    /*
    takeRole. Set RoleSpot field to newRole. 
    
    -- Perhaps allow for sending a "null" RoleSpot == removing a role --
    */
    public void takeRole(RoleSpot newRole) {

    }


    /*
    resetPractice. set practice field to 0. 
    */
    public void resetPractice() {
        setPractice(0);
    }


    /*
    rehearse. Increments the practice field by one (via setPractice)
    */
    public void rehearse() {
        setPractice(practice+1);
    }


    /*
    upgradeRank. Performs transaction of money or credits to increase rank.
    */
    public void upgradeRank(int money, int credits) {

    }


    /**** BEHAVIORS ****/

    /*
    move. Change the player's curRoom to newRoom. 
    
    -- Need to make sure this change is present wherever necessary! --
    */
    public void move(Room newRoom) {

    }


    /*
    rollDice. Function to be used by active (on card) player when a scene is
    wrapped. Roll ndice amount of dice.

    --  Need to think about how the result of this is handled. Maybe return 
        a Die[]?    --
    */
    public void rollDice(int ndice) {

    }



}