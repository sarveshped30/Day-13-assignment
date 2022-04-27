/* This package includes java program to find max problem using generics
* Day 13 assignment RFP batch
* Author: Sarvesh pednekar */

package com.bridgelabz.generics;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class Generics <E extends Comparable<E>> {
    static Logger logger = Logger.getLogger(Generics.class);

    /* Creating variable x,y,z of generic data type */
    E x;
    E y;
    E z;

    /* Assigning value to x,y,z using parameterized constructor*/
    public Generics(E x, E y, E z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /* Creating Maximum method to find max value */
    public static <E extends Comparable<E>> void maximum(E x, E y, E z) {
        E max = x;      //Initializing 1st element as max

        /* Comparing max with each element using compareTo method and assigning value to max */
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0) {
            max = z;
        }
        printMax(x,y,z,max);        //Calling printMax method
    }

    /* Print max method for printing max element */
    private static <E extends Comparable<E>> void printMax(E x, E y, E z, E max) {
        logger.info("Maximum element from " + x + ", " + y + " and " + z + " is " + max );
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();

        // Creating objects for Integer, Float and String data type and giving parameters
        Integer xInt = 1, yInt = 4, zInt = 2;
        Float xFl = 1.02f, yFl = 2.56f, zFl = 1.25f;
        String xStr = "Sarvesh", yStr = "Vaibhav", zStr = "Romil";

        /* Note:
         Creating object for Generics class and giving array as input to parameterized constructor
         Generics myArray = new Generics<Integer>(a);        //Restricting only Integer data type
         Generics myArray = new Generics(b);      //This can take all types of data
         myArray.toPrint();     // calling toPrint method  */

        /* Printing max element from each data type */
        new Generics<String>(xStr, yStr, zStr).maximum(xStr, yStr, zStr);
        new Generics<Integer>(xInt,yInt,zInt).maximum(xInt,yInt,zInt);
        new Generics<Float>(xFl,yFl,zFl).maximum(xFl,yFl,zFl);
    }
}
