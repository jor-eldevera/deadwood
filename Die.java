import java.util.Random;

public class Die {
    private Random sides = new Random();
    private int current;

    
    /**
     * roll. Gets a random number between 1 and 6, sets the current side to this result.
     * @return result 
     */
    public int roll() {
        int result = sides.nextInt(6)+1;
        setSide(result);
        return getSide();
    }


    /*
    setSide. Set the side of the die to side.
    */
    public void setSide(int side){
        if (0 <= side  && side <= 6) {
            current = side;
        } else {
            System.out.println("ERROR: set side out of bounds.");
        }
    }


    /*
    getSide. Return the current side (current).
    */
    public int getSide() {
        return current;
    }
}