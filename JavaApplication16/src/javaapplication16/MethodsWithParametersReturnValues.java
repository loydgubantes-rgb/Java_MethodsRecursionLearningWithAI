/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;
/**
 *
 * @author Ezra loyd P. Gubantes
 */


//Problem 1: Methods with Parameters & Return Values
public class MethodsWithParametersReturnValues{

    public static void main(String[] args) {
        System.out.println("avg(5, 2)   = " + computeAverage(5, 2));   // 2.5
        System.out.println("avg(10, 0)  = " + computeAverage(10, 0));  // 0.0
        System.out.println("avg(100, 8) = " + computeAverage(100, 8)); // 12.5
        System.out.println("avg(7, 3)   = " + computeAverage(7, 3));   // 2.3333333333333335
    }

    public static double computeAverage(int total, int count) {
        if (count <= 0) {
            return 0.0;             // boundary guard
        }
        return (double) total / count;  // double division
    }
}



//Q:What does each recursive call do to index, and why must it change?
//A:total and count are integers, so Java cuts off the decimal (5 / 2 = 2). Casting (double) keeps the decimal (2.5).


//Q:What happens if you delete the base case entirely?
//A: Dividing a double by 0 silently outputs Infinity (or NaN) instead of 0.0.