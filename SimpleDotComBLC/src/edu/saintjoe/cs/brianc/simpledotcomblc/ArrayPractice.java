package edu.saintjoe.cs.brianc.simpledotcomblc;

public class ArrayPractice {

	public static void main(String[] args) {
		// Create a new reference variable, which references an array of Strings;
		String[] names;
		
		// Create a new array that will hold references to 5 Strings
		names = new String[5];
		
		names[0] = "Arnold";
		names[1] = "Luis";
		names[1] = "Elmo";
		names[2] = "Luke";
		names[3] = "Lee";
		names[4] = "Elmo";
		
		// Print all the names in the array
		for( String oneName: names) {
			System.out.println("We just got " + oneName);
		}
		
		String result = "Not found";
		// Just print Elmo's name
		for (String oneName: names ) {
			if (oneName == "Elmo") {
				result = "Found!!!";
			}
		}
		System.out.println("Value of search result: " + result);

	}

}
