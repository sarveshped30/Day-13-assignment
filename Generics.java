/* This package includes java program to find max problem using generics
* Day 13 assignment RFP batch
* Author: Sarvesh pednekar */

package com.bridgelabz.generics;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import java.util.Scanner;

public class Generics {
    static Logger logger = Logger.getLogger(Generics.class);
    Scanner sc = new Scanner(System.in);    //Creating Scanner object
    static int maxInteger;     // Declaring static max variable
    static float maxFloat;

    /* Creating maxInteger method for finding max value from Integer array */
    public void maxInteger(Integer[] a) {
        // Using extended for loop for finding max integer value
        for(int data : a) {
            if(data > maxInteger) {        //Assigning value to maxInteger if element of array is greater than maxInteger
                maxInteger = data;
            }
        }

        //Printing maxInteger value
        logger.info("Maximum integer value is: " + maxInteger + "\n");
    }

    /* Creating printMaxInteger method for taking user input and printing max value */
    public void printMaxInteger() {
        //Taking user input for number of elements in Integer array
        logger.info("Enter number of elements in Integer array: ");
        int n1 = sc.nextInt();

        Integer[] a = new Integer[n1];       //Creating Integer object with reference variable a

        //for loop for initializing elements in array
        for (int i = 0; i < n1; i++) {
            logger.info("Enter element in Index [" + i + "] : ");
            a[i] = sc.nextInt();
        }

        maxInteger(a);     //Calling maxInteger method
    }

    /* Creating maxFloat method for finding max value from float array */
    public void maxFloat(Float[] b) {
        // Using extended for loop for finding max float value
        for(float data : b) {
            if(data > maxFloat) {       //Assigning value to maxFloat if element in array is greater than maxFloat
                maxFloat =  data;
            }
        }

        //Printing maxFloat value
        logger.info("Maximum float value is: " + maxFloat + "\n");
    }

    /* Creating printMaxIFloat method for taking user input and printing max value */
    public void printMaxFloat() {
        //Taking user input for number of elements in Float array
        logger.info("Enter number of elements in Float array: ");
        int n2 = sc.nextInt();

        Float[] b = new Float[n2];       //Creating Integer object with reference variable a

        //for loop for initializing elements in array
        for (int i = 0; i < n2; i++) {
            logger.info("Enter element in Index [" + i + "] : ");
            b[i] = sc.nextFloat();
        }

        maxFloat(b);       //Calling maxFloat method
    }

    public void maxString(String[] c) {
        String maxString =  c[0];
        // Using extended for loop for finding max String value
        for(int i = 0; i < c.length; i++) {
            if(c[i].compareTo(maxString) > 1) {
                maxString = c[i];
            }
        }

        //Printing maxString value
        logger.info("Maximum String value is: " + maxString + "\n");
    }

    public void printMaxString() {
        //Taking user input for number of elements in String array
        logger.info("Enter number of elements in String array: ");
        int n3 = sc.nextInt();

        String[] c = new String[n3];       //Creating String object with reference variable a

        //for loop for initializing elements in array
        for (int i = 0; i < n3; i++) {
            logger.info("Enter element in Index [" + i + "] : ");
            c[i] = sc.next();
        }

        maxString(c);       //Calling maxFloat method
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Generics generics = new Generics();     //Creating object of generics class

        generics.printMaxInteger();     //Calling printMaxInteger function to print max value
        generics.printMaxFloat();       //Calling printMaxFloat function to print max value
        generics.printMaxString();      //Calling printMaxString function to print max value
    }
}
