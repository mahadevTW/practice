package Game;

public class GuessGame {

    private Player players[];

    public GuessGame(Player players[]) {
        this.players = players;
         }

    void startGame(){
        int count = 5;
        while(count != 0){
        int startRangeNumber = (int) (Math.random() * (Constants.MAXRANGEOFGAME - Constants.RANGEOFGAME));
        int endRangeNumber = startRangeNumber + Constants.RANGEOFGAME;

            for(Player player : players) {
            player.guessInRange(startRangeNumber, endRangeNumber);
           }

        int numberToGuess = (int) (startRangeNumber + Math.random()*(endRangeNumber-startRangeNumber));
         CompareResult(numberToGuess);
         count --;
        }
    }

    private void CompareResult(int numberToGuess) {
        for (Player player : players) {
        compareGuess(player, numberToGuess);
     }
    System.out.println("Number to guess was "+  numberToGuess);
    }

    private void compareGuess(Player player, int numberToGuess){
    if(player.getNumberGuessed() == numberToGuess){
        System.out.println("Congratulation "+player);
    }else {
        System.out.println("sorry "+player + "Try next time!!!!");
    }

    }
}
