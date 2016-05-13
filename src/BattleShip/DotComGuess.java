package BattleShip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DotComGuess {
    int[] grid = new int[Constant.GRIDSIZE];
    int numberOfHits;
    int numberOfGuesses;
    int startRandLoc;
    int endRandLoc;

    public DotComGuess() {
        startRandLoc = (int) (Math.random() * (Constant.GRIDSIZE - Constant.BLOCKSIZE));
        endRandLoc = startRandLoc + Constant.BLOCKSIZE;
    }

    boolean checkYourselfs(int guess){
        if(guess >=startRandLoc && guess <= endRandLoc){

            numberOfHits ++;
            numberOfGuesses ++;
            return true;
        }
        numberOfGuesses ++;
        return false;
    }
    void playGame(){

        BufferedReader bufferedReader=new BufferedReader((new InputStreamReader(System.in)));
        int guessno;
        while(numberOfHits<3)
        {
            try {
                guessno=Integer.parseInt(bufferedReader.readLine());
                boolean result = checkYourselfs(guessno);

                if(result)
                    System.out.println("Hit");
                else
                    System.out.println("Miss");

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println("kill");
        System.out.println("No of guesses: "+numberOfGuesses);
        double rate=(numberOfHits/numberOfGuesses);
        System.out.println("Ratio :"+rate);
    }

}