package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println( "Please provide the radius of the circle:" );
        Double aRadius = input.nextDouble();
        Double aArea = Circle.getArea( aRadius );
        System.out.println( "The area of the circle is " + aArea );

    }

}
