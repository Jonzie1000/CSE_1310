/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basiccalculator;

import java.util.Scanner;

public class BasicCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner bucky = new Scanner(System.in);
    double fnum, snum, answer;
    System.out.println("Enter first number: ");
    fnum = bucky.nextDouble();
    System.out.println("Enter second number: ");
    snum = bucky.nextDouble();
    answer = fnum + snum;
    System.out.println(answer);
    }
    
}
