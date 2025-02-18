/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prelim;

/**
 *
 * @author User
 */


    public static void main(String[] args) {
        
        int first = 10; 
        
        int second = 4;
        
        int third = 6;

        // Perform calculations
        int result1 = first * second + third; // 10 * 4 + 6
        int result2 = (first - second) % third; // (10 - 4) % 6
        int result3 = (first + second + third) / 3; // (10 + 4 + 6) / 3
        int result4 = first * third - (second * second); // 10 * 6 - (4 * 4)

        // Display results
        System.out.println("Results:");
        System.out.println("10 * 4 + 6 = " + result1);
        System.out.println("(10 - 4) % 6 = " + result2);
        System.out.println("(10 + 4 + 6) / 3 = " + result3);
        System.out.println("10 * 6 - (4 * 4) = " + result4);

        
    }


