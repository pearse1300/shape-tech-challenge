package com.company;
import java.util.*;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
	System.out.println("Please Type 1 for the volume of the sphere, 2 for volume of the cube and 3 for volume of the regular tetrahedron");
	int selection = sc.nextInt();
	switch (selection){
        case 1:
            System.out.println("please enter the radius of the circle");
            int radius = sc.nextInt();
            System.out.println("the2 Volume of the sphere with radius "+radius+" is "+sphere(radius));
            break;
        case 2:
            System.out.println("please enter the width of the cube");
            int width = sc.nextInt();
            System.out.println("the Volume of the cube with width "+width +" is "+cube(width));
            break;
        case 3:
            System.out.println("please enter the edge of the tetrahedron");
            int edge = sc.nextInt();
            System.out.println("the Volume of the tetrahedron with edge "+edge+" is "+tetrahedron(edge));
            break;

    }
	double radius = sc.nextInt();
	System.out.println("radius is "+ radius);
    }

    public static double sphere(int radius){
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }

    public static double cube(int width){
        double volume = Math.pow(width, 3);
        return volume;
    }

    public static double tetrahedron(int edge){
        double volume = (Math.pow(edge, 3) / (6 * Math.sqrt(2)));
        return volume;
    }
}
