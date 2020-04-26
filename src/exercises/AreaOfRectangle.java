package exercises;

import java.awt.*;
import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the height of the rectangle in feet?");
        Integer aHeight = input.nextInt();
        System.out.println("What is the length of the rectangle in feet?");
        Integer aLength = input.nextInt();
        System.out.println("The area of the rectangle is " + (aHeight * aLength) + " feet!");
    }

}
