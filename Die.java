import java.util.Random;

public class Die {
    private Random sides = new Random();
    private int current;

    
    /*
    roll. gets a random number between 1 and 6, sets the current side to this result,
    and then gets it as a return. 
    */
    public int roll() {
        int result = sides.nextInt(6)+1; //random number between 0 and 5, add 1 so it's between 1 and 6
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