/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //User input//
     Scanner user_input = new Scanner(System.in);
     
     String asdf;
     
     String first_name;
     System.out.print("Please enter your first name: ");
     first_name = user_input.next();
     
     String last_name;
     System.out.print("Please enter your last name: ");
     last_name = user_input.next();
     
     String date,year;
     System.out.print("Please enter your date of birth (month, and day): ");
     date = user_input.next();
     
     System.out.print("Please enter your year of birth: ");
     year = user_input.next();
     asdf=user_input.next();
     int age;
     System.out.print("Please enter your age: ");
     age = user_input.nextInt();
     
     String favorite_color;
     System.out.print("Please enter your favorite color: ");
     favorite_color = user_input.next();
     
     final double martian_age= 0.530120481927711;
     double ma = martian_age*age;
     
     
    
     
     //Display message using user inputs, and left and right justifications//
     
     System.out.printf("Hi %-15s %20s! I am so glad that you used my application today. I see that your birthday\n  is %30s %s. You will be turning %-8s. That would make you %-12.2f on Mars! Looking\n good! I will make sure your birthday cake is %17s! I hope you have a wonderful day\n Mr./Mrs./Ms. %20s", first_name, last_name, date, year, age, ma, favorite_color, last_name);
     
     
     
     
    }
    
}
