/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;
/**
 *
 * @author Ezra loyd P. Gubantes
 */


//Problem 2: From Loop to Recursion
public class FromLoopToRecursion{

    public static void main(String[] args) {
        int[] a = {60, 75, 88, 74, 91};
        int[] b = {};
        int[] c = {70, 69, 80};

        System.out.println(countPassing(a, 75) + " " + countPassingRecursive(a, 75, 0));
        System.out.println(countPassing(b, 75) + " " + countPassingRecursive(b, 75, 0));
        System.out.println(countPassing(c, 70) + " " + countPassingRecursive(c, 70, 0));
    }

    public static int countPassing(int[] grades, int passingMark) {
        int c = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= passingMark) c++;
        }
        return c;
    }

    public static int countPassingRecursive(int[] grades, int passingMark, int index) {
        if (index == grades.length) return 0;
        if (grades[index] >= passingMark) {
            return 1 + countPassingRecursive(grades, passingMark, index + 1);
        }
        return countPassingRecursive(grades, passingMark, index + 1);
    }
}


//Q: What does each recursive call do to index, and why must it change?
//A: Each call adds 1 (index + 1) to check the next element and reach the base case; without changing it, it checks index 0 forever.


//Q: What happens if you delete the base case entirely?
//A: Without the base case, nothing will stop the method from trying to read the next slot even if it doesn't exist which causes the program to crash.