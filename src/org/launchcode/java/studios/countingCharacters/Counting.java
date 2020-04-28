package org.launchcode.java.studios.countingCharacters;

import java.util.HashMap;
import java.util.Map;

public class Counting {

    public static void main(String[] args) {

        // Hard code a variable for the quote that has been provided...
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has " +
                "to be zero to start with. So if you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done " +
                "that, it’s pretty straightforward from there.";

        // Convert the provided string into an  array of characters...
        char[] charactersInString = quote.toCharArray();

        // Create a Hashmap to store all of the keys and character counts from the provided string...
        HashMap<String, Integer> characterCount = new HashMap<>();

        // Loop through the new characters in the string...
        for ( char letter : charactersInString ) {

            // Get the current character in the iteration...
            String character = Character.toString( letter );

            // Check if the character has already been added to the HashMap...
            if ( characterCount.containsKey( character ) ){

                // Then update the current count of the HashMap key value...
                Integer incrementedCount = characterCount.get( character ) + 1;
                characterCount.replace(character, incrementedCount);
            }
            // If the character has not already been added to the HashMap, then add it and initiate the count...
            else {
                characterCount.put(character, 1);
            }
        }
        // Iterate over the HashMap and print all the key and value pairs one at a time...
        for (Map.Entry<String, Integer> pair : characterCount.entrySet()) {
            System.out.println( pair.getKey() + ": " + pair.getValue() );
        }
    }

}
