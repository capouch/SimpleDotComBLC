package edu.saintjoe.cs.brianc.simpledotcomblc;

public class TestRandom {

	public static void main(String[] args) {
		double originalRandomNumber = 0.0;
		originalRandomNumber = Math.random();
		// int randomNum = (int) (Math.random() * 5);
		int randomNum = (int) (originalRandomNumber * 5);
		
		System.out.println("Our original random number was: " + originalRandomNumber);
		System.out.println("I got this random number: " + randomNum);

	}

}
