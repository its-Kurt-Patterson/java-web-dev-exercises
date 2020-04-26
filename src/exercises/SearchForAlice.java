package exercises;

import java.util.Scanner;

public class SearchForAlice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String bookPassage = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having" +
                " nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures " +
                "or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("What word would you like to search for?");
        String aSearch = input.nextLine();
        Boolean isPresent = bookPassage.toLowerCase().contains(aSearch.toLowerCase());
        System.out.println(isPresent);
    }

}
