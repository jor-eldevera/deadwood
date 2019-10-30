public class Player {
    private int ID;
    private Die rank;
    private int money = 0;
    private int credits = 0;
    private int practice = 0;
    private RoleSpot role;
    private Boolean isTurn;
    private Room curRoom;

    
    public void setID(int ID) {

    }

    public int getID() {
        return ID;
    }
    
    public void setMoney (int change) {
    
    }

    public void setCredits(int change) {

    }

    public void changeTurn() {
        isTurn = !isTurn;
    }

    public boolean isTurn() {
        return isTurn;
    }

    public void setPractice(int change) {

    }

    public void rehearse() {
        setPractice(practice+1);
    }

    public void upgradeRank(int money, int credits) {

    }

    public void move(Room newRoom) {

    }

    public void takeRole(RoleSpot newRole) {

    }

    public void rollDice() {

    }

    public void resetPractice() {
        setPractice(0);
    }
}