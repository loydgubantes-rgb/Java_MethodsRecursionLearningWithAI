/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;
/**
 *
 * @author Ezra loyd P. Gubantes
 */

public class DebugTheAI{

    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(4));
    }

    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}


//Q:Why did one wrong return make every result wrong?
//A:very recursive call multiplies its number by the returned value below it, so returning 0 at the base case multiplies the whole chain by 0.


//Q:Stretch: what happens for factorial(-2) with your corrected code, and why?
//A:The program returns 1, because we have set a specific condition where n <= 0 instead of n == 0. Without it, subtracting 1 from -2 would go on forever since it will never reach 0.
