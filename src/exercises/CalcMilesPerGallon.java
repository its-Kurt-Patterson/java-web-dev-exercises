package exercises;

import java.util.Scanner;

public class CalcMilesPerGallon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the distance that you have driven today in miles?");
        Integer aMiles = input.nextInt();
        System.out.println("How many gallons of gasoline have you consumed driving today?");
        Double aGallons = input.nextDouble();
        System.out.println("You averaged "+ ( aMiles / aGallons ) +" miles per gallon driving!");
    }

}
