/*This package includes java program to find max problem using generics
* Day 13 assignment RFP batch
* Author: Sarvesh pednekar*/

package com.bridgelabz.generics;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import java.util.Scanner;

public class Generics {
    static Logger logger = Logger.getLogger(Generics.class);
    static int max;     // Declaring static max variable

    /* Creating maxInteger method for finding max value from Integer array */
    public void maxInteger(Integer[] a) {
        // Using extended for loop for finding max integer
        for(int data : a) {
            if(data > max) {        //Assigning value to max if element of array is greater than max
                max = data;
            }
        }

        //Printing max value
        logger.info("Maximum number is: " + max);
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Generics generics = new Generics();     //Creating object of generics class
        Scanner sc = new Scanner(System.in);    //Creating Scanner object

        //Taking user input for number of elements in array
        logger.info("Enter number of elements in array: ");
        int n = sc.nextInt();

        Integer[] a = new Integer[n];       //Creating Integer object

        //for loop for initializing elements in array
        for(int i = 0; i < n; i++) {
            logger.info("Enter element in Index [" + i + "] : ");
            a[i] = sc.nextInt();
        }

        generics.maxInteger(a);     //Calling maxInteger method
    }
}
