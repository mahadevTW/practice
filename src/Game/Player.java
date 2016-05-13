package Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Player {
    int numberGuessed;
    String name;

    public Player(String name) {
        this.name = name;
    }

    public int getNumberGuessed() {
        return numberGuessed;
    }

    @Override
    public String toString() {
        return name;
    }

    void guessInRange(int start,int end){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("hay "+this+" please Guess number in "+start + " and "+end);
        int number = 0;
        try {
            number = Integer.valueOf(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        numberGuessed = number;
    }
}
