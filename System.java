public class System {
    private Board gameboard;
    Player[] players; //may alter data type for "getting" purposes
    Player currentPlayer;
    int numDays;


    /**
     * play. The driver of the game, called by Deadwood. Handles all of the
     * game logic.
     * @return name of winner
     */
    public String play() {
        buildBoard();
        /* 
        get input -- how many players?
        players = new Player[n]; //maybe other data type
        numDays = int[...]; <- dependant on n
        currentPlayer = players[0];
        */
        
        /* while game isn't over... day < 0 */
        /*
            ArrayList<String> options = getTurnOptions(player);
            display options
            get input
            check if in options..... loop until good
            if option is move
                option = getMoveOptions(player);
                INput again.... 
                MovePlayer
            else if other option(s)....
                do stuff
            nextTurn();

        game over... 
        tallyScores();
            */
       

        return 0;
    }

    /**
     * buildBoard. Build and "hydrate" the gameBoard.
     */
    private static void buildBoard() {
        /*
        
        gameboard = new Board;
        for sets:
            gameboard.placeScene
            gameboard.placeShotCounters


            */
    }

    /**
     * getMoveOptions.
     * @param p player
     * @return strings of rooms currentPlayer can move to.
     */
    private static Collection<Strings> getMoveOptions(Player p ) {

    }


    /**
     * getTurnOptions.
     * @return strings of valid options for currentPlayer.
     */
    private static Collection<Strings> getTurnOptions(Player p) {

    }


    /**
     * nextTurn. Change currentPlayer to next Player.
     */
    private static void nextTurn() {

    }


    /**
     * act. Roll die, handle payments. Decrement shot counts,
     * @return shotcount of current screen
     */
    private static int act() {
        return 0;
    }


    /**
     * pay. Pay Player p money or credits.
     */
    private static void pay(Player p, int money, int credits) {

    }


    /**
     * wrapScene. Wrap up scene of set.
     */
    private static void wrapScene(Set set) {

    }


    /**
     * endDay. Move players back to trailers, set up board for new day.
     */
    private static void endDay() {

    }

    /**
     * tallyScores. Tally up scores and announce the winner.
     */
    private static void tallyScores() {

    }


}