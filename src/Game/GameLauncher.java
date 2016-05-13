package Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameLauncher {

  public static void main(String a[]){
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      System.out.println(Constants.ENTER_NUMBER_OF_PLAYERS_MESSAGE);
      int numberOfPlayers = 0;

      try {
          numberOfPlayers = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
          e.printStackTrace();
      }

      Player players[] = getPlayersDetails(numberOfPlayers,bufferedReader);

      GuessGame guessGame = new GuessGame(players);
      System.out.println("cheers...lets start the game.....");
        guessGame .startGame();
    }

    private static Player[] getPlayersDetails(int numberOfPlayers, BufferedReader bufferedReader) {
        Player players[] = new Player[numberOfPlayers];
        for( int i=0;i<numberOfPlayers;i++)
        {
            String name = "";
            System.out.println("Enter the name of player"+(i+1));
            try {
                 name=bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Player player = new Player(name);
            players[i] = player;
        }
        return  players;
    }

    public int multiply(int number1, int number2) {
        return number1*number2;
    }
}
