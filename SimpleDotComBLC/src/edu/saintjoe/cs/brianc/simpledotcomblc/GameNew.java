package edu.saintjoe.cs.brianc.simpledotcomblc;

import java.util.ArrayList;

public class GameNew {
    public static void main(String[] args)
    {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        DotComBLC theDotCom = new DotComBLC();
        ArrayList<String> locations = new ArrayList<String>();
        
        int randomNum = (int) (Math.random() * 5);
        
        locations.add(Integer.toString(randomNum++));
        locations.add(Integer.toString(randomNum++));
        locations.add(Integer.toString(randomNum));
        
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive == true)
        {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            System.out.println(result);
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}

